plugins {
}

version = "0.0.1-SNAPSHOT"

dependencies {
    // (모듈)

    // (Spring Starter Web)
    // : 스프링 부트 웹 개발
    implementation("org.springframework.boot:spring-boot-starter-web:3.2.5")

    // (Eureka Server)
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-server:4.1.4")

    // (Spring Actuator)
    // : 서버 모니터링 정보
    implementation("org.springframework.boot:spring-boot-starter-actuator:3.3.5")
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:2023.0.0") // Cloud version
    }
}