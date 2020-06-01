package com.buntupana.qbremote.data.api.legacy

import io.reactivex.rxjava3.core.Observable
import okhttp3.MultipartBody
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface LegacyPostApi {

    @Multipart
    @POST("command/download")
    fun downloadTorrentFromUrl(
        @Part("urls") urls: String,
        @Part("savepath") savePath: String = "",
        @Part("cookie") cookie: String = "",
        @Part("rename") rename: String = "",
        @Part("upLimit") upLimit: Int = 0,
        @Part("dlLimit") dlLimit: Int = 0,
        @Part("sequentialDownload") sequentialDownload: Boolean = false,
        @Part("firstLastPiecePrio") firstLastPiecePrio: Boolean = false
    ): Observable<String>


    @Multipart
    @POST("command/download")
    fun downloadTorrentFromFile(
        @Part torrents: MultipartBody.Part,
        @Part("savepath") savePath: String = "",
        @Part("cookie") cookie: String = "",
        @Part("rename") rename: String = "",
        @Part("upLimit") upLimit: Int = 0,
        @Part("dlLimit") dlLimit: Int = 0,
        @Part("sequentialDownload") sequentialDownload: Boolean = false,
        @Part("firstLastPiecePrio") firstLastPiecePrio: Boolean = false
    ): Observable<String>

    @Multipart
    @POST("command/pause")
    fun pauseTorrent(
        @Part("hash") hash: String
    ): Observable<String>

    @Multipart
    @POST("command/pauseAll")
    fun pauseAllTorrents(): Observable<String>

    @Multipart
    @POST("command/resume")
    fun resumeTorrent(
        @Part("hash") hash: String
    ): Observable<String>

    @Multipart
    @POST("command/resumeAll")
    fun resumeAllTorrents(): Observable<String>

    /**
     * @param hashes can contain multiple hashes separated by |
     */
    @Multipart
    @POST("command/delete")
    fun deleteTorrent(
        @Part("hashes") hashes: String
    ): Observable<String>

    /**
     * @param hashes can contain multiple hashes separated by |
     */
    @Multipart
    @POST("command/deletePerm")
    fun deleteTorrentWithDownloadedData(
        @Part("hashes") hashes: String
    ): Observable<String>

    @Multipart
    @POST("command/recheck")
    fun recheckTorrent(
        @Part("hash") hash: String
    ): Observable<String>

    /**
     * @param hashes can contain multiple hashes separated by |
     */
    @Multipart
    @POST("command/increasePrio")
    fun increaseTorrentPriority(
        @Part("hashes") hashes: String
    ): Observable<String>

    /**
     * @param hashes can contain multiple hashes separated by |
     */
    @Multipart
    @POST("command/decreasePrio")
    fun decreaseTorrentPriority(
        @Part("hashes") hashes: String
    ): Observable<String>

    /**
     * @param hashes contain multiple hashes separated by |
     */
    @Multipart
    @POST("command/topPrio")
    fun maximalTorrentPriority(
        @Part("hashes") hashes: String
    ): Observable<String>

    /**
     * @param hashes contain multiple hashes separated by |
     */
    @Multipart
    @POST("command/bottomPrio")
    fun minimalTorrentPriority(
        @Part("hashes") hashes: String
    ): Observable<String>

    @POST("command/getGlobalDlLimit")
    fun fetchGlobalDownloadLimit(): Observable<Int>

    @Multipart
    @POST("command/setGlobalDlLimit")
    fun setGlobalDownloadLimit(
        @Part("limit") limit: Int
    ): Observable<String>

    @POST("command/getGlobalUpLimit")
    fun fetchGlobalUploadLimit(): Observable<Int>

    @Multipart
    @POST("command/setGlobalUpLimit")
    fun setGlobalUploadLimit(
        @Part("limit") limit: Int
    ): Observable<String>

    /**
     * @param hashes contain multiple hashes separated by |
     */
    @Multipart
    @POST("command/getTorrentsDlLimit")
    fun fetchTorrentDownloadLimit(
        @Part("hashes") hashes: String
    ): Observable<Map<String, Int>>

    /**
     * @param hashes contain multiple hashes separated by |
     * @param limit limit is the download speed limit in bytes per second you want to set.
     */
    @Multipart
    @POST("command/setTorrentsDlLimit")
    fun setTorrentDownloadLimit(
        @Part("hashes") hashes: String,
        @Part("limit") limit: Int
    ): Observable<String>

    /**
     * @param hashes contain multiple hashes separated by |
     */
    @Multipart
    @POST("command/getTorrentsUpLimit")
    fun fetchTorrentUploadLimit(
        @Part("hashes") hashes: String
    ): Observable<Map<String, Int>>

    /**
     * @param hashes contain multiple hashes separated by |
     * @param limit limit is the upload speed limit in bytes per second you want to set.
     */
    @Multipart
    @POST("command/setTorrentsUpLimit")
    fun setTorrentUploadLimit(
        @Part("hashes") hashes: String,
        @Part("limit") limit: Int
    ): Observable<String>

    /**
     * @param hashes contain multiple hashes separated by |
     * @param location is the location to download the torrent to. If the location doesn't exist,
     * the torrent's location is unchanged.
     */
    @Multipart
    @POST("command/setLocation")
    fun setTorrentLocation(
        @Part("hashes") hashes: String,
        @Part("location") location: String
    ): Observable<String>

    @Multipart
    @POST("command/rename")
    fun setTorrentName(
        @Part("hash") hash: String,
        @Part("name") name: String
    ): Observable<String>

    /**
     * @param hashes contain multiple hashes separated by |
     * @param category is the torrent category you want to set. If the category doesn't exist,
     * a new category is created.
     */
    @Multipart
    @POST("command/setCategory")
    fun setTorrentCategory(
        @Part("hashes") hashes: String,
        @Part("category") category: String
    ): Observable<String>

    /**
     * @param category is the category you want to create.
     */
    @Multipart
    @POST("command/addCategory")
    fun addCategory(
        @Part("category") category: String
    ): Observable<String>

    /**
     * @param categories can contain multiple cateogies separated by \n (%0A urlencoded)
     */
    @Multipart
    @POST("command/removeCategories")
    fun removeCategories(
        @Part("categories") categories: String
    ): Observable<String>

    /**
     * @param hashes contain multiple hashes separated by |
     * @param enable is a boolean, affects the torrents listed in hashes, default is false
     */
    @Multipart
    @POST("command/setAutoTMM")
    fun setAutoTorrentManagement(
        @Part("hashes") hashes: String,
        @Part("enable") enable: Boolean = false
    ): Observable<String>


    /**
     * Set qBittorrent preferences
     * For a list of possible preference options see https://github.com/qbittorrent/qBittorrent/wiki/WebUI-API-Documentation#get-qbittorrent-preferences
     *
     * @param json preferences in a json format {"token": "value"}
     */
    @Multipart
    @POST("command/setPreferences")
    fun setPreferences(
        @Part("json") json: String
    ): Observable<String>

    /**
     * Get alternative speed limits state
     */
    @POST("command/alternativeSpeedLimitsEnabled")
    fun fetchAlternativeSpeedLimitsState(): Observable<Int>

    /**
     * Toggle alternative speed limits
     */
    @POST("command/toggleAlternativeSpeedLimits")
    fun toggleAlternativeSpeedLimits(): Observable<String>

    /**
     * Toggle sequential download
     * @param hashes contain multiple hashes separated by |
     */
    @Multipart
    @POST("command/toggleSequentialDownload")
    fun toggleSequentialDownload(
        @Part("hashes") hashes: String
    ): Observable<String>

    /**
     * Set first/last piece priority
     * @param hashes contain multiple hashes separated by |
     */
    @Multipart
    @POST("command/toggleFirstLastPiecePrio")
    fun toggleFirstLastPiecePriority(
        @Part("hashes") hashes: String
    ): Observable<String>
}