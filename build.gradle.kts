import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.0.2"
	id("io.spring.dependency-management") version "1.1.0"
	kotlin("jvm") version "1.7.22"
	kotlin("plugin.spring") version "1.7.22"
	kotlin("plugin.jpa") version "1.7.22"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	//web
	implementation("org.springframework.boot:spring-boot-starter-web")

	//validation
	implementation("org.springframework.boot:spring-boot-starter-validation")

	//db
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	runtimeOnly("com.h2database:h2")

	//kotlin
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

	//logging
	implementation ("io.github.microutils:kotlin-logging:2.1.23")

	// test
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation ("io.mockk:mockk:1.12.4")
	testImplementation("io.kotest:kotest-assertions-core-jvm:5.5.4")
	testImplementation("io.kotest:kotest-runner-junit5-jvm:5.5.4")
	implementation("com.ninja-squad:springmockk:4.0.0")

}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
