package blim.enbek.talpynys.data.repository

import blim.enbek.talpynys.domain.model.Chapters
import retrofit2.http.GET

interface ApiService {
    @GET("chapters?language=en")
    suspend fun getAllChapters(): Chapters
}