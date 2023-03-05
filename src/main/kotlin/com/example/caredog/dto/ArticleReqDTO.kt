package com.example.caredog.dto

import jakarta.validation.constraints.NotBlank


data class ArticleReqDTO private constructor(
    @field: NotBlank(message = "제목은 필수 값 입니다.")
    private val title : String,
    @field: NotBlank(message = "내용은 필수 값 입니다.")
    private val content: String,
    @field: NotBlank(message = "작성자는 필수 값 입니다.")
    private val author: String
) {
    fun toArticleDTO() : ArticleDTO{

        return ArticleDTO.of(null, title, content, author, null, null, null)
    }
}