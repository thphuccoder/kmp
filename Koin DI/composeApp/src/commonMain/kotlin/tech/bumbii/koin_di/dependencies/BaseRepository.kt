package tech.bumbii.koin_di.dependencies

interface BaseRepository {
    fun helloWord(): String
}

class RepositoryImpl : BaseRepository {
    override fun helloWord(): String {
        return "Hello from RepositoryImpl"
    }

}