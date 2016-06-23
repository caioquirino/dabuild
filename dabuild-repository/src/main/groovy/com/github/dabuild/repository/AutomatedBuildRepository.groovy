package com.github.dabuild.repository

import com.github.dabuild.repository.model.AutomatedBuild
import org.springframework.data.repository.PagingAndSortingRepository

interface AutomatedBuildRepository extends PagingAndSortingRepository<AutomatedBuild, Long> {

}
