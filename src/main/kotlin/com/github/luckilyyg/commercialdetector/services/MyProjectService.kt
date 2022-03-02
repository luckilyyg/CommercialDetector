package com.github.luckilyyg.commercialdetector.services

import com.intellij.openapi.project.Project
import com.github.luckilyyg.commercialdetector.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
