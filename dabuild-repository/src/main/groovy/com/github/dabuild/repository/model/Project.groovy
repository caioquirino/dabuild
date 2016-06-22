package com.github.dabuild.repository.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class Project implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id

    String name
    String shortDescription
    String repositoryUrl

    @OneToMany
    List<AutomatedBuild> automatedBuilds
}
