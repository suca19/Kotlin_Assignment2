package com.stu71930.organizer.sampledata


import android.content.Context
import androidx.room.RoomDatabase


abstract class jobDatabase : RoomDatabase() {
    abstract fun jobDao(): JobDao

    companion object {
        @Volatile
        private var INSTANCE: jobDatabase? = null

        fun getDatabase(context: Context): jobDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    jobDatabase::class.java,
                    "job_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
