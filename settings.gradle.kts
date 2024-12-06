plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "Kotlin_Springboot_SpringCloudSample"

// (모듈 모음)
// !!!모듈 추가/수정시 아래에 반영!!!
include("module-spring-cloud-eureka1")
include("module-ms-spring-cloud-test1")
include("module-ms-spring-cloud-test2")
include("module-spring-cloud-gateway")
include("module-ms-spring-cloud-test1-rep")
include("module-spring-cloud-eureka2")
include("module-spring-cloud-eureka3")
