package com.example.Projekt.hurtownia.Tabele;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class PackageProducts {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  private Package package1;

  @ManyToOne
  private Product product;
  @OneToMany(mappedBy = "packageProductsId")
  private List<Zamowienia> PackageProductId = new ArrayList<Zamowienia>();


  

  public Long getId() {
    return id;
  }
  public PackageProducts(Package package1, Product product) {
    this.package1 = package1;
    this.product = product;
  }
  public PackageProducts() {
  }
  public void setId(Long id) {
    this.id = id;
  }
  public Package getPackage1() {
    return package1;
  }
  public void setPackage1(Package package1) {
    this.package1 = package1;
  }
  public Product getProduct() {
    return product;
  }
  public void setProduct(Product product) {
    this.product = product;
  }
  
}
