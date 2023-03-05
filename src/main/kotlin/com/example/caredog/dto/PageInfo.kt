package com.example.caredog.dto

class PageInfo private constructor(
    val totalPage: Int,
    val size: Int,
    val page: Int,
    val prevPage: Int?,
    val nextPage: Int?,
    val sort: Sort.Field,
    val sortDirection: Sort.Direction
) {


    constructor(totalSize: Int, size: Int, perSize: Int, curPage: Int, sort: Sort.Field, sortDirection: Sort.Direction) : this(
        getTotalPage(totalSize, perSize),
        size,
        curPage,
        null,
        null,
        sort,
        sortDirection
    )

    companion object{

        @JvmStatic
        private fun getTotalPage(totalSize: Int, perSize: Int) : Int{

            return totalSize / perSize + when{
                totalSize % perSize > 0 -> 1
                else -> 0
            }
        }

    }


}