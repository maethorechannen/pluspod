package com.maethorechannen.pluspod.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping(Array("/webfinger"))	
class WebFingerController {
	@RequestMapping(method = Array(RequestMethod.GET))
	def webfinger(@RequestParam("q") q : String):String = {
		"nowhere"
	}
}
