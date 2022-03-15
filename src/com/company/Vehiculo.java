package com.company;

public class Vehiculo {
  // 1. Atributos
  String Fabricante;
  String Modelo;
  Double cc;
  int year;
  boolean sport;
  int speed;
  // 2. Constructor
  public Vehiculo(){

  };
  public Vehiculo(String fabricante, String modelo, Double cc, int year, boolean sport){
    this.Fabricante=fabricante;
    this.Modelo=modelo;
    this.cc=cc;
    this.sport=sport;
    this.year=year;

  }
// 3. Metodos(comportamiento)
  public void acelerar(int quantity){
    this.speed +=quantity;

  }
  // getter y setter
  // toString
}
