package com.example.demo;

public class Movie {
  private int id;
  private String name;
  private int year;
  private String director;
  private String genre;
  private String synopsis;  

  public Movie (int id, String name, int year, String director, String genre, String synopsis){
    this.id = id;
    this.name = name;
    this.year = year;
    this.director = director;
    this.genre = genre;
    this.synopsis = synopsis;
  }

  //getters
  public int getId(){
    return id;
  }

  public String getName(){
    return name;
  }

  public int getYear(){
    return year;
  }

  public String getDirector(){
    return director;
  }

  public String getGenre(){
    return genre;
  }

  public String getSynopsis(){
    return synopsis;
  }
}
