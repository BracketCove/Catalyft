package com.wiseassblog.domain.interactor

import com.wiseassblog.domain.domainmodel.Result
import com.wiseassblog.domain.domainmodel.Workout
import com.wiseassblog.domain.repository.IWorkoutRepository

/**
 * WorkoutInteractor is an Interactor for operations which need to occur on a conceptual workout object (or Objects)
 */
class WorkoutInteractor(val workoutRepository: IWorkoutRepository) {

    suspend fun getWorkout(creationDate: String): Result<Exception, Workout> {
        return workoutRepository.getWorkoutById(creationDate)
    }

    suspend fun updateWorkout(workout: Workout): Result<Exception, Workout> {
        return workoutRepository.updateWorkout(workout)
    }

    suspend fun deleteWorkout(tesT_WORKOUT_ID: String): Result<Exception, Boolean> {
        return TODO()
    }

    suspend fun getWorkoutsByDay(dateByDay: String): Result<Exception, Workout> {
        return TODO()
    }

    suspend fun getWorkoutsByMonth(dateByMonth: String): Result<Exception, Workout> {
        return TODO()
    }
}