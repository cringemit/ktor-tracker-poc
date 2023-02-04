package com.raintown.models

import java.util.UUID

data class Food private constructor(
    val id: UUID = UUID.randomUUID(),
    val itemName: String,
    val brandName: String
) {
    companion object {
        fun named(
            itemName: String,
            brandName: String = "Generic"
        ) = Food(
            itemName = itemName,
            brandName = brandName
        )
    }
}

val foodStorage = mutableListOf(
    Food.named("Apple"),
    Food.named("Cornflakes", "Kellog's"),
    Food.named("Parsnip"),
    Food.named("Butter")
)