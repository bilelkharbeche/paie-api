package dev.paie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.paie.entites.BulletinSalaire;

/**
 * @author KHARBECHE Bilel
 *
 */
public interface BulletinSalaireRepository extends JpaRepository<BulletinSalaire, Integer> {

	BulletinSalaire findById(String id);

}
