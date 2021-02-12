// tag::buildscript_block[]
buildscript {
    repositories {
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }
    dependencies {
        classpath("com.jfrog.bintray.gradle:gradle-bintray-plugin:0.4.1")
    }
}

apply(plugin = "com.jfrog.bintray")
// end::buildscript_block[]
