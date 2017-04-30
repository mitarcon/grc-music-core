package com.mitarcon.grc.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mitarcon.grc.services.ArtistService;

@RestController
public class ArtistApi {

	@RequestMapping("/artist")
    public String searchArtist (
    		@RequestParam("query") String query,
    		@RequestParam("code") String code) {
		
//		artistas.search(query,code)
		ArtistService service = new ArtistService();
		service.getArrayArtist(query, code);
        return "Search Artist "+query+" "+code;  	
    }
	
	@RequestMapping("/artist/{id}")
    public String getArtist (
    		@PathVariable("id") String id,
    		@RequestParam("from") String from) {

//		.getArtist(id, from)
        return "get Artist "+id+" "+from;  	
    }
}
