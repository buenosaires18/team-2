package backend

import grails.gorm.transactions.Transactional

@Transactional
class PublicationService {

    /*
    publicationService.save(Publication aPublication)

publicationService.getAllPublications(List<Publication> listOfPublications)

publicationService.getByID(Long aPublicationID)

     */

    def serviceMethod() {

    }

    def savePublication(Publication publication) {
        publication.save()
    }

    def getPublications(List<Publication> publicationList) {
        Publication.all
    }

    def getPublicationById(Long publicationId) {
        Publication.findById(publicationId)
    }
}
