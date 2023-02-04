package com.raintown.plugins

import com.raintown.models.foodStorage
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.resources.Resources
import io.ktor.server.application.*
import io.ktor.server.freemarker.FreeMarkerContent

fun Application.configureRouting() {
    install(Resources)
    routing {
        route("/") {
            get {
                call.respondRedirect("food")
            }
        }

        route("food") {
            get {
                call.respond(FreeMarkerContent("food/index.ftl", mapOf("foods" to foodStorage)))
            }
        }
    }
}
