/**
 * 
 */
package com.music.application.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @author M1028349
 *
 */
@RestController
@RequestMapping(path = "/music")
public class MusicController {
	@Autowired
	private RestTemplate restTemplate;
	
	// 1.	Get album details by name. (Return information about Songs in album.)
	
	@GetMapping(path = "/album/{name}/songs")
	public @ResponseBody Iterable<Album> getAllSongs(@PathVariable String name) {
		
		Album album = restTemplate.getForObject("http://localhost:8083/album/getalbumbyname?title"+name, Album.class);
	    Integer albumId = album.getAlbumId();
	    
	    //Song song = restTemplate.getForObject("http://localhost:8083/album/getalbumbyname?title"+albumId, Song.class);

		
		// This returns a JSON or XML with the users
		//return songRepository.findAll();
		return null;
	}
	

}
