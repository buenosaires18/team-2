package backend

class Publication {

    String title
    String introduction
    String description
    String company
    User   user
    Chat   chat

    static belongsTo = User

    static hasOne = [chat: Chat]

    static constraints = {
//        chat     nullable:true
    }

    Publication(String title, String introduction, String description, String company, User user) {
        this.title          = title
        this.introduction   = introduction
        this.description    = description
        this.company        = company
        this.user           = user
        this.chat           = new Chat(associatedPublication: this)
    }


}
