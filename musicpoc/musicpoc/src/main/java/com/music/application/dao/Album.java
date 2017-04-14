/**
 * 
 */
package com.music.application.dao;

import java.util.List;

/**
 * @author M1028349
 *
 */

public class Album {
	
    private Integer AlbumId;
    
	private String title;
	private String artistName;
	
	private List <Song> song;		
	
	public List<Song> getSong() {
		return song;
	}

	public void setSong(List<Song> song) {
		this.song = song;
	}

	public Album(Integer albumId, String title, String artistName) {
		super();
		AlbumId = albumId;
		this.title = title;
		this.artistName = artistName;
	}
	
	
	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getAlbumId() {
		return AlbumId;
	}
	public void setAlbumId(Integer albumId) {
		AlbumId = albumId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}


}
