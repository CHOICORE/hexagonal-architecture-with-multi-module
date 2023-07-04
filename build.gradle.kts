plugins {
    java
    id("org.springframework.boot") version "3.1.1" // apply false
    id("io.spring.dependency-management") version "1.1.0" // apply false
}

allprojects {
    group = "me.choicore.ddd.module"
    version = "1.0-SNAPSHOT"
    repositories {
        mavenCentral()
    }
}


subprojects {
    apply(plugin = "java")
    apply(plugin = "java-library")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")

    dependencies {
        compileOnly("org.projectlombok:lombok")
        annotationProcessor("org.projectlombok:lombok")
    }

    tasks.withType<JavaCompile> {
        sourceCompatibility = "17"
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
