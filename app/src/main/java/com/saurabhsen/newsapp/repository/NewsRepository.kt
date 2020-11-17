package com.saurabhsen.newsapp.repository

import com.saurabhsen.newsapp.api.RetrofitInstance
import com.saurabhsen.newsapp.db.ArticleDatabase
import com.saurabhsen.newsapp.model.Article

class NewsRepository(private val db: ArticleDatabase) {

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()
    
    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)

}