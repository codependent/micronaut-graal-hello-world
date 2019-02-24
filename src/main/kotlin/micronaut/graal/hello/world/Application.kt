package micronaut.graal.hello.world

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("micronaut.graal.hello.world")
                .mainClass(Application.javaClass)
                .start()
    }
}