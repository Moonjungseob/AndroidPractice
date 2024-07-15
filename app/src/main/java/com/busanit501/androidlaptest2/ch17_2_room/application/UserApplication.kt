//package com.busanit501.androidlaptest2.ch17_2_room.application
//
//import android.app.Application
//import com.busanit501.androidlaptest2.ch17_2_room.database.UserDatabase
//import com.busanit501.androidlaptest2.ch17_2_room.repository.UserRepository
//
//class UserApplication : Application() {
////    val applicationScope = CoroutineScope(SupervisorJob())
//    val database by lazy { UserDatabase.getDatabase(this) }
//    val repository by lazy { UserRepository(database.userDao()) }
//}