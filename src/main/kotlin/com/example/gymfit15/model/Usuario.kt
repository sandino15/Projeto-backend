package com.example.gymfit15.model

import org.springframework.context.annotation.Lazy
import javax.persistence.*
import javax.validation.constraints.NotBlank

@Lazy
@Entity
@Table(name = "usuario")
data class Usuario(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,

    @get: NotBlank
    val name: String,

    @get: NotBlank
    var nascimento:String,

    @get: NotBlank
    var altura:String,

    @get: NotBlank
    var peso:String,

    @get: NotBlank
    val email: String,

    @get: NotBlank
    val senha: String,

    @OneToMany(targetEntity = Treino::class)
    val treino: List<Treino>,

    @OneToMany(targetEntity = Exercicio::class)
    val exercicio: List<Exercicio>
)
