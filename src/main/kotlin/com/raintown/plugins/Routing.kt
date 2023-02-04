package com.raintown.plugins

import com.raintown.models.Food
import com.raintown.models.foodStorage
import io.ktor.http.HttpStatusCode
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.resources.Resources
import io.ktor.server.application.*
import io.ktor.server.freemarker.FreeMarkerContent
import io.ktor.server.request.receiveParameters
import io.ktor.server.util.getOrFail
import java.util.UUID

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

            get("{id}") {
                val food = foodStorage.find { it.id == UUID.fromString(call.parameters["id"]) }
                    ?: call.respond(HttpStatusCode.NotFound, "Failed to find a food with that id")
                call.respond(FreeMarkerContent("food/show.ftl", mapOf("food" to food)))
            }

            route("new") {
                get {
                    call.respond(FreeMarkerContent("food/new.ftl", null))
                }

                post {
                    val parameters = call.receiveParameters()
                    val food = Food.named(
                        itemName = parameters.getOrFail("item-name"),
                        brandName = parameters.getOrFail("brand-name")
                    )
                    foodStorage.add(food)
                    call.respondRedirect("${food.id}")
                }
            }

        }
    }
}
