package in.Ashokit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.Ashokit.binding.Student;

@Controller
public class StudentController {
	//method to load student form
	@GetMapping("/")
	public String loadForm(Model model) {
		List<String>courseList=new ArrayList<>();
		courseList.add("java");
		courseList.add("python");
		courseList.add("Devops");
		courseList.add("testing");
		
		List<String>timeList=new ArrayList<>();
		timeList.add("morning");
		timeList.add("evening");
		timeList.add("night");
		
		Student student=new Student();
		
		model.addAttribute("courses",courseList);
		model.addAttribute("times",timeList);
		model.addAttribute("student",student);
		
		return "index";
		
	}

}
