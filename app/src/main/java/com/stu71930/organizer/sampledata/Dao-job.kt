package com.stu71930.organizer.sampledata

interface JobDao {

    suspend fun insert(job: Job)


    suspend fun getAllJobs(): List<Job>


    suspend fun deleteJob(jobId: Int)
}