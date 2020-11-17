package com.saurabhsen.newsapp.utils

import com.saurabhsen.newsapp.BuildConfig

class Constants {
    companion object {
        const val API_KEY = BuildConfig.NEWS_API_KEY
        const val BASE_URL = "https://newsapi.org"
        const val SEARCH_NEWS_TIME_DELAY = 500L
        const val QUERY_PAGE_SIZE = 20
    }
}