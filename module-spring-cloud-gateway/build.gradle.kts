plugins {
}

version = "0.0.1-SNAPSHOT"

dependencies {
    // (모듈)

    // (Spring Cloud Gateway)
    implementation("org.springframework.cloud:spring-cloud-starter-gateway:4.1.6")

    // (Eureka Client)
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:4.1.4")
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:2023.0.0") // Cloud version
    }
}