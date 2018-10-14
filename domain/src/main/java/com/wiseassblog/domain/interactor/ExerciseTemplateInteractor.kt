package com.wiseassblog.domain.interactor

import com.wiseassblog.domain.domainmodel.ExerciseTemplate
import com.wiseassblog.domain.domainmodel.Result
import com.wiseassblog.domain.repository.IExerciseTemplateRepository

class ExerciseTemplateInteractor(repository: IExerciseTemplateRepository){

    suspend fun getExerciseTemplate(name: String): Result<ExerciseTemplate, Exception> {
        return TODO()
    }

    suspend fun updateExerciseTemplate(template: ExerciseTemplate): Result<ExerciseTemplate, Exception> {
        return TODO()
    }

    suspend fun deleteExerciseTemplate(): Result<Boolean, Exception> {
        return TODO()
    }

    suspend fun getExerciseTemplatesByFilters(filters:List<String>): Result<ExerciseTemplate, Exception> {
        return TODO()
    }
}