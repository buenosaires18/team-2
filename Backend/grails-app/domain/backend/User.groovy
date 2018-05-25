package backend

class User {

    String email
    String password
    String facebookUsername
    List<Publication> publications

    static constraints = {
    }

    User(String email, String password, String facebookUsername) {
        this.email              = email
        this.password           = password
        this.facebookUsername   = facebookUsername
    }

    def startPublication(String title, String introduction, String description, String companyName) {
        new Publication(title,introduction, description, companyName,this)
    }
}

