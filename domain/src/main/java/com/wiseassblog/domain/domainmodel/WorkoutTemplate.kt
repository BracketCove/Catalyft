package com.wiseassblog.domain.domainmodel

data class WorkoutTemplate(val id: String,
                           var name: String,
                           var muscleGroups: List<String>,
                           var image: String,
                           var workout: Workout
)