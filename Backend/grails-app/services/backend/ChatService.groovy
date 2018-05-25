package backend

import grails.gorm.transactions.Transactional

@Transactional
class ChatService {

    def serviceMethod() {

    }

    def getChatByPublicationId(Long publicationId) {
        Publication.findById(publicationId).chat
    }

    def addMessageToChat(Long chatId, Message message) {
        Chat.findById(chatId).addMessage(message)
    }
}
