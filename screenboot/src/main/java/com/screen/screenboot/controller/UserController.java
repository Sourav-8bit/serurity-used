package com.screen.screenboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	
	
	
@GetMapping("/qqq")
public String GetMessage()
{
	return "yadav";
}

@GetMapping("/users")
public String user()
{
return "welcome sourav";
}


@GetMapping("/admin")
public String admin()
{
	return "star player";
}

}


