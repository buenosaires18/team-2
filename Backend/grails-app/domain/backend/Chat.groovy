package backend

class Chat {

    Publication     associatedPublication
    List<Message>   messages = []

    static constraints = {
    }

//    static belongsTo = [Publication]

    Chat(Publication associatedPublication) {
        this.associatedPublication = associatedPublication
    }

    def addMessage(Message message) {
        this.messages.add(message)
    }
}
