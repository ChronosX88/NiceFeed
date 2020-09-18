# NiceFeed
NiceFeed is an RSS Reader for Android. I wanted something to help me keep up with the news while learning Kotlin at the same time. RSS is an old technology and there are already many readers out there, but I find many of them clunky, hard to navigate, and jam-packed with features I don't need. The aim is a nimble but fully functional app with not too many frills.

<b>Early Access – Sept 19, 2020</b><br>
Now in Beta and available on Google Play!<br>
<a href='https://play.google.com/store/apps/details?id=com.joshuacerdenia.android.nicefeed&pcampaignid=pcampaignidMKT-Other-global-all-co-prtnr-py-PartBadge-Mar2515-1'><img alt='Get it on Google Play' width="250" src='https://play.google.com/intl/en_us/badges/static/images/badges/en_badge_web_generic.png'/></a>

<b>Update – Sept 8, 2020</b><br>
In the last couple of weeks I've found it useful to rewrite much of the existing code and to get it somewhat closer to the MVVM pattern, i.e., moving all "business logic" to View Models, resulting in more manageable, reactive, and less finicky UI code. This has been helpful in implementing some new features, such as a drop-down items in the drawer menu, as well as easier sorting and filtering of entries in the main screeen. A first release should not be too far in the future.<br>

New screenshots:<br><br>
<img width="250" src="Screenshot-1.jpg"> <img width="250" src="Screenshot-2.jpg"> <img width="250" src="Screenshot-3.jpg">

<h3>Features</h3>
<ul>
  <li>RSS parsing provided by <a href="https://github.com/prof18/RSS-Parser">RSS Parser</a></li>
  <li>Search engine powered by <a href="https://developer.feedly.com/v3/search/">Feedly Search API</a></li>
  <li>OPML support (importing and exporting) provided by <a href="https://github.com/rometools/rome">Rome Tools</a>
  <li>Ability to organize feeds by category</li>
  <li>Star/unstar and mark entries as read/unread</li>
</ul>
