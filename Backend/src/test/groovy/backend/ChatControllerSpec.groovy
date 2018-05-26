package backend

import grails.converters.JSON
import grails.test.hibernate.HibernateSpec
import grails.testing.web.controllers.ControllerUnitTest
import groovy.json.JsonBuilder

class ChatControllerSpec extends HibernateSpec implements ControllerUnitTest<ChatController> {


    ChatService chatService
    def         unJsonBuilder

    def setup(){

        unJsonBuilder = new JsonBuilder()

        chatService = new ChatService()
        controller.chatService      =  chatService

    }

    def 'given a correct Message the response is positive'() {
        given:

        def aMessage = unJsonBuilder {
            user "1"
            text "I like this"
        } as JSON

        request.setJSON(aMessage)
        request.setMethod("POST")
        params.publicationId

        when:
        controller.addMessageToChatPublication()

        then:
        response.status == 200

    }


    def 'given a bad message the response is negative '() {
        given:

        def aMessage = unJsonBuilder {
            asdasd "pepita"
            texdasdat "I like this"
        } as JSON

        request.setJSON(aMessage)
        request.setMethod("POST")

        when:
        controller.addMessageToChatPublication()

        then:
        response.status == 400
    }




}
