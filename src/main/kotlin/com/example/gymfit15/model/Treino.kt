package com.example.gymfit15.model

import org.springframework.context.annotation.Lazy
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Lazy
@Entity
data class Treino(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,
    @get: NotBlank
    val nome: String,
    @get: NotBlank
    val musculo: String,
    @get: NotBlank
    val serie: String,
@get: NotBlank
    val repeticoes: String,

)