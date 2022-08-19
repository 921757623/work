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
class HomeScreenViewModel : ViewModel() {
    private val _holeList = MutableLiveData<List<Hole>>()

    val holeList: LiveData<List<Hole>> = _holeList

    init {
        getHomeScreenHoles()
    }

    private fun getHomeScreenHoles() {
        val currentTime = getCurrentTime()
        viewModelScope.launch{
            try {
                _holeList.value = HustHoleApi.retrofitService.getHoleList(currentTime)
            } catch (e: Exception) {
                _holeList.value = listOf()
                e.printStackTrace()
            }
        }
    }
    private fun getCurrentTime(): String {
        val date = Calendar.getInstance().time
        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA)
        return sdf.format(date).toString()
    }


}