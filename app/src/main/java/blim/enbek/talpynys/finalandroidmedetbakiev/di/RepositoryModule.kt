package blim.enbek.talpynys.finalandroidmedetbakiev.di

import blim.enbek.talpynys.data.repository.ApiRepositoryImpl
import blim.enbek.talpynys.data.repository.ApiService
import blim.enbek.talpynys.domain.repository.ChaptersRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    fun provideRepository(apiService: ApiService):ChaptersRepository{
        return ApiRepositoryImpl(apiService)
    }
}