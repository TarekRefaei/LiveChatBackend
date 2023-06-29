package com.tarekrefaei.data

import com.tarekrefaei.data.model.Message
import org.litote.kmongo.coroutine.CoroutineDatabase

class MessageDataSourceImpl(
    db: CoroutineDatabase
) : MessageDataSource {

    private val messages = db.getCollection<Message>()

    override suspend fun getAllMessage(): List<Message> {
        return messages
            .find()
            .descendingSort(Message::timestamp)
            .toList()
    }

    override suspend fun insertMessages(message: Message) {
        messages.insertOne(message)
    }
}