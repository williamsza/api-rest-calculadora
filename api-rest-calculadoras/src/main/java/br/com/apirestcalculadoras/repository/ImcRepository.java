package br.com.apirestcalculadoras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.apirestcalculadoras.model.Imc;

@Repository
public interface ImcRepository extends JpaRepository<Imc, Integer>{





}