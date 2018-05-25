package backend

class User {

    String email
    String password
    String facebookUsername

    static constraints = {
    }

    User(String email, String password, String facebookUsername) {
        this.email              = email
        this.password           = password
        this.facebookUsername   = facebookUsername
    }
}
