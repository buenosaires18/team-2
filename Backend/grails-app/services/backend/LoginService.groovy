package backend

import grails.gorm.transactions.Transactional

@Transactional
class LoginService {

    def serviceMethod() {

    }

    def saveLogin(Login login) {
        login.save()
    }
}
