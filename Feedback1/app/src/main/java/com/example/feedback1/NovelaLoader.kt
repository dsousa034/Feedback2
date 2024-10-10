package com.example.feedback1

import android.content.Context
import androidx.loader.content.AsyncTaskLoader

class NovelaLoader(context: Context, private val viewModel: NovelaViewModel) : AsyncTaskLoader<List<Novela>>(context) {
    override fun loadInBackground(): List<Novela>? {
        Thread.sleep(2000)
        return viewModel.novelas
    }

    override fun onStartLoading() {
        forceLoad()
    }
}