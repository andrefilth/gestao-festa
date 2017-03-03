package com.andre.algaworks.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andre.algaworks.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
