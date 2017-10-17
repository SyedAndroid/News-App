





GitHub Username: googlite123

Newsbits 
Description 

In today’s world where there are so many sources(Eg. BBC, ESPN, TechCrunch) of information in such different areas (Politics, technology and so on) that going to each source is very time consuming,  it would be easier to have a app where all these sources and areas that interests the user could be at one single place. 


Intended User

Who is your intended user? (For example, is this an app for dog owners? Families? Students? Travelers?)
This app is for news readers who wants to be updated with the current events

Features

The Main features of app are :
Customized news feeds from different sources 
Able to save and access favourite articles
Able to share and visit the links to the articles
Secure login using google sign in



Widget News Mockup
Key Considerations

How will your app handle data persistence? 

The app will use Content Provider to save the sources and categories the user is interested in to provide customized information. Content Library will be implemented using SQLite.

Describe any edge or corner cases in the UX.


When the user wants to change the categories and sources after initial login, settings menu has to be set up for the user and resulting changes has to be displayed when the user returns to the home screen.

Describe any libraries you’ll be using and share your reasoning for including them.
 Picasso to change the pictures size to fit into the thumbnails and make the user experience smooth.

Describe how you will implement Google Play Services or other external services.

App will support google sign in and Google demo ads support. 
When the user signs in after install, the app will display a sign in option to support google account. When the user successfully logs in , he will be able to customize the user experience.

When a detail article link is opened the Google ads will be displayed to the user using the demo ads.


Next Steps: Required Tasks

This is the section where you can take the main features of your app (declared above) and break them down into tangible technical tasks that you can complete one at a time until you have a finished app.

Task 1: Project Setup

The following are the subtasks for the app
Configure libraries in gradle
Configure google signin
Configure minimum api to support
Configure the api key and account on NewsApi
Task 2: Implement UI for Each Activity and Fragment

Build UI for MainActivity
Build UI for SettingActivity
Build UI for DetailArticle
Build UI for NavigationLayout
Build UI for TabLayout using Viewpager

Task 3: Implement Google Sign in


Describe the next task. List the subtasks. For example:
Implement Google Sign in 
Extend the Main class to support sign in, OnConnected, RetryConnection Options
Manage Error cases

 


Task 4: Set up Navigation Drawer Layout 

Navigation Drawer should be setup with links to different activities. Setup a listener when the user clicks these and start an intent to that activity. 
Listener
Close drawer
Open drawer
Send Intent



Task 5: Setup Utility Classes for Network Handling 

Setup Classes to make network request using Scanner and InputStream libraries. Return the results in the form of strings

Manage connections
Use scanners to decode the stream to strings
Return the result and disconnect
Task 6: Setup JSON Parsing Classes for Network Stream data 

Set up classes to decode the stream of sting that has passed from the Network Util and put it in appropriate objects and returns the list of objects.
Decode Source data
Decode Categories data
Decode Articles data
Task 7: Setup the Content Resolver to support Persistent Data 

Setup Content Resolver to store sources , categories the user has selected and favourite articles using SQLite
Create Contract class
Create Provider class
Create Resolver class


Task 8: Setup ViewPager Tablayout using Fragments

Setp Tablayout class using the viewpager fragments that are scrollable. Each category should become a single tab. And all the sources should be requested for data and applied
Tablayout layout
Viewpager setup
Fragment Setup
Recycleview to display articles

Task 9: Setup LoaderManager classes for Async Network Requests 

Loader Manager classes to make async network request 
LoaderManager classes setup
Setup OnLoadFinish and onLoadReset funtions 

Task 10: Setup user desired categories and sources 

Request users to select the desired categories and sources and store them in the database using content resolver
Setup available categories
Setup sources based on categories
Task 11: Setup Settings Activity using SharedPreferences

After initial setup user should be able to make changes to the categories and sources using settings activity
Setup Shared Preferences
Setup switches to each categories
Delete or Add categories based on changes
Delete or Add sources based on changes

Task 12: Setup Material Design for UI 

Change the UI based on Material Design specifications
Change Elevations
Change colors
Change fonts for better readability
Change margins

Task 13: Setup Google Ads support using demo ads 
Add google ads in Detail article activities

Task 14: Setup Transitions between Activities 
Setup Transitions using shared element activity between article list and detail activity pages

Task 15: Add support to accessibility 
Add support to accessibility using description and Dpad support

Task 16: Setup Keystore 
Setip keystore and Passwords 

Task 17: Setup widget to provide snippets using SharedPreference 
Setup widgets using shared preference and user desired categories
Design App widget layout
Setup widget class that displays list of titles using lIstView for each category. User should be able to press a button and go to next category
Task 18: SwipeRefreshLayout will be implemented on Articles RecycleView
When user pulls the activities recycleView a Intent Service is started which resets the data with new Article data. 




