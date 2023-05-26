package ua.donetc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LiquibaseExampleApplication

fun main(args: Array<String>) {
	runApplication<LiquibaseExampleApplication>(*args)
}
