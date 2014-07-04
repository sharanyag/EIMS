package com.imac.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	@Autowired
	private UserManager userManager;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listUser(ModelMap map) 
	{
		map.addAttribute("user", new UserEntity());
		map.addAttribute("userList", userManager.getAllUsers());
		
		return "editUserList";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addUser(@ModelAttribute(value="user") UserEntity user, BindingResult result) 
	{
		userManager.addUser(user);
		return "redirect:/";
	}

	@RequestMapping("/delete/{loginname}")
	public String deleteUser(@PathVariable("loginname") Integer userId)
	{
		userManager.deleteUser(userId);
		return "redirect:/";
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
}
