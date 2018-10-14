package com.wiseassblog.domain.domainmodel

data class ExerciseTemplate(val id: String,
                            var name: String,
                            var type: String,
                            var muscleGroups: List<String>,
                            var exerciseModality: String,
                            var isFavourite: Boolean,
                            var isCustom: Boolean)


