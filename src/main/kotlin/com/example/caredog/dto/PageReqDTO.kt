package com.example.caredog.dto

data class PageReqDTO(
    private val pageModeStr: String?,
    val page: Int = 0,
    val perSize: Int = 10,
    val lastValue: String?,
    private val sortFieldStr: String?,
    private val sortDirStr: String?
) {
    val pageMode : PageMode = PageMode.of(pageModeStr)
    val sortField : Sort.Field = Sort.Field.of(sortFieldStr)
    val sortDirection : Sort.Direction = Sort.Direction.of(sortDirStr)

    fun isPagenation() : Boolean{

        return when (pageMode) {
            PageMode.PAGINATION -> true
            else -> false
        }
    }

    override fun toString(): String {
        return "PageReqDTO(page=$page, recordSize=$perSize, lastValue=$lastValue, pageMode=$pageMode, sortField=$sortField, sortDirection=$sortDirection)"
    }
}