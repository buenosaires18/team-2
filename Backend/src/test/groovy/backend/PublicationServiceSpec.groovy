package backend

import grails.test.hibernate.HibernateSpec
import grails.testing.services.ServiceUnitTest

class PublicationServiceSpec extends HibernateSpec implements ServiceUnitTest<PublicationService>{

    PublicationService  publicationService
    UserService         userService
    Publication         publication
    User                user

    def setup() {
        user                = new User("HurrellT","Tomás Hurrell","hurrelltomas@gmail.com","pass1234","tlh11")
        userService         = new UserService()
        publication         = new Publication("Publication","Publication introduction","Description","Pescar",user)
        publicationService  = new PublicationService()
    }

    def cleanup() {
    }

    def "A publication service can save and recover a publication"() {
        when:
            publicationService.savePublication(publication)
        then:
            def recoveredPublication = publicationService.getPublicationById(publication.id)
            recoveredPublication.title          ==  publication.title
            recoveredPublication.introduction   ==  publication.introduction
            recoveredPublication.description    ==  publication.description
            recoveredPublication.company        ==  publication.company
            recoveredPublication.userId         ==  user.id
    }
}
