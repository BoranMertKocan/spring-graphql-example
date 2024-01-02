package com.bmk.springgraphqlexample.controller

import com.bmk.springgraphqlexample.model.Book
import com.bmk.springgraphqlexample.util.getBook
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller


@Controller
class BookController {

    @QueryMapping
    fun bookById(@Argument id: Long): Book {
        return getBook(id)
    }
}