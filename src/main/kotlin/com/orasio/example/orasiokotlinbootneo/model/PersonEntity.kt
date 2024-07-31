package com.orasio.example.orasiokotlinbootneo.model

import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node

@Node("Person")
class PersonEntity //Getters omitted
    (private val born: Int?,
     @field:Id private val name: String)