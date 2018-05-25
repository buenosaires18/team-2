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
}
