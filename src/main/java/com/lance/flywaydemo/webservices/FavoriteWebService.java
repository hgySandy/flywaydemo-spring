package com.lance.flywaydemo.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lance.flywaydemo.models.Favorite;
import com.lance.flywaydemo.services.FavoriteService;

@RestController
@RequestMapping(value="/api/favorite")
public class FavoriteWebService {
	
	private FavoriteService favoriteService;
	
	@Autowired
	public FavoriteWebService(FavoriteService favoriteService){
		this.favoriteService = favoriteService;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Favorite> getAll(){
		return favoriteService.getFavoritesWithContact();
	}

}
