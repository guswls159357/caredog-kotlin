package com.example.caredog.service

import com.example.caredog.dto.*
import com.example.caredog.repository.ArticleRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
@Service
class ArticleService(val articleRepository: ArticleRepository) {

    @Transactional
    fun createArticle(articleDTO: ArticleDTO): ArticleDTO {

        val createdArticle = articleRepository.save(articleDTO.toEntity())

        return ArticleDTO.of(createdArticle)
    }

    // TODO: return type 변경
    fun readArticles(pageReqDTO: PageReqDTO): PageResDTO<ArticleResDTO>? {

        if (pageReqDTO.isPagenation()) {

        } else {

        }

        return null;
    }
}