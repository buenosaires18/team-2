package backend

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        post    "/publication"                    (controller:"publication", action:"savePublication")
        get     "/publications"                   (controller:"publication", action:"allPublications")
        get     "/publications/$publicationId"    (controller:"publication", action:"showPublicationById")

        post    "/publication/$publicationId/chat"(controller:"chat"       , action:"addMessageToChatPublication")
        post    "/api/login"                      (controller:"user"       , action:"loginUser")
        post    "/register"                       (controller:"user"       , action:"registerUser")

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
