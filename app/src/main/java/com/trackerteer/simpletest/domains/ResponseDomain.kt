package com.trackerteer.simpletest.domains

data class ResponseModel(
    val count: Long,
    val next: String,
    val previous: String? = null,
    val results: List<DataModel>
)

data class DataModel(
    val name: String,
    val url: String
)