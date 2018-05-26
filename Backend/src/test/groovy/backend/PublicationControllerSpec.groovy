package backend

import grails.converters.JSON
import grails.testing.web.controllers.ControllerUnitTest
import groovy.json.JsonBuilder
import spock.lang.Specification

class PublicationControllerSpec extends Specification implements ControllerUnitTest<PublicationController> {

    PublicationService     mockpublicationService
    def             unJsonBuilder

    def setup(){

        unJsonBuilder= new JsonBuilder()

        mockpublicationService             = Mock(PublicationService)
        controller.publicationService      = mockpublicationService

    }

    def 'given a correct Publication the response is positive'() {
        given:

        def aPublication = unJsonBuilder {
             title        "Nuevo Trabajo"
             introduction "Me gusto"
             description  "Me gusto mas"
             company      "A cara de perro"
        } as JSON

        request.setJSON(aPublication)
        request.setMethod("POST")

        when:
        controller.savePublication()

        then:
        response.status == 200

    }


    def 'given a bad publication the response is negative '() {
        given:

        def aPublication = unJsonBuilder {
            safasfe        "Nuevo Trabajo"
            introasfduction "Me gusto"
            descrasfasfiption  "Me gusto mas"
            comasfasfpany      "A cara de perro"
            comasfwetweasfpany      "A cara de perro"
        } as JSON

        request.setJSON(aPublication)
        request.setMethod("POST")

        when:
        controller.savePublication()

        then:
        response.status == 400

    }
}
