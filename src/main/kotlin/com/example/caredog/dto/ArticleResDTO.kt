package com.example.caredog.dto

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class ArticleResDTO private constructor(
    val id: Int,
    val title: String,
    val content: String,
    val author: String,
    val createdAt: String,
    val view: Int,
    val like: Int
) {

    companion object {
        @JvmStatic
        fun from(articleDTO: ArticleDTO): ArticleResDTO {
            return ArticleResDTO(
                articleDTO.id!!,
                articleDTO.title,
                articleDTO.content,
                articleDTO.author,
                articleDTO.createdAt!!
                    .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")),
                articleDTO.view!!,
                articleDTO.like!!
            )
        }
    }
}