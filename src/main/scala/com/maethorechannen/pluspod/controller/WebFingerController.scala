package com.maethorechannen.pluspod.controller


import org.apache.commons.lang.builder.ToStringBuilder

import javax.servlet.http.HttpServletResponse

import org.springframework.beans.factory.annotation.Autowired 
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestMethod

import com.maethorechannen.pluspod.service.GPlusService

@Controller
@RequestMapping(Array("/webfinger"))	
class WebFingerController {

	@Autowired private var gplus : GPlusService = null; 

	@RequestMapping(method = Array(RequestMethod.GET))
	def webfinger(@RequestParam("q") q : String, hsr : HttpServletResponse) : Unit = {
		val p = gplus.people(q)

		hsr.getWriter().print(ToStringBuilder.reflectionToString(p))
	}
}
