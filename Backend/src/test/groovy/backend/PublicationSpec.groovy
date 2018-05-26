package backend

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PublicationSpec extends Specification implements DomainUnitTest<Publication> {

    Publication publication
    User user

    def setup() {
        user        = new User("HurrellT","Tomás Hurrell","hurrelltomas@gmail.com","pass1234","tlh11")
        publication = new Publication("Publication","Publication introduction","Description","Pescar",user)
    }

    def cleanup() {
    }

    def "a Publication is titled Publication with introduction Publication introduction and description Description for Pescar company made by Tomás Hurrell "() {
        expect:
            publication.user            == user
            publication.title           == "Publication"
            publication.introduction    == "Publication introduction"
            publication.description     == "Description"
            publication.company         == "Pescar"
            publication.chat.associatedPublication == publication

    }
}
