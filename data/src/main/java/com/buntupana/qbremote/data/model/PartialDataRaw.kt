package com.buntupana.qbremote.data.model

data class PartialDataRaw(
    val rid: Int,
    val torrents: List<TorrentRaw>,
    val torrents_removed: List<String>,
    val categories: List<String>,
    val categories_removed: List<String>,
    val queueing: Boolean,
    val server_state: TransferInfoRaw
)