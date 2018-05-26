package backend

class Chat {

    Publication  associatedPublication
    Set<Message> messages = new HashSet<>()

    static belongsTo = [Publication]

    static constraints = {
    }

    def addMessage(Message message) {
        this.messages.add(message)
    }
}
