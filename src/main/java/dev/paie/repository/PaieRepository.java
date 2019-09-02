package dev.paie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.paie.entites.Entreprise;

public interface PaieRepository extends JpaRepository<Entreprise, Integer> {

}
