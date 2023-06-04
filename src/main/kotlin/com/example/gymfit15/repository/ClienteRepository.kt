package com.example.gymfit15.repository

import com.example.gymfit15.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClienteRepository : JpaRepository<Usuario, Long>{
    fun findByEmail(email: String): Usuario?

}