package com.example.gymfit15.model

import org.springframework.context.annotation.Lazy
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Lazy
@Entity
data class Exercicio(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,

    @get: NotBlank
    val mome: String,

    @get: NotBlank
    val descricao: String,

    @get: NotBlank
    val musculo: String,


)