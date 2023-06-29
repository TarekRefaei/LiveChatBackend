package com.tarekrefaei.plugins

import com.tarekrefaei.room.RoomController
import com.tarekrefaei.routes.chatSocket
import com.tarekrefaei.routes.getAllMessages
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    install(Routing) {

        val roomController by inject<RoomController>()

        chatSocket(roomController = roomController)
        getAllMessages(roomController = roomController)
    }
}
