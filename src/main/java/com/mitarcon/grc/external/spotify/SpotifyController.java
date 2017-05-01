package com.mitarcon.grc.external.spotify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import com.mitarcon.grc.model.Artist;
import com.mitarcon.grc.model.Track;




public class SpotifyController {
	
	@Value("${url.spotify}")
	private String urlspotify = "https://api.spotify.com";
	private static final Logger log = LoggerFactory.getLogger(SpotifyController.class);
	
	public ArrayList<Artist> searchArtist( String query ){
		
		ArrayList<Artist> artists = new ArrayList<Artist>();
//		List<String> servers = new ArrayList<String>();
		String url = urlspotify+"/v1/search?type=artist&market=US&q="+query;
		
		RestTemplate restTemplate = new RestTemplate();
        ResponseArtist result = restTemplate.getForObject(url, ResponseArtist.class);


        List<String> list = new ArrayList<String>();
        list.add("spotify-mapper.xml");
        Mapper mapper = new DozerBeanMapper(list);
        
        int i;
        Artist aux;
        int length = ( result.getArtists().getItems().length > 10 ) ? 10 : result.getArtists().getItems().length;
        
        for ( i=0; i<length; i++ ){
        	aux = mapper.map( result.getArtists().getItems()[i], com.mitarcon.grc.model.Artist.class );
        	aux.setFrom( "spotify" );
        	aux.setTracks( getTopTracks(aux.getId()) );
        	artists.add( aux );
        }
        	
		return artists;
	}
	
	public ArrayList<Track> getTopTracks( String id ){
		
		ArrayList<Track> tracks = new ArrayList<Track>();
		String url = urlspotify+"/v1/artists/"+id+"/top-tracks?country=US";
		RestTemplate restTemplate = new RestTemplate();
		Tracks result = restTemplate.getForObject(url, Tracks.class);

        List<String> list = new ArrayList<String>();
        list.add("spotify-track-mapper.xml");
        Mapper mapper = new DozerBeanMapper(list);
        
        int i;
        Track aux;
        
        for ( i=0; i<result.getTracks().length; i++){
        	aux = mapper.map( result.getTracks()[i], com.mitarcon.grc.model.Track.class );
        	tracks.add(aux);
        }
        
		return tracks;
	}
}
