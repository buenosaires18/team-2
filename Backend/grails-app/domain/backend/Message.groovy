package backend

class Message {

    User    user
    String  text

    static constraints = {
    }

    Message(User user, String text) {
        this.user = user
        this.text = text
    }
}
