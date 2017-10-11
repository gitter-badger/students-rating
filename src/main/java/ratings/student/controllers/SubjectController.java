package ratings.student.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ratings.student.domain.SubjectEntity;
import ratings.student.repositories.SubjectRepository;

import java.util.List;
import java.util.Map;

/**
 * {@link Controller} for a {@link SubjectEntity}.
 */
@Controller
@RequestMapping( value = "/subjects")
public class SubjectController {

    @Autowired
    SubjectRepository subjectRepository;

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    public String showSubjects( Map<String, Object> model ) {
        List<SubjectEntity> subjectEntities = subjectRepository.findAll();
        model.put( "subjects", subjectEntities );
        return "subjects";
    }
}
