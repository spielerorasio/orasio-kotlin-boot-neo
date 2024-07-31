package com.orasio.example.orasiokotlinbootneo.model

import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node
import org.springframework.data.neo4j.core.schema.Property
import org.springframework.data.neo4j.core.schema.Relationship
import org.springframework.data.neo4j.core.schema.Relationship.Direction


@Node("Movie")
data class MovieEntity //Getters omitted for brevity

    (@field:Id
     val title: String?,

     @field:Property("tagline")
     val description: String?,

     @Relationship(type = "ACTED_IN", direction = Direction.INCOMING)
     val actors: Set<PersonEntity> = HashSet(),

     @Relationship(type = "DIRECTED", direction = Direction.INCOMING)
     val directors: Set<PersonEntity> = HashSet()
)