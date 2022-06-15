/*
 * LoggingWithAspectJ - Logging with AspectJ
 * Copyright (C) 2007 Christian Schenk
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA
 */
package aspects;

import io.swagger.model.User;
import io.swagger.service.UserRepository;
import io.swagger.service.UserService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Aspect
public class Test {
	Boolean shown = false;
	@Autowired
	private UserRepository userRepository;

	@Pointcut(" execution(* io.swagger.service.*.*(..))")
    protected void allMethod() {
		System.out.println("Aspect works...2");
    }
	
	/**
	 * Will log every execution of User's methods
	 */
	@Around("execution(* io.swagger.service.*.*(..))")
	public Object doThing(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("API is called");
	    return joinPoint.proceed();
	}

	/**
	 * Will log after every execution of User's methods
	 */
	@After("execution(* io.swagger.service.*.*(..))")
	public void doThingAfter() throws Throwable {
		if(!shown) {
			List<User> users = new ArrayList<User>();
			users.addAll(userRepository.findAll());
			System.out.println("Users count: ");
			System.out.println(users.size());
		}
		shown = true;
	}
}