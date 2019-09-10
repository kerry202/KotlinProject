package com.example.demo.https

object SchedulerUtils {

    fun  <T> ioToMain(): IoMainScheduler<T>{
        println("  login iomain  ")
        return IoMainScheduler()
    }
}