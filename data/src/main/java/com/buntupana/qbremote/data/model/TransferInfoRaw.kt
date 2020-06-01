package com.buntupana.qbremote.data.model

data class TransferInfoRaw(
    val connection_status: String,
    val dht_nodes: Int,
    val dl_info_data: Int,
    val dl_info_speed: Int,
    val dl_rate_limit: Int,
    val up_info_data: Int,
    val up_info_speed: Int,
    val up_rate_limit: Int
)