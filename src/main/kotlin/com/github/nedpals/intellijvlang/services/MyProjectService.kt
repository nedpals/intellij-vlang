package com.github.nedpals.intellijvlang.services

import com.intellij.openapi.project.Project
import com.github.nedpals.intellijvlang.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
