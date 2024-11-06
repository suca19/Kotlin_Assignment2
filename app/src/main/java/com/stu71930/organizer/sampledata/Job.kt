package com.stu71930.organizer.sampledata

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName ="user_table" )
data class Job {
    val customerName: String,
    val location: String,
    val jobType: JobType,
    val dateFrom: Date,
    val dateTo: Date
}