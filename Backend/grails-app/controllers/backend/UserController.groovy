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


    def hasAnyErrors(Object unObjeto){
        def haserrors = unObjeto.hasErrors()

        if(haserrors) {
            respond unObjeto.errors
        }

        haserrors
    }
}
