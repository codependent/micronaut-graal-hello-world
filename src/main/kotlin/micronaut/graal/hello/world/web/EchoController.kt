package micronaut.graal.hello.world.web

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable

@Controller("/echo")
class EchoController {

    @Get
    fun getEcho(): String {
        return """{"echo" : "echo"}"""
    }

    @Get("/{echo}")
    fun getEcho(@PathVariable echo: String): String {
        return """{"echo" : "$echo"}"""
    }

}
