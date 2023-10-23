package com.example.testapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.digipodiamtest.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(
    navController: NavHostController
) {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = Color.White,
                modifier = Modifier
            ) {
                Row(
                    modifier = Modifier
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Home,
                        contentDescription = "",
                        tint = Color.Gray,
                        modifier = Modifier
                            .size(40.dp)
                            .absoluteOffset(20.dp, 10.dp)
                    )
                    Icon(
                        imageVector = Icons.Outlined.Search,
                        contentDescription = "",
                        tint = Color.Gray,
                        modifier = Modifier
                            .size(40.dp)
                            .absoluteOffset(75.dp, 10.dp)
                    )
                    Icon(
                        imageVector = Icons.Outlined.AddCircle,
                        contentDescription = "",
                        tint = Color.Gray,
                        modifier = Modifier
                            .size(40.dp)
                            .absoluteOffset(140.dp, 10.dp)
                    )
                    Icon(
                        imageVector = Icons.Outlined.Person,
                        contentDescription = "",
                        tint = Color.Gray,
                        modifier = Modifier
                            .size(40.dp)
                            .absoluteOffset(200.dp, 10.dp)
                    )
                }
            }
        }
    ) {paddingValues ->
        var text by remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .background(Color.White)
        ) {
            var text by remember { mutableStateOf("") }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.padding(10.dp)
            ) {
                Column {
                    Text(
                        text = "Hi Brother!",
                        color = Color.Gray
                    )
                    Text(
                        text = "Where are you going?",
                        style = MaterialTheme.typography.titleLarge,
                        color = Color.Black,
                        fontWeight = FontWeight.ExtraBold
                    )
                }

                OutlinedButton(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(CornerSize(30)),
                    modifier = Modifier
                        .absoluteOffset(85.dp)
                        .height(55.dp),
                    border = BorderStroke(1.dp,Color.LightGray)
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Notifications,
                        contentDescription = "",
                        tint = Color.Gray,
                        modifier = Modifier
                            .size(25.dp)
                    )
                }
            }
            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Search Your Location") },
                leadingIcon = { Icon(Icons.Filled.Search, contentDescription = null) },
                shape = RoundedCornerShape(CornerSize(30)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(CornerSize(30)),
                    colors = ButtonDefaults.outlinedButtonColors(Color.Blue),
                    modifier = Modifier
                        .height(60.dp)
                        .absoluteOffset(10.dp)
                ) {
                    Text(
                        text = "All",
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }

                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(CornerSize(30)),
                    colors = ButtonDefaults.outlinedButtonColors(Color.LightGray),
                    modifier = Modifier
                        .height(60.dp)
                        .absoluteOffset(25.dp)
                ) {
                    Text(
                        text = "Beach",
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.Bold,
                        color = Color.DarkGray
                    )
                }

                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(CornerSize(30)),
                    colors = ButtonDefaults.outlinedButtonColors(Color.LightGray),
                    modifier = Modifier
                        .height(60.dp)
                        .absoluteOffset(38.dp)
                ) {
                    Text(
                        text = "Mountain",
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.Bold,
                        color = Color.DarkGray
                    )
                }

                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(CornerSize(30)),
                    colors = ButtonDefaults.outlinedButtonColors(Color.LightGray),
                    modifier = Modifier
                        .height(60.dp)
                        .absoluteOffset(50.dp)
                ) {
                    Text(
                        text = "Hotel",
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.Bold,
                        color = Color.DarkGray
                    )
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.padding(20.dp)
            ) {
                Text(
                    text = "Popular Beach",
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "See All",
                    style = MaterialTheme.typography.titleSmall,
                    color = Color.Blue,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.absoluteOffset(160.dp)
                )
            }
            val state = rememberScrollState()
            Column(
                modifier = Modifier
                    .padding(5.dp)
                    .verticalScroll(
                        state = state,
                        enabled = true
                    )
            ) {
                Row() {
                    Column {
                        ImageBoxCard(
                            modifier = Modifier,
                            image = R.drawable.h2,
                            Height = 180.dp,
                            Widht = 180.dp,
                            text1 = "Pandawa Beach",
                            text2 = "Bali, Hyderabad",
                            onClickToRegister = {navController.navigate(Screen.DetailScreen.route)}
                        )
                        ImageBoxCard(
                            modifier = Modifier,
                            image = R.drawable.h1,
                            Height = 250.dp,
                            Widht = 180.dp,
                            text1 = "Pandawa Beach",
                            text2 = "Bali, Hyderabad",
                            onClickToRegister = {navController.navigate(Screen.DetailScreen.route)}
                        )
                        ImageBoxCard(
                            modifier = Modifier,
                            image = R.drawable.screenpw,
                            Height = 250.dp,
                            Widht = 180.dp,
                            text1 = "Pandawa Beach",
                            text2 = "Bali, Hyderabad",
                            onClickToRegister = {navController.navigate(Screen.DetailScreen.route)}
                        )
                        ImageBoxCard(
                            modifier = Modifier,
                            image = R.drawable.h2,
                            Height = 250.dp,
                            Widht = 180.dp,
                            text1 = "Pandawa Beach",
                            text2 = "Bali, Hyderabad",
                            onClickToRegister = {navController.navigate(Screen.DetailScreen.route)}
                        )
                    }
                    Column {
                        ImageBoxCard(
                            modifier = Modifier,
                            image = R.drawable.h2,
                            Height = 250.dp,
                            Widht = 180.dp,
                            text1 = "Pandawa Beach",
                            text2 = "Bali, Hyderabad",
                            onClickToRegister = {navController.navigate(Screen.DetailScreen.route)}
                        )
                        ImageBoxCard(
                            modifier = Modifier,
                            image = R.drawable.screenpw,
                            Height = 250.dp,
                            Widht = 180.dp,
                            text1 = "Pandawa Beach",
                            text2 = "Bali, Hyderabad",
                            onClickToRegister = {navController.navigate(Screen.DetailScreen.route)}
                        )
                        ImageBoxCard(
                            modifier = Modifier,
                            image = R.drawable.h1,
                            Height = 250.dp,
                            Widht = 180.dp,
                            text1 = "Pandawa Beach",
                            text2 = "Bali, Hyderabad",
                            onClickToRegister = {navController.navigate(Screen.DetailScreen.route)}
                        )
                        ImageBoxCard(
                            modifier = Modifier,
                            image = R.drawable.h2,
                            Height = 250.dp,
                            Widht = 180.dp,
                            text1 = "Pandawa Beach",
                            text2 = "Bali, Hyderabad",
                            onClickToRegister = {navController.navigate(Screen.DetailScreen.route)}
                        )
                    }
                }
            }
        }
    }
}
@Composable
fun ImageBoxCard(
    modifier: Modifier,
    image: Int,
    Height: Dp,
    Widht: Dp,
    text1: String,
    text2: String,
    onClickToRegister: (Int) -> Unit
) {
    Box {
        Box(
            modifier = Modifier
                .padding(5.dp)
                .height(Height)
                .width(Widht)
                .clip(shape = RoundedCornerShape(20.dp))
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.size(1000.dp)
            )
            Row(modifier = Modifier.padding(20.dp)) {
                Spacer(modifier = Modifier.weight(0.1f))
                Icon(
                    imageVector = Icons.Outlined.Favorite,
                    contentDescription = "heart",
                    tint = Color.White,
                )
            }

            Column(modifier = Modifier.padding(15.dp)) {
                Spacer(modifier = Modifier.weight(0.1f))
                ClickableText(
                    text = AnnotatedString(text1),
                    onClick = onClickToRegister,
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Row {
                    Icon(
                        imageVector = Icons.Default.LocationOn,
                        contentDescription = "map icon",
                        tint = Color.LightGray
                    )
                    Text(text = text2, color = Color.LightGray)
                }
            }

        }
    }
}