package com.omk.disneycodechallenge.presentation

data class UiState(
    val guestNeedReservation:Boolean=false,
    val guestHaveReservation:Boolean=false,
    val countGuestsHaveReservation:Int=0,
    val countGuestsNeedReservation:Int=0,
)