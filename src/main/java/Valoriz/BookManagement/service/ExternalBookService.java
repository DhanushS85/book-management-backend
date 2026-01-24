package Valoriz.BookManagement.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalBookService {

    private final RestTemplate restTemplate = new RestTemplate();
    @Value("${google.api}")
    String googleApi;
    @Value("${google.api.key}")
    String googleApiKey;
    public Object getBookByIsbn(String isbn) {
    	    String url = googleApi + isbn + "&key=" + googleApiKey;
        return restTemplate.getForObject(url, Object.class);
    }
}

