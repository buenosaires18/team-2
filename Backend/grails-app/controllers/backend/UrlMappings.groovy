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


        post    "/chat/$idUser1/$idUser2"         (controller:"chat"       , action:"messageToUser")
        get     "/chat/$idUser1/$idUser2"         (controller:"chat"       , action:"chatBetweenUsers")
        get     "/chat/$idUser1"                  (controller:"chat"       , action:"chatUsers")


        post    "/$idUser/follow/$idUser2"        (controller:"user"       , action:"followUser")
        get     "/$idUser/followingUsers"         (controller:"user"       , action:"followingUsers")
        post    "/$userID/follow/hashtag"         (controller:"user"       , action: "followHashtag")
        get     "/$userID/follow/hashtag"         (controller:"user"       , action: "followingsHashtag")
        get     "/$idUser/following/publications" (controller:"user"       , action: "allPublications")


        post    "/$publicationID/hashtag"         (controller:"publication", action: "addHashTag")


        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
