package com.hotechcourse.ouath.entity

import javax.persistence.*

@Entity
data class Member(
    @Column(unique = true) val username: String,
    val password: String,
    val name: String,
    @ElementCollection val authorities: Collection<String>,
    @Id @GeneratedValue(strategy = GenerationType.AUTO) var id:Long? = null
)