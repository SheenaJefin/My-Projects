package com.example.cba.Screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.cba.Data.ApiDataItem
import com.example.cba.MainViewModel


@Composable
fun DetailsPage(navController: NavHostController,apiDataItem: ApiDataItem) {
    val viewModel:MainViewModel= viewModel()
    val data = viewModel.data.collectAsState(initial = null)

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.padding(60.dp)
        ) {

            Text(text = "Details", textAlign = TextAlign.Center,style = TextStyle(fontSize = 40.sp, fontFamily = FontFamily.Cursive))

            Spacer(modifier = Modifier.height(20.dp))
                Text(text = "IP :${apiDataItem.ip}", textAlign = TextAlign.Start, style = TextStyle(fontSize = 14.sp, fontFamily = FontFamily.Default))

            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Network :${apiDataItem.network}",textAlign = TextAlign.Start, style = TextStyle(fontSize = 14.sp, fontFamily = FontFamily.Default))

            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "City :${apiDataItem.city}", textAlign = TextAlign.Start,style = TextStyle(fontSize = 14.sp, fontFamily = FontFamily.Default))


        }
    }

}

