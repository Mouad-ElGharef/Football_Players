package com.example.firstprojectandroidstudio.domain.usecase

import com.example.firstprojectandroidstudio.domain.model.Player
import com.example.firstprojectandroidstudio.domain.repository.PlayerRepository

class GetPlayersUseCase(
    private val repository: PlayerRepository
) {
    fun execute(): List<Player>{
        return repository.getPlayers()

    }
}