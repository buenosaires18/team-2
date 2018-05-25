package backend

import grails.gorm.transactions.Transactional

@Transactional
class PublicationService {
    
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
