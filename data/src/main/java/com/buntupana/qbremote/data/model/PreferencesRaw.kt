package com.buntupana.qbremote.data.model

data class PreferencesRaw(
    val alt_dl_limit: Int,
    val alt_up_limit: Int,
    val anonymous_mode: Boolean,
    val autorun_enabled: Boolean,
    val autorun_program: String,
    val bypass_local_auth: Boolean,
    val dht: Boolean,
    val dhtSameAsBT: Boolean,
    val dht_port: Int,
    val dl_limit: Int,
    val dont_count_slow_torrents: Boolean,
    val download_in_scan_dirs: List<Boolean>,
    val dyndns_domain: String,
    val dyndns_enabled: Boolean,
    val dyndns_password: String,
    val dyndns_service: Int,
    val dyndns_username: String,
    val enable_utp: Boolean,
    val encryption: Int,
    val export_dir: String,
    val export_dir_enabled: Boolean,
    val incomplete_files_ext: Boolean,
    val ip_filter_enabled: Boolean,
    val ip_filter_path: Any,
    val limit_tcp_overhead: Boolean,
    val limit_utp_rate: Boolean,
    val listen_port: Int,
    val locale: String,
    val lsd: Boolean,
    val mail_notification_auth_enabled: Boolean,
    val mail_notification_email: String,
    val mail_notification_enabled: Boolean,
    val mail_notification_password: String,
    val mail_notification_smtp: String,
    val mail_notification_ssl_enabled: Boolean,
    val mail_notification_username: String,
    val max_active_downloads: Int,
    val max_active_torrents: Int,
    val max_active_uploads: Int,
    val max_connec: Int,
    val max_connec_per_torrent: Int,
    val max_uploads_per_torrent: Int,
    // API 3
    val max_uploads: Int?,
    // API 3
    val max_ratio_enabled: Boolean?,
    // API 3
    val max_ratio: Float?,
    // API 3
    val max_ratio_act: Boolean?,
    // API 3
    val random_port: Boolean?,
    val pex: Boolean,
    val preallocate_all: Boolean,
    val proxy_auth_enabled: Boolean,
    val proxy_ip: String,
    val proxy_password: String,
    val proxy_peer_connections: Boolean,
    val proxy_port: Int,
    val proxy_type: Int,
    val proxy_username: String,
    val queueing_enabled: Boolean,
    val save_path: String,
    val scan_dirs: List<String>,
    val schedule_from_hour: Int,
    val schedule_from_min: Int,
    val schedule_to_hour: Int,
    val schedule_to_min: Int,
    val scheduler_days: Int,
    val scheduler_enabled: Boolean,
    val ssl_cert: String,
    val ssl_key: String,
    val temp_path: String,
    val temp_path_enabled: Boolean,
    val up_limit: Int,
    val upnp: Boolean,
    val use_https: Boolean,
    val web_ui_password: String,
    val web_ui_port: Int,
    val web_ui_username: String
)