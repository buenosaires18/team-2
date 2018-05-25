package backend

class Publication {

    String title
    String introduction
    String description
    String company
    User   user

    static constraints = {
    }

    Publication(String title, String introduction, String description, String company, User user) {
        this.title          = title
        this.introduction   = introduction
        this.description    = description
        this.company        = company
        this.user           = user
    }
}
