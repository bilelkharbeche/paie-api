package dev.paie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.paie.entites.Grade;

/**
 * @author KHARBECHE Bilel
 *
 */
public interface GradeRepository extends JpaRepository<Grade, Integer> {

	Grade findByCode(String code);

}
