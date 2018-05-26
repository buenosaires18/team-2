package backend

import grails.test.hibernate.HibernateSpec
import grails.testing.services.ServiceUnitTest

class UserServiceSpec extends HibernateSpec implements ServiceUnitTest<UserService>{

    User user
    UserService userService

    def setup() {
        user = new User("HurrellT","Tomás Hurrell","hurrelltomas@gmail.com","pass1234","tlh11")
        userService = new UserService()
    }

    def cleanup() {
    }

    def "A user service can save and recover a user"() {
        when:
            userService.registerUser(user)
        then:
            def recoveredUser = userService.getUser(user.id)
            recoveredUser.username          == user.username
            recoveredUser.fullName          == user.fullName
            recoveredUser.email             == user.email
            recoveredUser.password          == user.password
            recoveredUser.facebookUsername  == user.facebookUsername
            recoveredUser.publications      == user.publications
    }

    def "a user service cannot register a user trying to use a used username"() {
        when:
            userService.registerUser(user)
            def copycatUser = new User("HurrellT","CopyCat Pepe","pepe@mail.com","1234","pepe17")
            userService.registerUser(copycatUser)
        then:
            thrown(UsernameAlreadyRegistered)
    }


    def "a user follows a new hashtag"() {
        given:
        def aHash = new HashTag(name:"Trabajos")

        when:
        userService.followHashtag(user.id,aHash)
        def recoveredUser = userService.getUser(user.id)
        then:
        !recoveredUser.hashTags.isEmpty()
    }

    def "all the following hashtags are returned"() {
        given:
        def aHash = new HashTag(name:"Trabajos")
        def anotherHash = new HashTag(name:"Cursos")

        userService.followHashtag(publication.id,aHash)
        userService.followHashtag(publication.id,anotherHash)

        when:
        Set<HashTag> recoveredHashs = userService.getAllFollowingHashTags(user.id)
        then:
        !recoveredHashs.contains(aHash)
    }


    def "a user service can show all followed users by another user"() {
        when:
            def anotherUser = new User("IvanDom","Ivan Dominikov","ivandom@gmail.com","pass1234","ivandom")
            def thirdUser = new User("JpM","Juan Pablo Motessi","jpm@gmail.com","pass1234","juanMote")
            user.startFollowing(anotherUser)
            user.startFollowing(thirdUser)
            userService.registerUser(user)
        then:
            def followedUsers = userService.getAllFollowedUsersBy(user.id)
            followedUsers.size() == 2
    }

    def "a user service can show al followed user specific"(){
        when:
            User aOtherUser= new User("Hunter","Tomás Hurrell","hurrelltomas@gmail.com","pass1234","tlh11")
            userService.registerUser(user)
            userService.registerUser(aOtherUser)
            userService.followUser(user.id, aOtherUser.id)
        then:
             User recoveredUser = userService.getUser(user.id)
             recoveredUser.following.contains(aOtherUser)
    }
}
