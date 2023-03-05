package com.example.caredog.entity

import jakarta.persistence.*

@Entity
@Table(name = "ARTICLES")
data class Article private constructor(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "번호")
    var id: Int?,
    @Column(name = "제목", nullable = false, columnDefinition = "VARCHAR(512)")
    var title: String,
    @Column(name = "본문", nullable = false, columnDefinition = "TEXT")
    var content: String,
    @Column(name = "글쓴이", nullable = false, updatable = false, columnDefinition = "VARCHAR(64)")
    var author: String,
    @Column(name = "조회", nullable = false, columnDefinition = "INT DEFAULT 0")
    var view: Int,
    @Column(name = "추천", nullable = false, columnDefinition = "INT DEFAULT 0")
    var like: Int
) : TimeEntity() {

    companion object {
        @JvmStatic
        fun of(title: String, content: String, author: String): Article {

            return Article(null, title, content, author,  0, 0)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Article

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id ?: 0
    }
}