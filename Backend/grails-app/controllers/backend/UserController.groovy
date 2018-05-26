package backend

import grails.rest.RestfulController

class UserController extends RestfulController<User> {

    def userService
    def loginService

    static responseFormats = ['json']

    UserController() {
        super(User)
    }

    // Post  =>  /api/login

    def loginUser(Login aLogin) {
        if (!hasAnyErrors(aLogin)) {
            loginService.saveLogin(aLogin)
            render status: 200
        } else {
            render status: 400
        }
    }

    // Post=>  /register

    def registerUser(User aUser) {
        if (!hasAnyErrors(aUser)) {
            userService.registerUser(aUser)
            render status: 200
        } else {
            render status: 400
        }
    }

    //post "/$idUser/follow/$idUser2"           (controller:"user"       , action:"followUser")
    def followUser(){
        userService.followUser(params.idUser1, params.idUser2)
    }

    //get "/$idUser/followingUsers"             (controller:"user"       , action:"followingUsers")
    def followingUsers(){
        respond userService.getAllFollowingUsers(params.idUser)
    }

    //post "/$userID/follow/hashtag"            (controller:"user"       , action: "followHashtag")
    def followHashtag(){
        userService.followHashtag(params.$userID)
    }

    //get "/$idUser/following/publications"     (controller:"user"       , action: "followingsHashtag")
    def followingsHashtag(){
        respond userService.getAllFollowingHashTags(params.idUser)
    }

    //get "/$idUser/following/publications"     (controller:"user"       , action: "allPublications")
    def allPublications(){
        respond userService.getAllPublications(params.idUser)
    }


    def hasAnyErrors(Object unObjeto){
        def haserrors = unObjeto.hasErrors()

        if(haserrors) {
            respond unObjeto.errors
        }

        haserrors
    }
}
