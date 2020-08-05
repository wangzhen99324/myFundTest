package com.github.wangzhen99324.myfundtest.services

import com.intellij.openapi.project.Project
import com.github.wangzhen99324.myfundtest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
