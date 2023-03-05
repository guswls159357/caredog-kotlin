package com.example.caredog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class CaredogApplication

fun main(args: Array<String>) {
	runApplication<CaredogApplication>(*args)
}
