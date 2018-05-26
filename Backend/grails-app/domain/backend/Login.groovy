package backend

class Login {

    String email
    String password

    static constraints = {
    }

    Login(String email, String password) {
        this.email = email
        this.password = password
    }
}
