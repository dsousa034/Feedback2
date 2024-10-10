package com.example.feedback1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaPrincipal(novelas: List<Novela>, onAgregarClick: () -> Unit, onEliminarClick: (Novela) -> Unit, onVerDetallesClick: (Novela) -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Pantalla Principal") }
            )
        }
    ) { paddingValues ->
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFADD8E6)) // Fondo azul clarito
            .padding(paddingValues)) {
            Column(modifier = Modifier
                .background(Color(0xFFADD8E6)) // Fondo azul clarito
                .padding(16.dp)) {
                Text(
                    text = "Lista de Novelas",
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.Black // Letras negras
                )
                // Aquí puedes agregar el contenido de la pantalla principal
                Button(
                    onClick = onAgregarClick,
                    modifier = Modifier.padding(top = 16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF90EE90)) // Botón verde clarito
                ) {
                    Text(text = "Agregar Novela")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPantallaPrincipal() {
    PantallaPrincipal(
        novelas = listOf(
            Novela("Novela 1", "Autor 1", 2022, "Sinopsis 1"),
            Novela("Novela 2", "Autor 2", 2021, "Sinopsis 2")
        ),
        onAgregarClick = {},
        onEliminarClick = {},
        onVerDetallesClick = {}
    )
}
