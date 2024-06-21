package mk.ukim.finki.wp.kol2022.g2.web;

import mk.ukim.finki.wp.kol2022.g2.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses/add")
    public String showAddCourse(Model model) {
        return "course-form";
    }

    @PostMapping("/courses")
    public String createCourse(@RequestParam String name) {
        this.courseService.create(name);
        return "redirect:/students";
    }
}
