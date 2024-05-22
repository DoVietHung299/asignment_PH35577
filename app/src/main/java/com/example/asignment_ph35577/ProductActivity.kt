package com.example.asignment_ph35577

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.asignment_ph35577.ui.theme.Asignment_PH35577Theme

class ProductActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Asignment_PH35577Theme {
                ProductScreen()
            }
        }
    }
}

@Composable
fun ProductScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        TopBr() // Gọi hàm TopBar()
        Spacer(modifier = Modifier.height(16.dp))
        ProductImage()
        Spacer(modifier = Modifier.height(16.dp))
        ProductDetails()
    }
}

@Composable
fun TopBr() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { /* TODO: Add back navigation action */ }) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back",
                tint = Color.Black
            )
        }
    }
}

@Composable
fun ProductImage() {
    // Replace this with the actual product image
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .background(Color.Gray),
        contentAlignment = Alignment.Center
    ) {
        // This is a placeholder for the product image
        Image(
            painter = painterResource(id = R.drawable.placeholder_image), // Thay thế với hình ảnh sản phẩm của bạn
            contentDescription = "Product Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(end = 290.dp)
        ) {
            // Color selection placeholders
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(Color.Gray)
                    .clip(RoundedCornerShape(50))
            )
            Spacer(modifier = Modifier.height(16.dp))
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(Color(0xFFA0522D)) // Thay thế với màu sắc của bạn
                    .clip(RoundedCornerShape(50))
            )
            Spacer(modifier = Modifier.height(16.dp))
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(Color(0xFFDEB887)) // Thay thế với màu sắc của bạn
                    .clip(RoundedCornerShape(50))
            )
        }
    }
}

@Composable
fun ProductDetails() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Minimal Stand",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "$50",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(end = 16.dp) // Điều chỉnh khoảng cách sang phải
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_star), // Thay thế với icon sao của bạn
                    contentDescription = "Rating Star",
                    tint = Color(0xFFFFD700)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "4.5",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "(50 reviews)",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Gray
                )
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = { /* TODO: Decrease quantity */ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_minus), // Thay thế với icon trừ của bạn
                        contentDescription = "Decrease",
                        modifier = Modifier.size(20.dp) // Tăng kích thước icon
                    )
                }
                Text(
                    text = "01",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                IconButton(onClick = { /* TODO: Increase quantity */ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_plus), // Thay thế với icon cộng của bạn
                        contentDescription = "Increase",
                        modifier = Modifier.size(20.dp) // Tăng kích thước icon
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Minimal Stand is made of natural wood. The design is very simple and minimal. This is truly one of the best furnitures in any family for now. With 3 different colors, you can easily select the best match for your home.",
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Gray,
            textAlign = TextAlign.Left
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Bookmark Button
            Button(
                onClick = { /* TODO: Add bookmark action */ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFF5F5F5),
                    contentColor = Color.Black
                ),
                shape = RoundedCornerShape(232.dp),
                modifier = Modifier.size(100.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_bookmark), // Thay thế với icon bookmark của bạn
                    contentDescription = "Bookmark",
                    modifier = Modifier.size(40.dp)
                )
            }

            // Add to Cart Button
            Button(
                onClick = { /* TODO: Add to cart action */ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black,
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .height(50.dp)
                    .width(300.dp) // Tăng độ dài của nút
            ) {
                Text(text = "Add to cart", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductScreenPreview() {
    Asignment_PH35577Theme {
        ProductScreen()
    }
}
