package com.br.zupedu.carros

import javax.annotation.processing.Generated
import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
class Carro(
    @field:NotBlank
    @Column(nullable = false)
    val modelo:String,

    @field:NotBlank
    @Column(nullable=false, unique = true)
    val placa: String

) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long? = null

}