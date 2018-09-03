package com.wiseassblog.domain.domainmodel

data class Exercise(var name:String,
                    var type: String,
                    var muscleGroups: List<String>,
                    var unitOfWeight:String,
                    var repsType: String,
                    var note: String,
                    var sets: List<Set>)