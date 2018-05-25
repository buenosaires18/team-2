package backend

class Chat {

    Publication     associatedPublication
    List<Message>   messages = []

    static constraints = {
    }

    Chat(Publication associatedPublication) {
        this.associatedPublication = associatedPublication
    }

    def addMessage(Message message) {
        this.messages.add(message)
    }
}
