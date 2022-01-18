plugins {
    kotlin("jvm")
    id("jacoco")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.7.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    api(platform("org.springframework.boot:spring-boot-dependencies:2.5.8"))
    if (!project.hasProperty("removeThatDependency")) {
        runtimeOnly("org.codehaus.janino:janino")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
