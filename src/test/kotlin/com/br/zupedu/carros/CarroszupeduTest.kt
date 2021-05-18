package com.br.zupedu.carros
import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.annotation.TransactionMode
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest(rollback = false, transactionMode = TransactionMode.SINGLE_TRANSACTION, transactional = false )
class CarroszupeduTest {

    @Inject
    lateinit var repository: CarroRepository

    @BeforeEach
    fun setup(){
        repository.deleteAll()
    }
    @AfterEach
    fun cleanUp(){
        repository.deleteAll()
    }

    @Test
    fun `deve inserir um novo caro`() {
        repository.save(Carro(modelo = "Gol", placa = "HPX-1234"))
        Assertions.assertEquals(1, repository.count())


    }//Commit
    @Test
    fun `deve encontrar carro por placa`(){
        // cenário
        repository.save(Carro(modelo ="Palio", placa = "OIP-9876"))
    // ação
    val encontrado = repository.existsByPlaca(placa ="OIP-9876")
        // validação
        assertTrue(encontrado)
    }
}


