package dev.paie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.paie.entites.ProfilRemuneration;

/**
 * @author KHARBECHE Bilel
 *
 */
public interface ProfilRemunerationRepository extends JpaRepository<ProfilRemuneration, Integer> {

	ProfilRemuneration findByCode(String code);

}
