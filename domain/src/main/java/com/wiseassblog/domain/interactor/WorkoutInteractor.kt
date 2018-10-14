package com.wiseassblog.domain.interactor

import com.wiseassblog.domain.domainmodel.Result
import com.wiseassblog.domain.domainmodel.Workout
import com.wiseassblog.domain.repository.IWorkoutRepository

/**
 * WorkoutInteractor is an Interactor for operations which need to occur on a conceptual workout object (or Objects)
 */
class WorkoutInteractor(val workoutRepository: IWorkoutRepository) {

    suspend fun getWorkout(creationDate: String): Result<Workout, Exception> {
        return TODO() //returns Nothing (special Kotlin type)
    }

    suspend fun updateWorkout(): Result<Workout, Exception> {
        return TODO()
    }

    suspend fun deleteWorkout(): Result<Boolean, Exception> {
        return TODO()
    }

    suspend fun getWorkoutsByDay(dateByDay: String): Result<Workout, Exception> {
        return TODO()
    }

    suspend fun getWorkoutsByMonth(dateByMonth: String): Result<Workout, Exception> {
        return TODO()
    }
}