package com.lance.flywaydemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lance.flywaydemo.dao.ContactDao;
import com.lance.flywaydemo.dao.FavoriteDao;
import com.lance.flywaydemo.models.Favorite;

@Service
public class FavoriteService {
	private FavoriteDao favoriteDao;
	private ContactDao contactDao;
	
	@Autowired
	public FavoriteService(FavoriteDao favoriteDao, ContactDao contactDao){
		this.favoriteDao = favoriteDao;
		this.contactDao = contactDao;
	}
	
	public List<Favorite> getFavoritesWithContact(){
		List<Favorite> favs = favoriteDao.getAll();
		for (Favorite f : favs) {
			f.setContact(contactDao.getById(f.getContact().getId()));
		}
		return favs;
	}
}
