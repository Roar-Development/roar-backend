package com.tbawor.roar.player.domain

interface CreatePlayerUseCase {
    fun createCharacter(name: String): Player
}
