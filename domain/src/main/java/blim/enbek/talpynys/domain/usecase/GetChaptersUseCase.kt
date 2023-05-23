package blim.enbek.talpynys.domain.usecase

import blim.enbek.talpynys.domain.repository.ChaptersRepository

class GetChaptersUseCase(private val chaptersRepository: ChaptersRepository) {
    suspend operator fun invoke() = chaptersRepository.getAllChapters()
}