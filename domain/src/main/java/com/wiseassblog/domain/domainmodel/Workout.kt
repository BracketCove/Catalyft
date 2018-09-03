package com.wiseassblog.domain.domainmodel

data class Workout(var name: String,
                   val creationDate: String,
                   var exercise: List<Exercise>)