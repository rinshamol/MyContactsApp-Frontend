package com.example.mycontactsapp.model

data class Contact(
    val name : String,
    val phone : String,
    val email : String,
    val imageUrl : String? = null
)
