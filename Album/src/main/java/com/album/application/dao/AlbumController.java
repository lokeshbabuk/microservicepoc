/**
 * 
 */
package com.album.application.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author M1028349
 *
 */

@RestController
@RequestMapping(path = "/album")
public class AlbumController {
	
	
	@Autowired
	private AlbumRepository albumRepository;
	
	@GetMapping(path = "/add")
	// Map ONLY GET Requests
	public @ResponseBody String addAlbum(@RequestParam Integer albumId,
			@RequestParam String title, @RequestParam String artistName) {
		System.out.println("*******album Test1*****");

		Album album = new Album();
		album.setAlbumid(albumId);
		album.setTitle(title);
		album.setArtistName(artistName);
		
		albumRepository.save(album);

		return "Album Added Successfully";
	}
	
	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Album> getAllAlbums() {
		// This returns a JSON or XML with the users
		return albumRepository.findAll();
	}	
	
	@GetMapping(path = "/getalbum")
	public @ResponseBody Album getAlbum(@RequestParam Integer albumId) {
		// This returns a JSON or XML with the users
		return albumRepository.findOne(albumId);
	}	
	
	@GetMapping(path = "/getalbumbyname")
	public @ResponseBody Album getAlbum(@RequestParam String title) {
		// This returns a JSON or XML with the users
		return albumRepository.findByTitle(title);
	}
	

}
