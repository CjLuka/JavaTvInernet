package com.example.Projekt.hurtownia.Tabele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Platnosci {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id; 
  private double price;
  @ManyToOne
  private Person person;
  @ManyToOne
  private Zamowienia zamowienia;

}
