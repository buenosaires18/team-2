package backend

import grails.gorm.transactions.Transactional

@Transactional
class UserService {

    def serviceMethod() {

    }

    def registerUser(User user) {
        if (usernameAlreadyTaken(user))
            throw new UsernameAlreadyRegistered('The username ' + user.username + ' is already taken, please choose another one.')
        user.save()
    }

    boolean usernameAlreadyTaken(User user) {
        def recovered = User.findByUsername(user.username)
        if (recovered == null)
            false
        else
            recovered.username == user.username
    }

    def getUser(long userId) {
        User.findById(userId)
    }


    def followHashtag(long idUser, HashTag aHashTag){
        def user = getUser(idUser)
        user.addToHashTags(aHashTag)
        user.save()
    }

    def getAllFollowingHashTags(long idUser){
        def user = getUser(idUser)
        user.hashTags
    }

    def getAllFollowedPublications(long idUser) {
    }

    def getAllFollowedUsersBy(long userId) {
        getUser(userId).following

    }
}
