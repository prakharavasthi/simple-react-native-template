package com.github.prakharavasthi.simplereactnativetemplate.services

import com.github.prakharavasthi.simplereactnativetemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
