package dev.paie.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.paie.entites.Grade;
import dev.paie.service.GradeService;

/**
 * @author KHARBECHE Bilel
 *
 */
@RestController
public class GradeController {

	/** gradeService : GradeService */
	@Autowired
	private GradeService gradeService;

	/**
	 * @return la liste des grades
	 */
	@RequestMapping(value = "/grades", method = RequestMethod.GET)
	public List<GradeDTO> findGrade() {

		List<Grade> listeGrade = gradeService.RechercheGrade();
		List<GradeDTO> listeGradeDTO = new ArrayList<>();

		for (Grade gr : listeGrade) {
			GradeDTO gradeDTO = new GradeDTO(gr.getCode());

			listeGradeDTO.add(gradeDTO);
		}
		return listeGradeDTO;
	}

}
