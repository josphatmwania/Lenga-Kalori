pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "LengaKalori"
include(":app")
include(":core")
include(":core-ui")
include(":onboarding:onboarding_presentation")
include(":onboarding:onboarding_domain")
