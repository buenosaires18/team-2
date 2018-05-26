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
            render status: 200
        } else {
            render status: 400
        }
    }


    def hasAnyErrors(Object unObjeto){
        def haserrors = unObjeto.hasErrors()

        if(haserrors) {
            respond unObjeto.errors
        }

        haserrors
    }
}
