package com.example.firstprojectandroidstudio.presentation

import androidx.lifecycle.ViewModel
import com.example.firstprojectandroidstudio.domain.usecase.GetPlayersUseCase

class PlayerViewModel(
    private val getPlayerUseCase: GetPlayersUseCase
): ViewModel() {
    fun getPlayers() = getPlayerUseCase.execute()
}