package backend

class User {

    String username
    String fullName
    String email
    String password
    String facebookUsername
    List<Publication> publications = []

    static constraints = {
    }

    User(String username, String fullname, String email, String password, String facebookUsername) {
        this.email              = email
        this.password           = password
        this.facebookUsername   = facebookUsername
    }

    def startPublication(String title, String introduction, String description, String companyName) {
        publications.add(new Publication(title,introduction, description, companyName,this))
    }
}

