package com.example.feedback1

import android.app.job.JobParameters
import android.app.job.JobService
import android.os.AsyncTask
import android.widget.Toast

class SyncJobService : JobService() {

    override fun onStartJob(params: JobParameters?): Boolean {
        SyncTask(this).execute(params)
        return true
    }

    override fun onStopJob(params: JobParameters?): Boolean {
        return true
    }

    private class SyncTask(val jobService: SyncJobService) : AsyncTask<JobParameters, Void, JobParameters?>() {
        override fun doInBackground(vararg params: JobParameters?): JobParameters? {
            // Simulate data synchronization with a remote server
            Thread.sleep(3000) // Simulate a delay
            return params[0]
        }

        override fun onPostExecute(result: JobParameters?) {
            Toast.makeText(jobService, "Data synchronization complete", Toast.LENGTH_SHORT).show()
            NotificationUtils.showNotification(jobService, "Sync Complete", "Data synchronization is complete.")
            jobService.jobFinished(result, false)
        }
    }
}