package com.raintown

import io.ktor.server.application.*
import com.raintown.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    configureTemplating()
    configureRouting()
}
