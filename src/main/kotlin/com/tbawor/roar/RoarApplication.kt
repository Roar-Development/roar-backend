package com.tbawor.roar

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RoarApplication

fun main(args: Array<String>) {
    runApplication<RoarApplication>(*args)
}
