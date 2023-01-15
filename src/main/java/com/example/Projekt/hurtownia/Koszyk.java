package com.example.Projekt.hurtownia;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.example.Projekt.hurtownia.Tabele.Package;



@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Koszyk {
  private List<Package> zamowienie = new ArrayList<Package>();

  

  public void dodajdokoszyka(Package optional){
    zamowienie.add(optional);
  }

  @Override
  public String toString() {
    return "Koszyk [zamowienie=" + zamowienie + "]";
  }

  public Koszyk(List<Package> zamowienie) {
    this.zamowienie = zamowienie;
  }

  public Koszyk() {
  }

  public List<Package> getZamowienie() {
    return zamowienie;
  }

  public void setZamowienie(List<Package> zamowienie) {
    this.zamowienie = zamowienie;
  }
  
  
}
