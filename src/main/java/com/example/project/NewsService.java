package com.example.project;

//import com.example.project.Results;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {




	public News getTopStories() {
		System.out.println("Enter NewsService.java -->  getNews() Method");
	List<News> topStories = new ArrayList<>();
        RestTemplate restTemplate = new RestTemplate();
        String getUrl = "https://api.nytimes.com/svc/topstories/v2/home.json?api-key=Y8XkAW3gA4tpP3t21qPEV8F71kapoAGY";
        News news=new News();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        
        RestTemplate restTemplate1 = new RestTemplate();
        ResponseEntity<Map> newsList = restTemplate.exchange(getUrl, HttpMethod.GET, entity, Map.class);
        JSONObject jsonObject;
        
		
		 System.out.print("SSSSSSS"+newsList.getStatusCodeValue()); if
		 (newsList.getStatusCode() == HttpStatus.OK) {
		 
		 jsonObject = new JSONObject(newsList.getBody()); JSONArray jsonArray =
		 jsonObject.getJSONArray("results"); Results[] results = new
		 Results[jsonArray.length()]; for(int i=0; i<jsonArray.length(); i++) {
		 news.setTitle(jsonArray.getJSONObject(i).get("title").toString());
		 news.setSection(jsonArray.getJSONObject(i).get("section").toString()); String
		 title=jsonArray.getJSONObject(i).get("title").toString(); results[i]=new
		 Results(); results[i].setTitle(title); news.setResults(results);
		 topStories.add(news); }
		 
		 }
		 
        News n= topStories.get(0);
        System.out.println("Exit NewsService.java -->  getNews() Method");
        return n;
	}
	
}
