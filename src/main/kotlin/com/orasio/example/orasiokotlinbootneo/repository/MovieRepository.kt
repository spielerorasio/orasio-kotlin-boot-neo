package com.orasio.example.orasiokotlinbootneo.repository

import com.orasio.example.orasiokotlinbootneo.model.MovieEntity
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository
import reactor.core.publisher.Mono


interface MovieRepository : ReactiveNeo4jRepository<MovieEntity?, String?> {
    fun findOneByTitle(title: String?): Mono<MovieEntity?>?
}