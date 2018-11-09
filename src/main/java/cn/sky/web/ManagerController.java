package cn.sky.web;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sky.entity.Manager;
import cn.sky.service.ManagerExistException;
import cn.sky.service.ManagerService;
import cn.sky.service.NameException;
import cn.sky.service.PasswordException;
import cn.sky.util.JsonResult;

@Controller
@RequestMapping("/manager")
public class ManagerController {

	@Resource
	private ManagerService managerService;

	@RequestMapping("/manager.do")
	public void sendIndex(HttpServletRequest request,HttpServletResponse response) throws IOException{
		response.sendRedirect("/Skylib/managerlogin.jsp");
	}

	
	@RequestMapping("/pwd_modify.do")
	public void Modifypwd(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.sendRedirect("../pwd_ModifyLogin.jsp");
	}
	@RequestMapping("/pwdlogin.do")
	public void pwdLogin(String name,String password,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		Manager manager = managerService.login(name, password);
		if(manager!=null){
			request.getSession(true).setAttribute("manager", manager);
			request.getRequestDispatcher("../pwd_Modify.jsp").forward(request, response);
		}
		else {
			throw new RuntimeException("”√ªß√˚√‹¬Î¥ÌŒÛ");
		}
	}
	@RequestMapping("/update.do")
	public void updatepwd(String name,String holdpwd,String pwd1, HttpServletRequest request,HttpServletResponse response) throws IOException{
		Manager manager = managerService.login(name, holdpwd);
		manager.setPwd(pwd1);
		managerService.updateManager(manager);
		response.sendRedirect("../pwd_ok.jsp");
	}
	
	@RequestMapping("/login.do")
	@ResponseBody
	public JsonResult<Manager> login(String name,String password){
		try{
			Manager manager = managerService.login(name, password);
			return new JsonResult<Manager>(manager);
		}catch(NameException e){
			return new JsonResult<Manager>(e);
		}catch(PasswordException e){
			return new JsonResult<Manager>(e);
		}catch (Exception e) {
            e.printStackTrace();
            return new JsonResult<Manager>(e);
		}
		
	}
	
	@RequestMapping("/add.do")
	@ResponseBody
	public JsonResult<Manager> add(String name,String password){
			try{
				Manager manager = managerService.addManager(name, password);
				return new JsonResult<Manager>(manager);
			}catch(ManagerExistException e){
				e.printStackTrace();
				return new JsonResult<Manager>(e);
			}
	}
	
	
}
