package io.axoniq.labs.chat.coreapi

class AllRoomsQuery
data class RoomParticipantsQuery(val roomId: String)
data class RoomMessagesQuery(val roomId: String)