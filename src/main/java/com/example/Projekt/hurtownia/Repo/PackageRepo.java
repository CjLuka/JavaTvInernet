package com.example.Projekt.hurtownia.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Projekt.hurtownia.Tabele.Package;
public interface PackageRepo extends JpaRepository<Package, Integer> {
  Package findByIdIs(Integer id);
}
