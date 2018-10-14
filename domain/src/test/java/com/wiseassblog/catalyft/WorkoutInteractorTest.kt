package com.wiseassblog.catalyft

import com.wiseassblog.domain.domainmodel.Result
import com.wiseassblog.domain.interactor.WorkoutInteractor
import com.wiseassblog.domain.repository.IWorkoutRepository
import kotlinx.coroutines.experimental.runBlocking
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class WorkoutInteractorTest {

    lateinit var interactor: WorkoutInteractor

    val test = DomainTestObjects()

    @Mock
    lateinit var repo: IWorkoutRepository

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)

        interactor = WorkoutInteractor(repo)
    }

    //Note: When testing a suspending function, run blocking needs type param <Unit>
    @Test
    fun GetWorkoutByIdSuccessful() = runBlocking<Unit> {

        Mockito.`when`(repo.getWorkoutById(test.TEST_WORKOUT_ID))
                .thenReturn(
                        Result.build { test.TEST_WORKOUT }
                )
        //Unconfined is like Schedulers.trampoline()


        //this is the unit we'd like to test
        interactor.getWorkout(test.TEST_CREATION_DATE)

        Mockito.verify(repo).getWorkoutById(test.TEST_WORKOUT_ID)

    }

//    @Test
//    fun GetWorkoutByIdFailure() = runBlocking {
//
//        Result.buildError(Exception(""))
//
//        Mockito.`when`(con.provideBackgroundContext())
//                .thenReturn(Unconfined)
//
////        Mockito.`when`(repo.getWorkoutById(test.TEST_WORKOUT_ID))
////                .thenReturn(
////
////                )
//        //Unconfined is like Schedulers.trampoline()
//
//
//        //this is the unit we'd like to test
//        interactor.getWorkout(test.TEST_CREATION_DATE)
//
//        Mockito.verify(repo.)
//    }

}
