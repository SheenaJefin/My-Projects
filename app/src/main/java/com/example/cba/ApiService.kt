package com.example.cba

import com.example.cba.Data.ApiDataItem
import retrofit2.http.GET

// Interface for clarity (optional)
interface ApiInterface {
    @GET("https://ipapi.co/json/") // Empty GET as the base URL defines the endpoint
     fun getData(): List<ApiDataItem>

}