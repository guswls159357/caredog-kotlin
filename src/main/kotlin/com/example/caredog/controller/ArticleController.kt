package com.example.caredog.controller

import com.example.caredog.dto.*
import com.example.caredog.service.ArticleService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/articles")
@Validated
class ArticleController(val articleService: ArticleService) {

    @PostMapping
    fun createPost(@RequestBody articleReqDTO: ArticleReqDTO) : ResponseEntity<ArticleResDTO>{

        val articleDTO = articleService.createArticle(articleReqDTO.toArticleDTO())

        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(ArticleResDTO.from(articleDTO))
    }

    @GetMapping
    fun readArticles(pageReqDTO: PageReqDTO) : ResponseEntity<PageResDTO<ArticleResDTO>>{


        return ResponseEntity
            .ok()
            .body(null);
    }


}