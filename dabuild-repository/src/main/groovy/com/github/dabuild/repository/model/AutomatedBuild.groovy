package com.github.dabuild.repository.model

import com.github.dabuild.repository.model.enumeration.BuildType

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

class AutomatedBuild implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id

    BuildType buildType
    String name
    String dockerfileLocation
    String dockerTagName
}
