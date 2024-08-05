package comn.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
	@RequestMapping(value = "/login.do")
	public String logon() throws Exception {

		System.out.println("\n\n\n\n\n 로그인 ");


		return "comn/login";
	}
}
