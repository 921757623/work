package com.example.myhole.network


import com.example.myhole.model.Hole
import com.example.myhole.model.InteractFollow
import com.example.myhole.model.InteractLikeOrUnlike
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.*

/**
 *@classname HustHoleApiService
 * @description:
 * @date :2022/8/17 10:33
 * @version :1.0
 * @author
 */
private const val BASE_URL = "https://hustholev2.pivotstudio.cn/api/"


private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface HustHoleApiService {
    @Headers("Authorization: eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJyb2xlIjoiVVNFUiIsImlkIjoiOTA3NyIsImV4cCI6MTY2MzM3Njk1MSwidGltZXN0YW1wIjoiMTY0OTU3NTIyOCJ9.YZYiOXZL57-mlC81kgbnZdDAr513cCJa2ccg9TJB-Y4")
    @GET("hole/list")
    suspend fun getHoleList(
        @Query("timestamp") timestamp: String,
        @Query("limit") getHoleNum: Int = 20,
        @Query("mode") mode: String = "LATEST_REPLY",
        @Query("offset") offset: Int = 0
    ): List<Hole>

    @POST("interact/like")
    suspend fun postInteractLike(@Body data: InteractLikeOrUnlike): Call<ResponseBody>

    @POST("interact/unlike")
    suspend fun postInteractUnLike(@Body data: InteractLikeOrUnlike): Call<ResponseBody>

    @POST("interact/follow")
    suspend fun postInteractFollow(@Body data: InteractFollow): Call<ResponseBody>

    @POST("interact/unfollow")
    suspend fun postInteractUnFollow(@Body data: InteractFollow): Call<ResponseBody>
}

object HustHoleApi {
    val retrofitService: HustHoleApiService by lazy {
        retrofit.create(HustHoleApiService::class.java)
    }
}