package com.example.gymfit15.repository

import com.example.gymfit15.model.Exercicio
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ExercicioRepository : JpaRepository<Exercicio, Long>