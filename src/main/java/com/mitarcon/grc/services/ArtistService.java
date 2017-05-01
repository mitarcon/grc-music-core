package com.mitarcon.grc.services;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mitarcon.grc.external.last.LastController;
import com.mitarcon.grc.external.spotify.SpotifyController;
import com.mitarcon.grc.model.Artist;

public class ArtistService {

	private static final Logger log = LoggerFactory.getLogger(ArtistService.class);
	
	public ArrayList<Artist> getArrayArtist(String query, String code){
		
		ArrayList<Artist> artists = new ArrayList<Artist>();
		SpotifyController spotify = new SpotifyController();
		LastController last = new LastController();
		
		artists.addAll( last.searchArtist(query) );
		artists.addAll( spotify.searchArtist(query) );
		
		if ( null == code ){
//			No existe en BD y debo buscar en los API
			
		} else {
//			Busco en BD utilizando el code
		}
		
		return artists;
	}
}
