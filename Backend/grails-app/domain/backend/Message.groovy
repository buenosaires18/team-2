package backend

class Message {

    long    userId
    String  text
    Chat    chat

    static belongsTo = Chat

    static constraints = {
    }

    Message(long auserID, String text) {
        this.userId = auserID
        this.text   = text
    }
}
