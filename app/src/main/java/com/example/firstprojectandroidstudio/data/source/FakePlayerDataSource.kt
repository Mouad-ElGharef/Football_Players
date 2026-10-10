package com.example.firstprojectandroidstudio.data.source

import com.example.firstprojectandroidstudio.domain.model.Player

class FakePlayerDataSource {
    val playersList = listOf(
        Player(
            id = 1,
            name = "Ronaldo",
            position = "Attacker",
            team = "Al Nassr",
            shirtNumber = 7
        ),
        Player(
            id = 2,
            name = "Messi",
            position = "Midfielder",
            team = "Miami",
            shirtNumber = 10
        ),
        Player(
            id = 3,
            name = "Hakimi",
            position = "Defender",
            team = "Paris Saint Germain",
            shirtNumber = 2
        )
    )
}