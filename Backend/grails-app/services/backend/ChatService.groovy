package backend

import grails.gorm.transactions.Transactional

@Transactional
class ChatService {

    def serviceMethod() {

    }

    def getChatByPublicationId(Long publicationId) {
        def recoveredPublication = Publication.get(publicationId)
        recoveredPublication.chat
    }

    def addMessageToChat(Long chatId, Message message) {
        Chat chatRecovered = Chat.get(chatId)
        chatRecovered.addMessage(message)
        chatRecovered.save()
    }

// TODO: if possible when Bidirectional chat is implemented >> void chatService.addMessageToUsersChat(long idUser1, long idUser2,Message aMessage)

// TODO: if possible, when Bidirectional chat is implemented >> List<Chat> chatService.getAllChatsOfUser(long idUser)


}
