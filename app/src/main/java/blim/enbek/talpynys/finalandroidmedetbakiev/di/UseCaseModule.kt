package blim.enbek.talpynys.finalandroidmedetbakiev.di

import blim.enbek.talpynys.domain.repository.ChaptersRepository
import blim.enbek.talpynys.domain.usecase.GetChaptersUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun providesUseCase(chaptersRepository:ChaptersRepository):GetChaptersUseCase{
        return GetChaptersUseCase(chaptersRepository)
    }
}