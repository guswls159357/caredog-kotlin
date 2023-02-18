package com.example.caredog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CaredogApplication

fun main(args: Array<String>) {
	runApplication<CaredogApplication>(*args)
}
