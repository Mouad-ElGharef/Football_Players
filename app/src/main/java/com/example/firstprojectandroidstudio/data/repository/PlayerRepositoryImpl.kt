package com.example.firstprojectandroidstudio.data.repository

import com.example.firstprojectandroidstudio.data.source.FakePlayerDataSource
import com.example.firstprojectandroidstudio.domain.model.Player
import com.example.firstprojectandroidstudio.domain.repository.PlayerRepository

class PlayerRepositoryImpl(val dataSource: FakePlayerDataSource) : PlayerRepository {
    override fun getPlayers(): List<Player> {
        return dataSource.playersList
    }
}