package com.android.musicplayer.data.repository

import com.android.musicplayer.data.model.Playlist
import com.android.musicplayer.data.source.local.AppDatabase
import com.android.musicplayer.domain.repository.PlaylistRepository
        // how does the playlist will be created, find operation and deletion op
class PlaylistRepositoryImpl(private val appDatabase: AppDatabase) : PlaylistRepository{
    override fun createPlaylist(playlist: Playlist): Long { // creation
        return appDatabase.playlistDao.insert(playlist)
    }

    override fun getPlayLists(): List<Playlist>? {
        return appDatabase.playlistDao.loadAll()        // accessing
    }

    override fun delete(playlist: Playlist) {
        return appDatabase.playlistDao.delete(playlist)     // deletion of playlist
    }
}