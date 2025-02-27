package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    Column(
        Modifier.fillMaxWidth()
    ) {
        Row(
            Modifier
                .weight(1f)
        ) {
            ComposableInfoCard(
                modifier = Modifier.weight(1f),
                color = Color(0xFFEADDFF),
                title = stringResource(id = R.string.first_title),
                description = stringResource(id = R.string.first_description)
            )
            ComposableInfoCard(
                modifier =Modifier.weight(1f), 
                color = Color(0xFFD0BCFF),
                title = stringResource(id = R.string.second_title),
                description = stringResource(id = R.string.second_description)
            )
        }
        Row(
            Modifier
                .weight(1f)
        ) {
            ComposableInfoCard(
                modifier = Modifier.weight(1f),
                color = Color(0xFFB69DF8),
                title = stringResource(id = R.string.third_title),
                description = stringResource(id = R.string.third_description)
            )
            ComposableInfoCard(
                modifier = Modifier.weight(1f), 
                color = Color(0xFFF6EDFF),
                title = stringResource(id = R.string.fourth_title),
                description = stringResource(id = R.string.fourth_description)
            )
        }
    }
}

@Composable
fun ComposableInfoCard(
    modifier: Modifier = Modifier,
    color: Color,
    title: String,
    description: String
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrantApp()
    }
}