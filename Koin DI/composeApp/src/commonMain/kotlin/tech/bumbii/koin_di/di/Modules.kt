package tech.bumbii.koin_di.di

import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module
import tech.bumbii.koin_di.dependencies.BaseRepository
import tech.bumbii.koin_di.dependencies.RepositoryImpl

val sharedModule = module {
    singleOf(::RepositoryImpl).bind<BaseRepository>()
}

expect val platformModule: Module