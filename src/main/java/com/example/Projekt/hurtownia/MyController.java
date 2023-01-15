package com.example.Projekt.hurtownia;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Projekt.hurtownia.Repo.PackageProductRepo;
import com.example.Projekt.hurtownia.Repo.PackageRepo;
import com.example.Projekt.hurtownia.Repo.PersonRepo;
import com.example.Projekt.hurtownia.Repo.PlatnosciRepo;
import com.example.Projekt.hurtownia.Repo.ProductRepo;
import com.example.Projekt.hurtownia.Repo.ZamowieniaRepo;
import com.example.Projekt.hurtownia.Tabele.Package;
import com.example.Projekt.hurtownia.Tabele.Product;
import com.example.Projekt.hurtownia.Tabele.Zamowienia;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import org.springframework.ui.Model;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
  @Autowired
  private PackageRepo packageRepo;
  @Autowired
  private PackageProductRepo packageProductRepo;
	@Autowired
  private PersonRepo personRepo;
  @Autowired
  private PlatnosciRepo platnosciRepo;
	@Autowired
  private ProductRepo productRepo;
  @Autowired
  private ZamowieniaRepo zamowieniaRepo;
  @Autowired
  private Koszyk koszyk;


  @RequestMapping(value = "/wyswietlprodukty", method = RequestMethod.GET)
  public String wyswietlProdukty(Model model) {
    model.addAttribute("Product", new Product());
    model.addAttribute("wyswietlprodukty",productRepo.findAll());
    return "wyswietlprodukty";
  }
  @RequestMapping(value = "/wyswietlpakiety", method = RequestMethod.GET)
  public String wyswietlPakiety(Model model) {
    //model.addAttribute("Package", new Package());
    model.addAttribute("wyswietlpakiety",packageRepo.findAll());
    return "wyswietlpakiety";
  }
  @RequestMapping(value = "/index", method = RequestMethod.GET)
  public String stronaGlowna(Model model) {
    return "index";
  }
  @RequestMapping(value = "/indexforadmin", method = RequestMethod.GET)
  public String stronaGlownadlaadmina(Model model) {
    return "indexforadmin";
  }
  @RequestMapping(value = "/koszyk/{id}", method = RequestMethod.GET)
  public String wyswietlkoszyk(Model model, @PathVariable("id") Integer id, HttpSession session) {
    System.out.println(packageRepo.findByIdIs(id));
    koszyk.dodajdokoszyka(packageRepo.findByIdIs(id));
    System.out.println(koszyk);
    model.addAttribute("wyswietlpakiety",packageRepo.findAll());
    return "wyswietlpakiety";
  }
  @RequestMapping(value = "/zamawiam/{id}", method = RequestMethod.GET)
  public String tworzeniezamowiena(Model model, @PathVariable("id") Integer id, HttpSession session) {
    System.out.println(packageRepo.findByIdIs(id));
    return "index";
  }
  @RequestMapping(value = "/finalizujkoszyk", method = RequestMethod.GET)
  public String finalizujkoszyk(Model model, HttpSession session) {
    //model.addAttribute("Test" );
    
    model.addAttribute("zawartoscKoszyka", koszyk.getZamowienie());
    //zamowienia.setPackageProductsId(packageRepo.findById(Id));
    //model.addAttribute("dodajdokoszyka", Package)
    return "finalizujkoszyk";
  }
 
  @RequestMapping(value = "/", method = RequestMethod.GET)
    public String logincase(Model model, Authentication auth){
        if(auth == null){
            return "index";
        }
        else if(auth.getAuthorities().toString().equals("[ADMIN]")){
            return "indexforadmin";
        }
        else if(auth.getAuthorities().toString().equals("[GOSC]")){
            return "index";
        }
        else{
            return "index";
        }
    }
  
  

}
