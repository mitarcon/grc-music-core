package com.mitarcon.grc.external.last;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import com.mitarcon.grc.model.Artist;
import com.mitarcon.grc.model.Track;

public class LastController {

	@Value("${url.last}")
	private String urlLast = "http://ws.audioscrobbler.com/2.0";
	private String api_key = "32bf6dcf5c3cffb54723177adc40f0e0";
	
	private static final Logger log = LoggerFactory.getLogger(LastController.class);
	
	public ArrayList<Artist> searchArtist( String query ){
		
		ArrayList<Artist> artists = new ArrayList<Artist>();
		String url = urlLast+"/?method=artist.search&format=json&api_key="+api_key+"&artist="+query;
		RestTemplate restTemplate = new RestTemplate();
		ResponseArtist result = restTemplate.getForObject(url, ResponseArtist.class);
		
        List<String> list = new ArrayList<String>();
        list.add("last-artist-mapper.xml");
        Mapper mapper = new DozerBeanMapper(list);
		
        int i;
        Artist aux;
        
        int length = ( result.getResults().getArtistmatches().getArtist().length > 10 ) ? 10 : 
        		result.getResults().getArtistmatches().getArtist().length;
        
        for ( i=0; i<length; i++ ){
        	aux = mapper.map( result.getResults().getArtistmatches().getArtist()[i], com.mitarcon.grc.model.Artist.class );
        	aux.setTracks( getTopTracks(aux.getId()) );
        	aux.setFrom( "last" );
        	artists.add( aux );
        }
        
		return artists;
		
	}
	
	public ArrayList<Track> getTopTracks( String id ){
		
		ArrayList<Track> tracks = new ArrayList<Track>();
		String url = urlLast+"/?method=artist.gettoptracks&format=json&limit=10&api_key="+api_key+"&mbid="+id;
		log.info("url es "+url);

		RestTemplate restTemplate = new RestTemplate();
		ResponseTrack result = restTemplate.getForObject(url, ResponseTrack.class);
		
        List<String> list = new ArrayList<String>();
        list.add("last-track-mapper.xml");
        Mapper mapper = new DozerBeanMapper(list);

        int i;
        Track aux;

        for ( i=0; i<result.getToptracks().getTrack().length; i++ ){
        	aux = mapper.map( result.getToptracks().getTrack()[i], com.mitarcon.grc.model.Track.class );
        	tracks.add(aux);
        }
        
		return tracks;
	}
}
