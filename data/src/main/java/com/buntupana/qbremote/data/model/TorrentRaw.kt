package com.buntupana.qbremote.data.model

data class TorrentRaw(
    val category: String,
    val dlspeed: Int,
    val eta: Int,
    val f_l_piece_prio: Boolean,
    val force_start: Boolean,
    val hash: String,
    val name: String,
    val num_complete: Int,
    val num_incomplete: Int,
    val num_leechs: Int,
    val num_seeds: Int,
    val priority: Int,
    val progress: Double,
    val ratio: Int,
    val seq_dl: Boolean,
    val size: Int,
    // TODO: will require a enum class
    val state: String,
    val super_seeding: Boolean,
    val upspeed: Int
)