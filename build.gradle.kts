plugins {
    kotlin("jvm") version "2.1.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    //프로젝트에서 필요한 라이브러리 등록.
    //json은 일반적으로 문자열이다. 이 문자열을 해석해서 우리가 원하는 데이터를
    //추출한다. 이를 파싱이라 하며 이 json파싱 라이브러리가 많다.
    implementation("com.google.code.gson:gson:2.8.2")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(11)
}
