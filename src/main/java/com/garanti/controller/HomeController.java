package com.garanti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
    public ModelAndView test(HttpServletResponse response) throws IOException {
       response.setCharacterEncoding("UTF-8");
         response.setHeader("Content-Language","tr-TR");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");


        List<Kitap> kitaplar =
                        Arrays.asList(
                new Kitap("Java ve Yazılım Tasarımı", 30d, "Usta", true),
                new Kitap("Java Mimarisiyle Kurumsal Çözümler", 20d, "Usta", true),
                new Kitap("Veri Yapıları ve Algoritmalar", 40d, "Usta", false),
                new Kitap("Veri Yapıları ve Algoritmalar", 40d, "Usta", false),
                new Kitap("Veri Yapıları ve Algoritmalar", 40d, "Usta", true),
                new Kitap("Mobil Pazarlama - SoLoMo", 15d, "Usta", false),
                new Kitap("Mobil Pazarlama - SoLoMo", 15d, "Usta", true));

        modelAndView.addObject("kitaplar", kitaplar);

        return modelAndView;
    }
}
