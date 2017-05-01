package com.mitarcon.grc.services;

import com.mitarcon.grc.model.Artist;

public class ArtistService {

	public Artist[] getArrayArtist(String query, String code){
		
		Artist[] artist = new Artist [20];
		
		if ( null == code ){
//			No existe en BD y debo buscar en los API
			
		} else {
//			Busco en BD utilizando el code
		}
		
		return artist;
	}
}
