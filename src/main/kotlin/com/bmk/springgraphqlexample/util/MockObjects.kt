package com.bmk.springgraphqlexample.util

import com.bmk.springgraphqlexample.model.Author
import com.bmk.springgraphqlexample.model.Book

fun getBook(id: Long): Book {
    return listOf(
        Book(
            id = 1L,
            name = "In Dubious Battle",
            author = getAuthor(10L),
            pageSize = 300
        ),
        Book(
            id = 2L,
            name = "The Origin of Species",
            author = getAuthor(20L),
            pageSize = 500
        )
    ).filter { it.id == id }[0]
}

fun getAuthor(id: Long): Author {
    return listOf(
        Author(
            id = 10L,
            firstName = "John",
            lastName = "Steinbeck"
        ),
        Author(
            id = 20L,
            firstName = "Charles",
            lastName = "Darwin"
        )
    ).filter { it.id == id }[0]
}