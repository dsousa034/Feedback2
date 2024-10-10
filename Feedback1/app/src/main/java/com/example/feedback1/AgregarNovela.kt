package com.example.feedback1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AgregarNovela(onAgregarNovela: (Novela) -> Unit) {
    var titulo by remember { mutableStateOf("") }
    var autor by remember { mutableStateOf("") }
    var anio by remember { mutableStateOf("") }
    var sinopsis by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Agregar Novela") }
            )
        }
    ) { paddingValues ->
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFADD8E6)) // Fondo azul clarito
            .padding(paddingValues)) {
            Box(modifier = Modifier
                .background(Color(0xFFADD8E6)) // Fondo azul clarito
                .padding(16.dp)) {
                Column {
                    TextField(value = titulo, onValueChange = { titulo = it }, label = { Text("Título") })
                    TextField(value = autor, onValueChange = { autor = it }, label = { Text("Autor") })
                    TextField(value = anio, onValueChange = { anio = it }, label = { Text("Año de Publicación") })
                    TextField(value = sinopsis, onValueChange = { sinopsis = it }, label = { Text("Sinopsis") })

                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = {
                        if (titulo.isNotEmpty() && autor.isNotEmpty() && anio.isNotEmpty() && sinopsis.isNotEmpty()) {
                            onAgregarNovela(Novela(titulo, autor, anio.toInt(), sinopsis))
                        }
                    }, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF90EE90))) { // Botón verde clarito
                        Text("Agregar Novela")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAgregarNovela() {
    AgregarNovela(onAgregarNovela = {})
}
