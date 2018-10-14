package com.wiseassblog.catalyft

import com.wiseassblog.domain.domainmodel.Exercise
import com.wiseassblog.domain.domainmodel.ExerciseTemplate
import com.wiseassblog.domain.domainmodel.Set
import com.wiseassblog.domain.domainmodel.Workout

//This file contains Test objects which we will use to run against our
//Unit Tests for Interactors

class DomainTestObjects {
    //ID comes from creation
    val TEST_WORKOUT_ID = "12345687"

    val TEST_WORKOUT_NAME = "Biceps and Calfs"

    val TEST_CREATION_DATE = "10/09/2018"

    val TEST_EXERCISE_NAME = "Bicep Curls"

    val TEST_EXERCISE_TYPE = "Isolation"

    val TEST_MUSCLE_GROUP = "Biceps"

    val TEST_UOW = "Kgs"

    val TEST_REPS_TYPE = "Reps"

    val TEST_REP_NUMBER = 10

    val TEST_WEIGHT = 35.0

    val TEST_MODALITY = "Repetitions"


    val TEST_SET: com.wiseassblog.domain.domainmodel.Set = Set(
            TEST_REP_NUMBER,
            TEST_WEIGHT,
            0
    )

    val TEST_EXERCISE: Exercise = Exercise(
            TEST_EXERCISE_NAME,
            TEST_EXERCISE_TYPE,
            listOf(TEST_MUSCLE_GROUP,
                    TEST_MUSCLE_GROUP),
            TEST_UOW,
            TEST_REPS_TYPE,
            "",
            listOf(TEST_SET,
                    TEST_SET,
                    TEST_SET)
    )

    val TEST_WORKOUT: Workout = Workout(TEST_WORKOUT_NAME,
            TEST_CREATION_DATE,
            listOf(TEST_EXERCISE,
                    TEST_EXERCISE,
                    TEST_EXERCISE))

    val TEST_EXERCISE_TEMPLATE: ExerciseTemplate = ExerciseTemplate("000000",
            TEST_EXERCISE_NAME,
            TEST_EXERCISE_TYPE,
            listOf(TEST_MUSCLE_GROUP),
            TEST_MODALITY,
            true,
            false)
}

