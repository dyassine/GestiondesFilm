/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elephorm.formation.entity.service;

import com.elephorm.formation.entity.Film;
import java.util.List;

/**
 *
 * @author HP
 */
public interface FilmServiceInterface {
 public void registerFilm(Film film);
 public Film getFilmDescription(int id);
 public List<Film> getListFilms();
}
