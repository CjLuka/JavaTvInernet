package com.example.Projekt.hurtownia.Tabele;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Package {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String Name;
  private double PriceForPackage;
  @OneToMany(mappedBy = "package1")
  private List<PackageProducts> packageName  = new ArrayList<PackageProducts>();
  
  public Package(String name, double priceForPackage) {
    Name = name;
    PriceForPackage = priceForPackage;
  }
  public Package() {
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public List<PackageProducts> getPackageName() {
    return packageName;
  }
  public void setPackageName(List<PackageProducts> packageName) {
    this.packageName = packageName;
  }
  public double getPriceForPackage() {
    return PriceForPackage;
  }
  public void setPriceForPackage(double priceForPackage) {
    PriceForPackage = priceForPackage;
  }
  public String getName() {
    return Name;
  }
  public void setName(String name) {
    Name = name;
  }
  public void dodajdokoszyka(){

  }
}
