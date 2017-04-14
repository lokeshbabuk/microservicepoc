/**
 * 
 */
package com.song.application.dao;


import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;*/
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author M1028349
 *This is the entity class which Hibernate will automatically translate into a table.
 */
@Entity
public class Song {
	
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Integer  songid;
	
	private String title;
	private String length;
	private String track_number;
	private String genre;
	private String date_added;
	private String date_modified;
	private Integer albumid;
	
	@ManyToOne
	private Album album;
	
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
		
	public Integer getAlbumid() {
		return albumid;
	}
	public void setAlbumid(Integer albumid) {
		this.albumid = albumid;
	}
	
	public Integer getSongid() {
		return songid;
	}
	public void setSongid(Integer songid) {
		this.songid = songid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getTrack_number() {
		return track_number;
	}
	public void setTrack_number(String track_number) {
		this.track_number = track_number;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDate_added() {
		return date_added;
	}
	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}
	public String getDate_modified() {
		return date_modified;
	}
	public void setDate_modified(String date_modified) {
		this.date_modified = date_modified;
	}
	

	public Song(Integer songid, String title, String length,
			String track_number, String genre, String date_added,
			String date_modified, Integer albumId) {
		super();
		this.songid = songid;
		this.title = title;
		this.length = length;
		this.track_number = track_number;
		this.genre = genre;
		this.date_added = date_added;
		this.date_modified = date_modified;
		this.albumid = albumId;
	}
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}
