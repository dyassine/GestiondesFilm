package com.elephorm.formation.entity.controller;

import com.elephorm.formation.entity.Acteur;
import com.elephorm.formation.entity.Film;
import com.elephorm.formation.entity.service.FilmService;
import java.util.Scanner;

public class DefaultFilmController {
    
    public void registerFilmFromConsoleInput (){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("titre film =");
    String titre= sc.nextLine();
    
    System.out.println("genre film =");
    String genre= sc.nextLine();
    
    System.out.println("quel est le nom d l'acteur princiapel =");
    String nom = sc.nextLine();
    
    System.out.println("quel est prénon d  =");
    String prenom = sc.nextLine();
    
    
    


Film film=new Film();
film.setTitre(titre);
film.setGenre(genre);
//film.setNbExemplaire(nb);


Acteur acteur =new Acteur();
acteur.setNom(nom);
acteur.setPrenom(prenom);

film.setActeurPrincipal(acteur);


       

FilmService service = new FilmService();
service.registerFilm(film);

        


    }
    
public void descrireFilmwithCconsole()
{
/*
 Scanner sc=new Scanner(System.in);
    System.out.println("donner ID du film=");
   int id = sc.nextInt();
    
    FilmService service =new FilmService();
    Film film =service.getFilmDescription(id);
    System.out.println("le film est "+film.getTitre()+"--"+film.getGenre());
        System.out.println("++++l'acteur "+film.getActeurPrincipal().getPrenom());
*/
    Scanner sc=new Scanner(System.in);
    System.out.println("Quel est l'identifiant = ");
    int id= sc.nextInt();
    FilmService service=new FilmService();
    Film film=service.getFilmDescription(id);
    System.out.println("le film est "+film.getTitre()+" "+film.getGenre());
    System.out.println("son acteur principal est "+film.getActeurPrincipal().getNom()+" "+film.getActeurPrincipal().getPrenom());
    
    System.out.println("Acteurs secondaires : ");
    for(Acteur acteur: film.getActeurSecondaires()){
    System.out.println("le suivant est "+acteur.getNom()+" "+acteur.getPrenom());
 }
    
}
}


