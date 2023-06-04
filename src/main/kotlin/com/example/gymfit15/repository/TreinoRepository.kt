package com.example.gymfit15.repository

import com.example.gymfit15.model.Treino
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TreinoRepository : JpaRepository<Treino, Long>