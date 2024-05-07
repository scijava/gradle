rootProject.name = "gradle-scijava"

for (file in rootDir.listFiles()!!)
    if (file.resolve("build.gradle.kts").exists())
        include(file.name)
