package io.axoniq.labs.chat.coreapi

data class RoomCreatedEvent(val roomId: String, val name: String)
data class ParticipantJoinedRoomEvent(val roomId: String, val participant: String)
data class MessagePostedEvent(val roomId: String, val participant: String, val message: String)
data class ParticipantLeftRoomEvent(val roomId: String, val participant: String)
