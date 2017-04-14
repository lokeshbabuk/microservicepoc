/**
 * 
 */
package com.song.application.dao;

import org.springframework.data.repository.CrudRepository;

import com.song.application.dao.Song;

import java.lang.Integer;
import java.util.List;

/**
 * @author M1028349
 * Create the repository
 * // This will be AUTO IMPLEMENTED by Spring into a Bean called SongRepository
// CRUD refers Create, Read, Update, Delete
 *
 */
public interface SongRepository extends CrudRepository<Song, Integer>{		
	public List<Song> findByAlbumid(Integer albumid);  
}
