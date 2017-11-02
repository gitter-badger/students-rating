package ratings.student.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ratings.student.service.CountRatingService;

import java.util.Map;

@Controller
public class RatingController {

    @Autowired
    CountRatingService service;

    private final static String GROUP_NAME = "group name";
    private final static String SEMESTER_NAME = "semester 1";

    @RequestMapping( value = "/rating", method = RequestMethod.GET )
    public String showRating( Map<String, Object> model ) {

        model.put("studentRating", service.countStudentsRating( GROUP_NAME, SEMESTER_NAME ) );
        return "rating";
    }
}
