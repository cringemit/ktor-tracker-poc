package com.raintown.models

data class Food(
    val itemName: String,
    val brandName: String = "Generic"
)

val foodStorage = mutableListOf(
    Food("Apple"),
    Food("Cornflakes", "Kellog's"),
    Food("Parsnip"),
    Food("Butter")
)