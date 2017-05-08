/**
 * 
 */
package com.album.application.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Album {
	
	@Id
	private Integer albumid;
    
	private String title;
	private String artistName;
	
    public Album() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Album(Integer albumid, String title, String artistName) {
		super();
		this.albumid = albumid;
		this.title = title;
		this.artistName = artistName;
	}
	public Integer getAlbumid() {
		return albumid;
	}
	public void setAlbumid(Integer albumid) {
		this.albumid = albumid;
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
