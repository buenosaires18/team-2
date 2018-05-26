package backend

class User {

    String username
    String fullName
    String email
    String password
    String facebookUsername
    Set<Publication> publications = new HashSet<>()

    Set<HashTag> hashTags         = new HashSet<>()
    Set<User> following = new HashSet<>()


    static constraints = {
        username nullable:false, blank:false, unique:true
    }

    static hasMany = [publications: Publication, hashTags: HashTag]

    User(String username, String fullname, String email, String password, String facebookUsername) {
        this.username           = username
        this.fullName           = fullname
        this.email              = email
        this.password           = password
        this.facebookUsername   = facebookUsername
    }

    def startPublication(String title, String introduction, String description, String companyName) {
        publications.add(new Publication(title,introduction, description, companyName,this))
    }

    def startFollowing(User user) {
        this.following.add(user)
    }

}

