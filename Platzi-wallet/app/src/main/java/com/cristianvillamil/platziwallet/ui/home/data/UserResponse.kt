package com.cristianvillamil.platziwallet.ui.home.data

data class UserResponse(
    val id: String,
    val userName: String,
    val token: String,
    val userPhotoURL: String,
    val tokenTransfer: String
)