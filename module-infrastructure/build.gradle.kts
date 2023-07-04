tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}

dependencies {
    api("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation(project(":module-domain"))
    testImplementation(project(":module-application"))

    runtimeOnly("com.h2database:h2")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("com.h2database:h2")
}
