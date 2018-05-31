package cn.com.taiji.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class xyzController {
	
	@RequestMapping(value="/xyz")
	public String test1() {
		return "/hello" ;
	}
}
