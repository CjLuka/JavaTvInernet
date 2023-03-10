package com.example.Projekt.hurtownia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Projekt.hurtownia.Repo.PackageProductRepo;
import com.example.Projekt.hurtownia.Repo.PackageRepo;
import com.example.Projekt.hurtownia.Repo.PersonRepo;
import com.example.Projekt.hurtownia.Repo.PlatnosciRepo;
import com.example.Projekt.hurtownia.Repo.ProductRepo;
import com.example.Projekt.hurtownia.Repo.ZamowieniaRepo;
import com.example.Projekt.hurtownia.Tabele.Person;

@SpringBootApplication
public class ProjektHurtowniaApplication {
	private PackageRepo packageRepo;
  private PackageProductRepo packageProductRepo;
	private PersonRepo personRepo;
  private PlatnosciRepo platnosciRepo;
	private ProductRepo productRepo;
  private ZamowieniaRepo zamowieniaRepo;
	@Autowired
  public ProjektHurtowniaApplication(PackageRepo packageRepo,PackageProductRepo packageProductRepo ){
    
  }
	public static void main(String[] args) {
		SpringApplication.run(ProjektHurtowniaApplication.class, args);
		
	}

}
