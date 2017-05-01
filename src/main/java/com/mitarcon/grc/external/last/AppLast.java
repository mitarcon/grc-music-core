package com.mitarcon.grc.external.last;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class AppLast {
	
	private static final Logger log = LoggerFactory.getLogger(AppLast.class);
	
    @RequestMapping("/last")
    public ResponseArtist last() {
//    	http://www.last.fm/api/show/artist.search
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://ws.audioscrobbler.com/2.0/?method=artist.search&artist=daddy&api_key=32bf6dcf5c3cffb54723177adc40f0e0&format=json";
        ResponseArtist result = restTemplate.getForObject(url, ResponseArtist.class);
        log.info("--->" + result.toString());
        
        return result;  	
    }
    
    @RequestMapping("/last/topTrack")
    public ResponseTrack topTrack() {
//    	http://www.last.fm/api/show/artist.getTopTracks
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://ws.audioscrobbler.com/2.0/?method=artist.gettoptracks&mbid=2f522f5c-111c-4ce8-8bd0-d82e97c227ad&api_key=32bf6dcf5c3cffb54723177adc40f0e0&format=json";
        ResponseTrack result = restTemplate.getForObject(url, ResponseTrack.class);
        log.info("--->" + result.toString());
        
        return result;  	
    }    
	
}
