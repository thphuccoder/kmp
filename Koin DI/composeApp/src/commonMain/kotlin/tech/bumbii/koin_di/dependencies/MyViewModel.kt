package tech.bumbii.koin_di.dependencies

import androidx.lifecycle.ViewModel

class MyViewModel(private val repository: BaseRepository): ViewModel() {
    fun getHelloWorldString(): String {
        return repository.helloWord()
    }
}