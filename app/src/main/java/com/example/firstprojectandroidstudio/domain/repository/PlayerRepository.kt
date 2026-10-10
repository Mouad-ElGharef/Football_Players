package com.example.firstprojectandroidstudio.domain.repository

import com.example.firstprojectandroidstudio.domain.model.Player

interface PlayerRepository {
    fun getPlayers(): List<Player>
}