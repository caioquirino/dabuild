package com.github.dabuild.repository.model

import com.github.dabuild.repository.model.enumeration.BuildStatus

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Build implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id

    BuildStatus buildStatus

    @ManyToOne
    AutomatedBuild automatedBuild

    String dockerfile

    String logs

}
