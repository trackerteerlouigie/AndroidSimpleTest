package com.trackerteer.simpletest.network.response

import com.trackerteer.simpletest.domains.DataModel
import com.trackerteer.simpletest.domains.ResponseModel

data class ResponseNetwork(
    val count: Long,
    val next: String,
    val previous: String? = null,
    val results: List<DataNetwork>
)

fun ResponseNetwork.asDomainModel(): ResponseModel {
    return ResponseModel(
        count = count,
        next = next,
        previous = previous,
        results = results.map { it.asDomainModel() }
    )
}

data class DataNetwork(
    val name: String,
    val url: String
)

fun DataNetwork.asDomainModel(): DataModel {
    return DataModel(name = name, url = url)
}