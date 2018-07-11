package chai.controll;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import chai.biz.Userbiz;

@Controller
@RequestMapping("/Userbean")
public class controll {
	
	@Resource(name="userBiz")
	private Userbiz userBiz;
	@RequestMapping("/selectAll")
	public String selectAll(HttpServletRequest requst) {
		requst.setAttribute("userList", userBiz.selectAll());
		return "index";
		
	}

	@RequestMapping("/delUser")
	public void delUser(String id,HttpServletResponse response){
		
		String result = "{\"result\":\"error\"}";
		
		if(userBiz.delete(id)){
			result = "{\"result\":\"success\"}";
		}
		
		response.setContentType("application/json");
		
		try {
			PrintWriter out = response.getWriter();
			out.write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    
}
