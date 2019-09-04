package dev.paie.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.paie.entites.Grade;
import dev.paie.repository.GradeRepository;

/**
 * @author KHARBECHE Bilel
 *
 */
@Component
public class GradeService {

	/** LOG : Logger */
	private static final Logger LOG = LoggerFactory.getLogger(EntrepriseService.class);

	/** gradeRepository : GradeRepository */
	@Autowired
	private GradeRepository gradeRepository;

	/**
	 * @return la liste des grades
	 */
	public List<Grade> RechercheGrade() {

		List<Grade> listeGrade = gradeRepository.findAll();

		return listeGrade;
	}

}
