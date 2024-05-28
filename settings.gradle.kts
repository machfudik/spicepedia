pluginManagement {
    repositories {
<<<<<<< HEAD
        google()
=======
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
>>>>>>> f4e6924ac145bb50c0463fcc9c0173062cc7737a
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

<<<<<<< HEAD
rootProject.name = "Spicepedia"
include(":app")
 
=======
rootProject.name = "Capstone Bangkit"
include(":app")
>>>>>>> f4e6924ac145bb50c0463fcc9c0173062cc7737a
