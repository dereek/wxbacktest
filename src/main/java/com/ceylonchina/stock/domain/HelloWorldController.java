package com.ceylonchina.stock.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/hello")
    public Object index() {
    	JSONObject json = new JSONObject();
    	json.put("user1", "hello");
        return json;
    }
    
    @RequestMapping("get")
    public Object getAndSet(String stock) {
    	RestTemplate restTemplate = new RestTemplate();
    	logger.info("the requst@@@@@: " + stock);
    	String url="http://qt.gtimg.cn/q=s_" + stock;
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
    	HttpEntity<String> entity = new HttpEntity<String>(null, headers);
    	ResponseEntity<String> rs = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
    	
    	return rs.getBody();
    }

}
