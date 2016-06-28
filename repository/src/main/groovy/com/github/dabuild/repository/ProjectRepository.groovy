package com.github.dabuild.repository

import com.github.dabuild.repository.model.Project
import org.springframework.data.repository.PagingAndSortingRepository

interface ProjectRepository extends PagingAndSortingRepository<Project, Long> {

}
