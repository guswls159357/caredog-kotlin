package com.example.caredog.dto

data class PageResDTO<T>(
    val pageInfo: PageInfo,
    val data: MutableList<T>
) {

}