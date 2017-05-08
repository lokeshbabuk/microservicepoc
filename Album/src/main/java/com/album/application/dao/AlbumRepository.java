/**
 * 
 */
package com.album.application.dao;

import org.springframework.data.repository.CrudRepository;
import java.lang.Integer;
import com.album.application.dao.Album;



public interface AlbumRepository extends CrudRepository<Album, Integer>{
	
	public Album findByTitle(String  title);

}
