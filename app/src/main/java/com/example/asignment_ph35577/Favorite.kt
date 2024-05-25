package com.example.asignment_ph35577

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.asignment_ph35577.ui.theme.Asignment_PH35577Theme

class Favorite : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Asignment_PH35577Theme {
                FavoriteScreen()
            }
        }
    }
}

data class FavoriteProduct(val imageRes: Int, val name: String, val price: String)

@Composable
fun FavoriteScreen() {
    Scaffold(
        topBar = { FavoriteTopBar() },
        bottomBar = { BottomNavigationBar() }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(innerPadding)
        ) {
            FavoriteList()
            AddAllToCartButton()
        }
    }
}

@Composable
fun FavoriteTopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IconButton(onClick = { /* TODO: Add search action */ }) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search",
                modifier = Modifier.size(32.dp)
            )
        }
        Text(
            text = "Favorites",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
        IconButton(onClick = { /* TODO: Add cart action */ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_cart),
                contentDescription = "Cart",
                modifier = Modifier.size(32.dp)
            )
        }
    }
}

@Composable
fun FavoriteList() {
    val products = listOf(
        FavoriteProduct(R.drawable.img_coffee_table, "Coffee Table", "$50.00"),
        FavoriteProduct(R.drawable.img_coffee_chair, "Coffee Chair", "$20.00"),
        FavoriteProduct(R.drawable.img_minimal_stand, "Minimal Stand", "$25.00"),
        FavoriteProduct(R.drawable.img_minimal_desk, "Minimal Desk", "$50.00"),
        FavoriteProduct(R.drawable.img_minimal_lamp, "Minimal Lamp", "$12.00")
    )
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        contentPadding = PaddingValues(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(products) { product ->
            FavoriteItem(product)
        }
    }
}

@Composable
fun FavoriteItem(product: FavoriteProduct) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painterResource(id = product.imageRes),
            contentDescription = product.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(80.dp)
                .background(Color.Gray)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = product.name,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(
                text = product.price,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Gray
            )
        }
        IconButton(onClick = { /* TODO: Add remove action */ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_remove),
                contentDescription = "Remove",
                modifier = Modifier.size(24.dp)
            )
        }
        IconButton(onClick = { /* TODO: Add add to cart action */ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_add_to_cart),
                contentDescription = "Add to Cart",
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Composable
fun AddAllToCartButton() {
    Button(
        onClick = { /* TODO: Add all to cart action */ },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Black,
            contentColor = Color.White
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(50.dp)
    ) {
        Text(text = "Add all to my cart", fontSize = 16.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun BottomNavigationBar() {
    val context = LocalContext.current
    BottomNavigation(
        backgroundColor = Color.White,
        contentColor = Color.Black
    ) {
        BottomNavigationItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_home),
                    contentDescription = "Home",
                    modifier = Modifier.size(24.dp)
                )
            },
            selected = true,
            onClick = {
                val intent = Intent(context, Home::class.java)
                context.startActivity(intent)
            },
            alwaysShowLabel = false
        )
        BottomNavigationItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_bookmark),
                    contentDescription = "Bookmark",
                    modifier = Modifier.size(24.dp)
                )
            },
            selected = false,
            onClick = { /* TODO: Add action */ },
            alwaysShowLabel = false
        )
        BottomNavigationItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_notifications),
                    contentDescription = "Notifications",
                    modifier = Modifier.size(24.dp)
                )
            },
            selected = false,
            onClick = { /* TODO: Add action */ },
            alwaysShowLabel = false
        )
        BottomNavigationItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_profile),
                    contentDescription = "Profile",
                    modifier = Modifier.size(24.dp)
                )
            },
            selected = false,
            onClick = { /* TODO: Add action */ },
            alwaysShowLabel = false
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FavoriteScreenPreview() {
    Asignment_PH35577Theme {
        FavoriteScreen()
    }
}
