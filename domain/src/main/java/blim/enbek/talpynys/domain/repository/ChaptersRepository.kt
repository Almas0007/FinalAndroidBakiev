package blim.enbek.talpynys.domain.repository

import blim.enbek.talpynys.domain.model.Chapters

interface ChaptersRepository {
        suspend fun getAllChapters():Chapters
}