package com.nit;



@Controller
public class AddController {

	@RequestMapping("/add")
	public String add() {
		return "display.jsp";
	}
}
