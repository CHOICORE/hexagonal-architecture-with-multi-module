tasks.jar {
    enabled = true
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation(project(":module-interfaces"))
    implementation(project(":module-infrastructure"))
}