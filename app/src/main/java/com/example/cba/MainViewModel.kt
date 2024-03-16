package com.example.cba

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cba.Data.ApiDataItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel:ViewModel() {

    private val _data = MutableStateFlow<List<ApiDataItem>?>(null)
    val data: StateFlow<List<ApiDataItem>?> = _data.asStateFlow()

    init {
        viewModelScope.launch {
            try {
                val data = RetrofitClient.getApiService().getData()
                _data.value = data
                Log.i("Data Fetched", "Data:")
            }
            catch (e:Exception){
                Log.i("Exception",e.toString())
            }

        }
    }


}

