# News App

* This is simple app made in Kotlin in which user can browse through the news. 

* User can save the article which is important to him/her.

* User can even search for the topic in which he/she is interested like science and technology, sports, politics etc.

* This app is created with the help of News API  (https://newsapi.org/)


# Project Structure

    📦src
    ┣ 📂androidTest
    ┃ ┗ 📂java
    ┃ ┃ ┗ 📂com
    ┃ ┃ ┃ ┗ 📂saurabhsen
    ┃ ┃ ┃ ┃ ┗ 📂newsapp
    ┃ ┃ ┃ ┃ ┃ ┗ 📜ExampleInstrumentedTest.kt
    ┣ 📂main
    ┃ ┣ 📂java
    ┃ ┃ ┗ 📂com
    ┃ ┃ ┃ ┗ 📂saurabhsen
    ┃ ┃ ┃ ┃ ┗ 📂newsapp
    ┃ ┃ ┃ ┃ ┃ ┣ 📂adapters
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜NewsAdapter.kt
    ┃ ┃ ┃ ┃ ┃ ┣ 📂api
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜NewsAPI.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜RetrofitInstance.kt
    ┃ ┃ ┃ ┃ ┃ ┣ 📂db
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ArticleDao.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ArticleDatabase.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Converters.kt
    ┃ ┃ ┃ ┃ ┃ ┣ 📂model
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Article.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜NewsResponse.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Source.kt
    ┃ ┃ ┃ ┃ ┃ ┣ 📂repository
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜NewsRepository.kt
    ┃ ┃ ┃ ┃ ┃ ┣ 📂ui
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂fragments
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ArticleFragment.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BreakingNewsFragment.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MainActivity.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SavedNewsFragment.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SearchNewsFragment.kt
    ┃ ┃ ┃ ┃ ┃ ┣ 📂utils
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Constants.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Resource.kt
    ┃ ┃ ┃ ┃ ┃ ┗ 📂viewmodel
    ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜NewsViewModel.kt
    ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜NewsViewModelProviderFactory.kt
    ┃ ┣ 📂res
    ┃ ┃ ┣ 📂anim
    ┃ ┃ ┃ ┣ 📜slide_in_left.xml
    ┃ ┃ ┃ ┣ 📜slide_in_right.xml
    ┃ ┃ ┃ ┣ 📜slide_out_left.xml
    ┃ ┃ ┃ ┗ 📜slide_out_right.xml
    ┃ ┃ ┣ 📂drawable
    ┃ ┃ ┃ ┣ 📜ic_all_news.xml
    ┃ ┃ ┃ ┣ 📜ic_breaking_news.xml
    ┃ ┃ ┃ ┣ 📜ic_favorite.xml
    ┃ ┃ ┃ ┗ 📜ic_launcher_background.xml
    ┃ ┃ ┣ 📂drawable-v24
    ┃ ┃ ┃ ┗ 📜ic_launcher_foreground.xml
    ┃ ┃ ┣ 📂layout
    ┃ ┃ ┃ ┣ 📜activity_main.xml
    ┃ ┃ ┃ ┣ 📜fragment_article.xml
    ┃ ┃ ┃ ┣ 📜fragment_breaking_news.xml
    ┃ ┃ ┃ ┣ 📜fragment_saved_news.xml
    ┃ ┃ ┃ ┣ 📜fragment_search_news.xml
    ┃ ┃ ┃ ┗ 📜item_article_preview.xml
    ┃ ┃ ┣ 📂menu
    ┃ ┃ ┃ ┗ 📜bottom_menu.xml
    ┃ ┃ ┣ 📂mipmap-anydpi-v26
    ┃ ┃ ┃ ┣ 📜ic_launcher.xml
    ┃ ┃ ┃ ┗ 📜ic_launcher_round.xml
    ┃ ┃ ┣ 📂mipmap-hdpi
    ┃ ┃ ┃ ┣ 📜ic_launcher.png
    ┃ ┃ ┃ ┗ 📜ic_launcher_round.png
    ┃ ┃ ┣ 📂mipmap-mdpi
    ┃ ┃ ┃ ┣ 📜ic_launcher.png
    ┃ ┃ ┃ ┗ 📜ic_launcher_round.png
    ┃ ┃ ┣ 📂mipmap-xhdpi
    ┃ ┃ ┃ ┣ 📜ic_launcher.png
    ┃ ┃ ┃ ┗ 📜ic_launcher_round.png
    ┃ ┃ ┣ 📂mipmap-xxhdpi
    ┃ ┃ ┃ ┣ 📜ic_launcher.png
    ┃ ┃ ┃ ┗ 📜ic_launcher_round.png
    ┃ ┃ ┣ 📂mipmap-xxxhdpi
    ┃ ┃ ┃ ┣ 📜ic_launcher.png
    ┃ ┃ ┃ ┗ 📜ic_launcher_round.png
    ┃ ┃ ┣ 📂navigation
    ┃ ┃ ┃ ┗ 📜my_nav.xml
    ┃ ┃ ┣ 📂values
    ┃ ┃ ┃ ┣ 📜colors.xml
    ┃ ┃ ┃ ┣ 📜strings.xml
    ┃ ┃ ┃ ┗ 📜themes.xml
    ┃ ┃ ┗ 📂values-night
    ┃ ┃ ┃ ┗ 📜themes.xml
    ┃ ┗ 📜AndroidManifest.xml
    ┗ 📂test
    ┃ ┗ 📂java
    ┃ ┃ ┗ 📂com
    ┃ ┃ ┃ ┗ 📂saurabhsen
    ┃ ┃ ┃ ┃ ┗ 📂newsapp
    ┃ ┃ ┃ ┃ ┃ ┗ 📜ExampleUnitTest.kt


# App Images 

![App Image](https://github.com/saurabhsen24/NewsApp/blob/master/AppImages/News6.jpg?raw=true)

![App Image](https://github.com/saurabhsen24/NewsApp/blob/master/AppImages/News4.jpg?raw=true)

![App Image](https://github.com/saurabhsen24/NewsApp/blob/master/AppImages/News3.jpg?raw=true)

![App Image](https://github.com/saurabhsen24/NewsApp/blob/master/AppImages/News1.jpg?raw=true) 

![App Image](https://github.com/saurabhsen24/NewsApp/blob/master/AppImages/News5.jpg?raw=true)
