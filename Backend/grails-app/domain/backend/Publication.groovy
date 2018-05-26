package backend

class Publication {

    String title
    String introduction
    String description
    String company
    Long   userId
    Chat   chat

    static constraints = {}

    Publication(String title, String introduction, String description, String company, User user) {
        this.title          = title
        this.introduction   = introduction
        this.description    = description
        this.company        = company
        this.userId         = user.id
        this.chat           = new Chat(this)
    }
}
