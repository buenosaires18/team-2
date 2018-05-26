package backend

import grails.rest.RestfulController

class ChatController  extends RestfulController<Chat> {

    def chatService

    static responseFormats = ['json']


    ChatController() {
        super(Chat)
    }

    // Post  =>  /publication/:publicationId/chat

    def addMessageToChatPublication(Message aMessage) {
        if (!hasAnyErrors(aMessage)) {
            chatService.addMessagetoChat(aMessage,params.publicationId)
        }
    }

    //   post "/chat/$idUser1/$idUser2"
    def messageToUser(MessageDTO aMessage) {
        if (!hasAnyErrors(aMessage)) {
            messageService.getMessage(aMessage.id)
            chatService.addMessageToUsersChat(params.idUser1, params.idUser2, aMessage)
        }
    }

    //   get "/chat/$idUser1/$idUser2"
    def chatBetweenUsers(){
        respond chatService.getChatBetweenUsers(params.idUser1, params.idUser2)
    }

    //   get "/chat/$idUser1"
    def chatUsers(){
        respond chatService.getAllChatsOfUser(params.idUser1)
    }


    def hasAnyErrors(Object unObjeto){
        def haserrors = unObjeto.hasErrors()

        if(haserrors) {
            respond unObjeto.errors
        }

        haserrors
    }
}
