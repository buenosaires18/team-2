package backend

class UsernameAlreadyRegistered extends RuntimeException {

    static constraints = {
    }

    UsernameAlreadyRegistered(String anString){
        super(anString)
    }
}
