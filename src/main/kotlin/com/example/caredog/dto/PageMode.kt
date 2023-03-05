package com.example.caredog.dto

enum class PageMode(
    private val pagingStrategy: String
) {

    PAGINATION("pagenation"),
    INFINITE("infinite");

    companion object{

        @JvmStatic
        fun of(pageModeStr: String? = INFINITE.pagingStrategy): PageMode {

            return when {
                pageModeStr.equals(PAGINATION.pagingStrategy, true)
                -> PAGINATION
                else -> INFINITE
            }
        }
    }

}