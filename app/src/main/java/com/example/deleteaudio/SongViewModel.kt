package com.example.deleteaudio

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SongViewModel : ViewModel() {
    var songs = MutableLiveData<MutableList<Song>>()
        private set

    fun updateSongs(newImages: MutableList<Song>) {
        songs.value = newImages
    }
}