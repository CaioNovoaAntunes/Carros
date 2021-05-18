package com.br.zupedu.carros;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010\f\u001a\u00020\nH\u0007J\b\u0010\r\u001a\u00020\nH\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lcom/br/zupedu/carros/CarroszupeduTest;", "", "()V", "repository", "Lcom/br/zupedu/carros/CarroRepository;", "getRepository", "()Lcom/br/zupedu/carros/CarroRepository;", "setRepository", "(Lcom/br/zupedu/carros/CarroRepository;)V", "cleanUp", "", "deve encontrar carro por placa", "deve inserir um novo caro", "setup", "carroszupedu"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest(rollback = false, transactionMode = io.micronaut.test.annotation.TransactionMode.SINGLE_TRANSACTION, transactional = false)
public final class CarroszupeduTest {
    @javax.inject.Inject()
    public com.br.zupedu.carros.CarroRepository repository;
    
    @org.jetbrains.annotations.NotNull()
    public final com.br.zupedu.carros.CarroRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.br.zupedu.carros.CarroRepository p0) {
    }
    
    @org.junit.jupiter.api.BeforeEach()
    public final void setup() {
    }
    
    @org.junit.jupiter.api.AfterEach()
    public final void cleanUp() {
    }
    
    public CarroszupeduTest() {
        super();
    }
}