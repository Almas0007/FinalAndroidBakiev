package blim.enbek.talpynys.data.repository

import blim.enbek.talpynys.domain.model.Chapters
import blim.enbek.talpynys.domain.repository.ChaptersRepository

class ApiRepositoryImpl(private val apiService: ApiService):ChaptersRepository {
    override suspend fun getAllChapters(): Chapters {
        return this.apiService.getAllChapters()
    }

}