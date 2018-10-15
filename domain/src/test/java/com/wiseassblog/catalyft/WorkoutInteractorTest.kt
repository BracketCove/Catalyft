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
    // If you're not sure, Unit is basically Kotlin's equivalent to Void
    @Test
    fun `Get Workout By Id Successful`() = runBlocking<Unit> {

        Mockito.`when`(repo.getWorkoutById(test.TEST_WORKOUT_ID))
                .thenReturn(
                        Result.build { test.TEST_WORKOUT }
                )


        //this is the unit we'd like to test
        interactor.getWorkout(test.TEST_WORKOUT_ID)

        Mockito.verify(repo).getWorkoutById(test.TEST_WORKOUT_ID)
    }

    @Test
    fun `Update Workout Successful`() = runBlocking<Unit> {

        Mockito.`when`(repo.getWorkoutById(test.TEST_WORKOUT_ID))
                .thenReturn(
                        Result.build { test.TEST_WORKOUT }
                )


        //this is the unit we'd like to test
        interactor.updateWorkout(test.TEST_WORKOUT)

        Mockito.verify(repo).updateWorkout(test.TEST_WORKOUT)
    }

    @Test
    fun `Delete workout successful`() = runBlocking<Unit> {

        Mockito.`when`(repo.getWorkoutById(test.TEST_WORKOUT_ID))
                .thenReturn(
                        Result.build { test.TEST_WORKOUT }
                )


        //this is the unit we'd like to test
        interactor.deleteWorkout(test.TEST_WORKOUT_ID)

        Mockito.verify(repo).getWorkoutById(test.TEST_MODALITY)
    }

    @Test
    fun `Get workouts by day successful`() = runBlocking<Unit> {

        Mockito.`when`(repo.getWorkoutById(test.TEST_WORKOUT_ID))
                .thenReturn(
                        Result.build { test.TEST_WORKOUT }
                )


        //this is the unit we'd like to test
        interactor.getWorkoutsByDay(test.TEST_WORKOUT_ID)

        Mockito.verify(repo).getWorkoutById(test.TEST_MODALITY)
    }


    @Test
    fun `Get workouts by month`() = runBlocking<Unit> {

        Mockito.`when`(repo.getWorkoutById(test.TEST_WORKOUT_ID))
                .thenReturn(
                        Result.build { test.TEST_WORKOUT }
                )


        //this is the unit we'd like to test
        interactor.getWorkoutsByMonth(test.TEST_WORKOUT_ID)

        Mockito.verify(repo).getWorkoutById(test.TEST_MODALITY)
    }



    /**
     * Test case for when an ID is malformed for some reason
     */
//    @Test
//    fun  `Get Workout By Id Failure`() = runBlocking {
//
//        Mockito.`when`(repo.getWorkoutById(test.TEST_WORKOUT_ID))
//                .thenReturn(
//                        Result.build { throw Error.IoDeviceFailure  }
//                )
//
//
//        //this is the unit we'd like to test
//        interactor.getWorkout(test.TEST_WORKOUT_ID)
//
//        Mockito.verify(repo).getWorkoutById(test.TEST_WORKOUT_ID)
//    }

}
