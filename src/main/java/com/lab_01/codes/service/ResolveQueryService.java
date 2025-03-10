package com.lab_01.codes.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lab_01.codes.tools.HTTPRequestHandler;

@Service
public class ResolveQueryService {
    
    HTTPRequestHandler client = new HTTPRequestHandler();

    public List<String> getTranslation(String srcLan, String destLang, String text) {
        try {
            
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.getForEntity(client.getRequestForTranslation(srcLan, destLang, text), String.class);
            String json = response.getBody();
            
            return List.of(json);
        }
        catch (Exception e){
            return List.of("error", e.toString());
        }
        
    }
}
