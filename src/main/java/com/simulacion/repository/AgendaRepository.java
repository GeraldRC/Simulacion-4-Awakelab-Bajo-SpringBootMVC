package com.simulacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simulacion.entity.Agenda;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Integer> {

}
