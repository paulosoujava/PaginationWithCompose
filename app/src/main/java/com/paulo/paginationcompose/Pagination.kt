package com.paulo.paginationcompose

interface Pagination<key, Item> {
   suspend fun loadNextItems()
    suspend fun reset()
}