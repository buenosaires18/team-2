package backend

import grails.test.hibernate.HibernateSpec
import grails.testing.services.ServiceUnitTest

class ChatServiceSpec extends HibernateSpec implements ServiceUnitTest<ChatService>{

    ChatService         chatService
    PublicationService  publicationService
    UserService         userService
    Publication         publication
    User                user
    Message             message1
    Message             message2

    def setup() {
        chatService         = new ChatService()
        userService         = new UserService()
        publicationService  = new PublicationService()
        user                = new User("HurrellT","Tomás Hurrell","hurrelltomas@gmail.com","pass1234","tlh11")
        publication         = new Publication("Publication","Publication introduction","Description","Pescar",user)

        userService.registerUser(user)
        publicationService.savePublication(publication)
        message1            = new Message(user.id,"Holahola")
        message2            = new Message(user.id,"Holachauchau")
    }

    def cleanup() {
    }

    def "A chat service belongs to the publication titled Publication"() {
        expect:
            def recoveredChat = chatService.getChatByPublicationId(publication.id)
            recoveredChat.messages.size()       == 0
            recoveredChat.associatedPublication == publication
    }

    def "A chat service recovers a chat that has 2 messages"() {
        when:
            def recoveredChat = chatService.getChatByPublicationId(publication.id)
            chatService.addMessageToChat(recoveredChat.id, message1)
            chatService.addMessageToChat(recoveredChat.id, message2)
        then:
            recoveredChat.messages.size()   == 2
    }
}
