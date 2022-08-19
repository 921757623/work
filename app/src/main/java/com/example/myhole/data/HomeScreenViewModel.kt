package com.example.myhole.data


import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myhole.network.HustHoleApi
import com.example.myhole.model.Hole
import com.example.myhole.model.Interact
import kotlinx.coroutines.launch
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*


/**
 *@classname HomeScreenViewModel
 * @description:
 * @date :2022/8/17 11:03
 * @version :1.0
 * @author
 */
enum class HustHoleApiStatus { LOADING, ERROR, DONE }

class HomeScreenViewModel : ViewModel() {
    private val _holeList = MutableLiveData<List<Hole>>()
    private val _status = MutableLiveData<HustHoleApiStatus>()

    val status: LiveData<HustHoleApiStatus> = _status
    val holeList: LiveData<List<Hole>> = _holeList

    init {
        getHomeScreenHoles()
    }

    fun getHomeScreenHoles() {
        val currentTime = getCurrentTime()
        _status.value = HustHoleApiStatus.LOADING
        viewModelScope.launch {
            try {
                _holeList.value = HustHoleApi.retrofitService.getHoleList(currentTime)
                _status.value = HustHoleApiStatus.DONE
            } catch (e: Exception) {
                _holeList.value = listOf()
                _status.value = HustHoleApiStatus.ERROR
                e.printStackTrace()
            }
        }
    }

//    fun getMoreHoles() {
//        val currentTime = getCurrentTime()
//        viewModelScope.launch {
//            try {
//
//            }
//        }
//    }

    private fun getCurrentTime(): String {
        val date = Calendar.getInstance().time
        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA)
        return sdf.format(date).toString()
    }


}