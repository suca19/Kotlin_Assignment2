package com.stu71930.organizer.sampledata


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.stu71930.organizer.sampledata.Job
import kotlinx.coroutines.launch

class JobViewModel(private val jobDao: JobDao) : ViewModel() {

    fun insertJob(job: Job) {
        viewModelScope.launch {
            jobDao.insert(job)
        }
    }

    fun getAllJobs() {
        viewModelScope.launch {
            val jobs = jobDao.getAllJobs()
            // Handle the list of jobs (e.g., update UI)
        }
    }

    fun deleteJob(jobId: Int) {
        viewModelScope.launch {
            jobDao.deleteJob(jobId)
        }
    }
}