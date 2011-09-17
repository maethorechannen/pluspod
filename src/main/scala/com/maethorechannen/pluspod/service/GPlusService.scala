package com.maethorechannen.pluspod.service

import org.springframework.beans.factory.annotation.Value 
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter

@Service
class GPlusService {

	@Value("#{apiProperties.key}") var apiKey = ""

	def people(userId: String) : java.util.Map[_,_] = {
		return doGet("https://www.googleapis.com/plus/v1/people/" + userId)
	}


	def doGet(uri: String) : java.util.Map[_,_] = {
		val rt = new RestTemplate();
		val l = new java.util.ArrayList[org.springframework.http.converter.HttpMessageConverter[_]]()
		l.add(new MappingJacksonHttpMessageConverter())
		rt.setMessageConverters(l)
		val r = rt.getForObject(uri + "?key=" + apiKey, classOf[java.util.Map[_,_]])
		return r
	}
}
