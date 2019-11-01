package com.wildcodeschool.imTheDoctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImTheDoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImTheDoctorApplication.class, args);
	}

}

	@RequestMapping("/")
	@ResponseBody
	public String index() {


		return
				"<ul>" + "<li><a href='/doctor/1'> Doctor 1 </a> </li>"
						+ "<li><a href='/doctor/2'> Doctor 2 </a> </li>"
						+ "<li><a href='/doctor/3'> Doctor 3 </a> </li>"
						+ "<li><a href='/doctor/4'> Doctor 4 </a></li>"
						+ "<li><a href='/doctor/10'> Doctor 10 </a></li>"
						+ "<li><a href='/doctor/13'> Doctor 13 </a></li>""
						+ "</ul>";

	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String index1() {


		return "William Hartnell";
	}

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String index2() {


		return "Peter Davison";
	}

	@RequestMapping("/doctor/3")
	@ResponseBody
	public String index3() {


		return "Sylvester McCoy";
	}

	@RequestMapping("/doctor/4")
	@ResponseBody
	public String index4() {


		return "Christopher Eccleston";
	}

	@RequestMapping("/doctor/10")
	@ResponseBody
	public String index5() {


		return "David Tennant";
	}

	@RequestMapping("/doctor/13")
	@ResponseBody
	public String index6() {


		return "Jodie Whittaker";
	}

}