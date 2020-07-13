package com.joshuacerdenia.android.nicefeed.utils

import android.util.Log

object BackupUrls {

    private const val COUNTER_MAX = 4
    private var attemptCount = 0

    private var url: String? = null // Base URL
    private var urlPlusFeed: String? = null
    private var urlPlusRss: String? = null
    private var urlPlusRssXml: String? = null

    fun get(): String? {
        Log.d("FeedParser", "Backup URL tried, count: $attemptCount")

        return when (attemptCount) {
            0 -> url
            1 -> urlPlusFeed
            2 -> urlPlusRss
            3 -> urlPlusRssXml
            else -> {
                attemptCount = 0
                setBase(null)
                null
            }
        }
    }

    fun setBase(url: String?) {
        BackupUrls.url = url

        if (url != null) {
            urlPlusFeed = "$url/feed"
            urlPlusRss = "$url/rss"
            urlPlusRssXml = "$url/rss.xml"
            // Expandable to other possible suffixes, just increase max count

        } else {
            urlPlusFeed = null
            urlPlusRss = null
            urlPlusRssXml = null
            attemptCount = 0
        }
    }

    fun countUp() {
        attemptCount += 1
        if (attemptCount == COUNTER_MAX) {
            attemptCount = 0
            setBase(null)
        }
    }
}