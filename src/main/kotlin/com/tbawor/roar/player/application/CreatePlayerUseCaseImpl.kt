package com.tbawor.roar.player.application

import com.tbawor.roar.player.domain.CreatePlayerUseCase
import com.tbawor.roar.player.domain.Player

class CreatePlayerUseCaseImpl : CreatePlayerUseCase {
    override fun createCharacter(name: String): Player {
        return Player(name)
    }
}
