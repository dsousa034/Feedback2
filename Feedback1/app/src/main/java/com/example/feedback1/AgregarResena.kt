package com.example.feedback1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AgregarResena(novela: Novela, onResenaAgregada: (String) -> Unit) {
    var reseña by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Agregar Reseña") }
            )
        }
    ) { paddingValues ->
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF6CA6CD)) // Fondo dos tonos más oscuros
            .padding(paddingValues)) {
            Box(modifier = Modifier
                .background(Color(0xFF6CA6CD)) // Fondo dos tonos más oscuros
                .padding(16.dp)) {
                Column {
                    Text(
                        text = "Reseña para: ${novela.titulo}",
                        style = MaterialTheme.typography.titleMedium,
                        color = Color.Black // Letras negras
                    )
                    TextField(
                        value = reseña,
                        onValueChange = { reseña = it },
                        label = { Text("Escribe tu reseña") },
                        modifier = Modifier.fillMaxWidth()
                    )
                    Button(
                        onClick = {
                            if (reseña.isNotBlank()) {
                                onResenaAgregada(reseña) // Llama la función para agregar reseña
                            }
                        },
                        modifier = Modifier.padding(top = 16.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF90EE90)) // Botón verde clarito
                    ) {
                        Text(text = "Agregar Reseña")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AgregarResenaPreview() {
    // Crear un objeto de novela de ejemplo
    val novelaEjemplo = Novela(
        titulo = "Ejemplo de Novela",
        autor = "Autor de Ejemplo",
        anioPublicacion = 2023,
        sinopsis = "Esta es una sinopsis de ejemplo para la novela.",
        resenas = mutableListOf() // Inicializar con una lista vacía
    )

    // Llamar a la función AgregarResena con un lambda vacío para onResenaAgregada
    AgregarResena(novela = novelaEjemplo) { resena ->
    }
}
