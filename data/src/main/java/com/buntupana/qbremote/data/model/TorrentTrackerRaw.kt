package com.buntupana.qbremote.data.model

data class TorrentTrackerRaw(
    val msg: String,
    val num_peers: Int,
    val status: String,
    val url: String
)