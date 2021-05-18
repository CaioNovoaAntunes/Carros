package com.br.zupedu.carros

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.br.zupedu.carros")
		.start()
}

