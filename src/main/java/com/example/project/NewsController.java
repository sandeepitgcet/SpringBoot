package com.example.project;

import java.net.URI;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/")
public class NewsController {
	
	static RestTemplate restTemplate;

  @Autowired
  NewsService newsService;
  
  @RequestMapping(value = "/news", method = RequestMethod.GET)
  		public String show() throws Exception{
	    return "hello"; 
  }
	
 
	  @RequestMapping(value = "/news/topstories", method = RequestMethod.GET)
	  public News getNews() throws Exception{
	  System.out.println("Enter NewsCOntroller.java -->  getNews() Method"); News
	  news = newsService.getTopStories();
	  
	  System.out.println("Exit NewsCOntroller.java -->  getNews() Method"); 
	  return news; }
	 
  
	/*
	 * @RequestMapping(value = "/news/topstories", method = RequestMethod.GET)
	 * public ResponseEntity<News> getNews() throws Exception{
	 * System.out.println("Enter NewsCOntroller.java -->  getNews() Method"); 
	 * News news = newsService.getTopStories(); 
	 * URI location = new URI("/api/news/topstories"); 
	 * HttpHeaders responseHeaders = new HttpHeaders();
	 * responseHeaders.setLocation(location);
	 * System.out.println("Exit NewsCOntroller.java -->  getNews() Method"); return
	 * new ResponseEntity<News>(news, responseHeaders, HttpStatus.OK); }
	 */
  
  
  


}
