package com.wiseassblog.domain.repository

import com.wiseassblog.domain.domainmodel.Result
import com.wiseassblog.domain.domainmodel.Workout

interface IWorkoutRepository   {
 fun getWorkoutById(id:String): Result<Exception, Workout>
}