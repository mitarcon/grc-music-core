package com.mitarcon.grc.api;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mitarcon.grc.model.Artist;
import com.mitarcon.grc.services.ArtistService;

@RestController
public class ArtistApi {

	@RequestMapping("/artist")
    public ArrayList<Artist> searchArtist (
    		@RequestParam("query") String query,
    		@RequestParam("code") String code) {
		
		ArtistService service = new ArtistService();
        return service.getArrayArtist(query, code);
    }
	
	@RequestMapping("/artist/{id}")
    public String getArtist (
    		@PathVariable("id") String id,
    		@RequestParam("from") String from) {

//		.getArtist(id, from)
        return "get Artist "+id+" "+from;  	
    }
}
