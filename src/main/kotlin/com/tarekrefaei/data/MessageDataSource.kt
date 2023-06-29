package com.tarekrefaei.data

import com.tarekrefaei.data.model.Message

interface MessageDataSource {

    suspend fun getAllMessage():List<Message>

    suspend fun insertMessages(message: Message)

}