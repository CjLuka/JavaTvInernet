package com.example.Projekt.hurtownia.Tabele;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String Name;
  
  private Double Price;
  @OneToMany(mappedBy = "product")
  private List<PackageProducts> NameProduct  = new ArrayList<PackageProducts>();

  public Product(String name, Double price) {
    Name = name;
    Price = price;
  }
  public Product() {
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public List<PackageProducts> getNameProduct() {
    return NameProduct;
  }
  public void setNameProduct(List<PackageProducts> nameProduct) {
    NameProduct = nameProduct;
  }
  public Double getPrice() {
    return Price;
  }
  public void setPrice(Double price) {
    Price = price;
  }
  public String getName() {
    return Name;
  }
  public void setName(String name) {
    Name = name;
  }
}
