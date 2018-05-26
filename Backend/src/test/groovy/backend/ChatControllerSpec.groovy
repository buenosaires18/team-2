package backend

import grails.converters.JSON
import grails.testing.web.controllers.ControllerUnitTest
import groovy.json.JsonBuilder
import spock.lang.Specification

class ChatControllerSpec extends Specification implements ControllerUnitTest<ChatController> {


        ChatService     mockChatService
        def             unJsonBuilder

        def setup(){

            unJsonBuilder= new JsonBuilder()

            mockChatService = Mock(ChatService)
            controller.chatService      =  mockChatService

        }

        def 'given a correct Message the response is positive'() {
            given:

            def aMessage = unJsonBuilder {
                user "pepita"
                text "I like this"
            } as JSON

            request.setJSON(aMessage)
            request.setMethod("POST")

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
