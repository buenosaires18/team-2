package backend

import grails.test.hibernate.HibernateSpec
import grails.testing.services.ServiceUnitTest

class ChatServiceSpec extends HibernateSpec implements ServiceUnitTest<ChatService>{

    ChatService chatService
    Publication publication
    User        user

    def setup() {
        chatService = new ChatService()
        user        = new User("HurrellT","Tomás Hurrell","hurrelltomas@gmail.com","pass1234","tlh11")
        publication = new Publication("Publication","Publication introduction","Description","Pescar",user)

    }

    def cleanup() {
    }

    void "A chat service with"() {
        expect:"fix me"
            true == false
    }
}
