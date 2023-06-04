package com.example.gymfit15.controller

import com.example.gymfit15.model.Usuario
import com.example.gymfit15.repository.ClienteRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.http.ResponseEntity
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class UsuarioController(
    private val ClienteRepository: ClienteRepository
) {

    @GetMapping("/listaUsuarios")
    fun getUsuario(): List<Usuario> =
        ClienteRepository.findAll()


    @PostMapping("/usuario")
    fun createNewUsuario(@Valid @RequestBody usuario: Usuario): Usuario {
        return  ClienteRepository.save(usuario)
    }


    @GetMapping("/usuario/{idUsuario}")
    fun getUsuarioById(@PathVariable(value = "idUsuario") idUsuario: Long):
            ResponseEntity<Usuario> {
        val usuario = ClienteRepository.findById(idUsuario)
        return if (usuario.isPresent) {
            ResponseEntity.ok(usuario.get())
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @PutMapping("/usuario/{idUsuario}")
    fun updateUsuarioById(
        @PathVariable(value = "idUsuario") idUsuario: Long,
        @Valid @RequestBody newUsuario: Usuario
    ): ResponseEntity<Usuario> {
        return ClienteRepository.findById(idUsuario).map { existingUsuario ->
            val updatedUsuario: Usuario = existingUsuario
                .copy(
                    name = newUsuario.name,
                    senha = newUsuario.senha,
                    email = newUsuario.email,
                    altura = newUsuario.altura,
                    peso = newUsuario.peso,
                    treino = newUsuario.treino,
                    exercicio = newUsuario.exercicio
                )
            ResponseEntity.ok().body(ClienteRepository.save(updatedUsuario))
        }.orElse(ResponseEntity.notFound().build())
    }

    @DeleteMapping("/usuario/{idUsuario}")
    fun deleteArticleById(@PathVariable(value = "idUsuario") idUsuario: Long): ResponseEntity<Void> {
        return ClienteRepository.findById(idUsuario).map { usuario ->
            ClienteRepository.delete(usuario)
            ResponseEntity<Void>(HttpStatus.OK)
        }.orElse(ResponseEntity.notFound().build())
    }

}