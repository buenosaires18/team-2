package backend

import grails.rest.RestfulController


class PublicationController  extends RestfulController<Publication> {


    def publicationService

    static responseFormats = ['json']


    PublicationController() {
        super(Publication)
    }

    // Post =>   /publication

    def savePublication(Publication aPublication) {
        if (!hasAnyErrors(aPublication)) {
            publicationService.save(aPublication)
            render status: 200
        } else {
            render status: 400
        }
    }

    // Get =>  /publications
    def allPublications() {
        respond publicationService.getAllPublications()
    }

    // Get => /publications/:publicationId
    def showPublicationById() {
        respond publicationService.getByID(params.publicationId)
    }

    // post    "/$publicationID/hashtag"
    def hashTag(HashTag unHashTag){
        publicationService.addHashTag(params.publicationID,unHashTag)
    }


    def hasAnyErrors(Object unObjeto){
        def haserrors = unObjeto.hasErrors()

        if(haserrors) {
            respond unObjeto.errors
        }

        haserrors
    }
}