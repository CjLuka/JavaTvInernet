package com.example.Projekt.hurtownia.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Projekt.hurtownia.Tabele.PackageProducts;

public interface PackageProductRepo extends JpaRepository<PackageProducts, Integer> {
  
}
