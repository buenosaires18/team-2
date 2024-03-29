package backend

import grails.gorm.transactions.Transactional

@Transactional
class PublicationService {
    
    def serviceMethod() {

    }

    def savePublication(Publication publication) {
        publication.save(flush: true)
        publication.chat.save()
    }

    def getPublications(List<Publication> publicationList) {
        Publication.list()
    }

    def getPublicationById(Long publicationId) {
        Publication.get(publicationId)
    }

    def addHashTag(long publicationID,HashTag unHashTag){
        def publication = getPublicationById(publicationID)
        publication.addToHashTags(unHashTag)
        publication.save()
    }



}
