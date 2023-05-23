package blim.enbek.talpynys.finalandroidmedetbakiev.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import blim.enbek.talpynys.domain.model.Chapters
import blim.enbek.talpynys.domain.usecase.GetChaptersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainFragmentViewModel @Inject constructor(private val getChaptersUseCase: GetChaptersUseCase):ViewModel() {

    private val _chapters = MutableLiveData<Chapters?>()
    val chapters : LiveData<Chapters?>
    get()= _chapters


    private fun getChapters(){
        viewModelScope.launch {
            try {
                _chapters.postValue(getChaptersUseCase())
            }catch (e:java.lang.Exception){
                Log.d("AAA", e.message.toString())
            }
        }
    }
}