package com.buntupana.qbremote.data.model

data class TorrentContentRaw(
    val is_seed: Boolean,
    val name: String,
    val piece_range: List<Int>,
    val priority: Int,
    val progress: Float,
    val size: Int
)