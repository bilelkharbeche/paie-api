package dev.paie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.paie.entites.RemunerationEmploye;

/**
 * @author KHARBECHE Bilel
 *
 */
public interface RemunerationEmployeRepository extends JpaRepository<RemunerationEmploye, Integer> {

	RemunerationEmploye findByMatricule(String matricule);

}
