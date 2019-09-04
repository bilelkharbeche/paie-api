package dev.paie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.paie.entites.Entreprise;

/**
 * @author KHARBECHE Bilel
 *
 */
public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {

	Entreprise findByCode(String code);

}
