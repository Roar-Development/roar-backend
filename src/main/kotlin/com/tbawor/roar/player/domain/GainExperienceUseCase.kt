package com.tbawor.roar.player.domain

interface GainExperienceUseCase {
    fun gainExperience(playerId: Long, experience: Long)
}