package com.wiseassblog.domain.interactor

import com.wiseassblog.domain.domainmodel.WorkoutTemplate
import com.wiseassblog.domain.domainmodel.Result
import com.wiseassblog.domain.repository.IWorkoutTemplateRepository

class WorkoutTemplateInteractor(local: IWorkoutTemplateRepository,
                                remote: IWorkoutTemplateRepository){

    suspend fun getWorkoutTemplate(name: String): Result<WorkoutTemplate, Exception> {
        return TODO()
    }

    suspend fun updateWorkoutTemplate(template: WorkoutTemplate): Result<WorkoutTemplate, Exception> {
        return TODO()
    }

    suspend fun deleteWorkoutTemplate(): Result<Boolean, Exception> {
        return TODO()
    }

    suspend fun getWorkoutTemplatesByFilters(filters:List<String>): Result<WorkoutTemplate, Exception> {
        return TODO()
    }
}