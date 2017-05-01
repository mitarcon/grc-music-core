package com.mitarcon.grc.external.spotify;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import com.mitarcon.grc.model.Artist;


public class SpotifyController {
	
	@Value("${url.spotify}")
	private String urlspotify = "https://api.spotify.com";
	private static final Logger log = LoggerFactory.getLogger(SpotifyController.class);
	
	public ArrayList<Artist> searchArtist( String query ){
		
		ArrayList<Artist> artist = new ArrayList<Artist>();
//		List<String> servers = new ArrayList<String>();
		String url = urlspotify+"/v1/search?type=artist&market=US&q="+query;
		log.info( "---> url "+url );
		RestTemplate restTemplate = new RestTemplate();
        ResponseArtist result = restTemplate.getForObject(url, ResponseArtist.class);
        
        
        log.info("--->" + result.toString());
//		/search?q=daddy+yankee&type=artist
		
		return artist;
	}
}
