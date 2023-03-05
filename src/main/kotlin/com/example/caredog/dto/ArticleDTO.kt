package com.example.caredog.dto

import com.example.caredog.entity.Article
import java.time.LocalDateTime

data class ArticleDTO private constructor(
    val id: Int?,
    val title: String,
    val content: String,
    val author: String,
    val createdAt: LocalDateTime?,
    val view: Int?,
    val like: Int?
) {

    companion object {

        @JvmStatic
        fun of(id: Int?, title: String, content: String, author: String, createdAt: LocalDateTime?, view: Int?, like: Int?): ArticleDTO {
            return ArticleDTO(
                id, title, content, author, createdAt, view, like
            )
        }

        @JvmStatic
        fun of(article: Article): ArticleDTO {
            return ArticleDTO.of(
                article.id!!,
                article.title,
                article.content,
                article.author,
                article.createdAt!!,
                article.view,
                article.like
            )
        }
    }

    fun toEntity() : Article{

        return Article.of(title, content, author)
    }

}