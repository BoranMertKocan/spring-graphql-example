package com.bmk.springgraphqlexample.model

data class Book(
    val id: Long,
    val name: String,
    val pageSize: Int,
    val author: Author
)
