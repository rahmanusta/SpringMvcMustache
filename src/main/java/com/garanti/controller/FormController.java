package com.garanti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 2/15/13
 * Time: 12:39 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class FormController {

    @RequestMapping(value = "/topla")
    public String topla(@ModelAttribute("formbean") FormBean formBean){
        formBean.setToplam(formBean.getSayi1()+formBean.getSayi2());
        System.out.println("Form: "+formBean);
        return "form";
    }

    @RequestMapping(value = "/form")
    public String sayfa(@ModelAttribute("formbean") FormBean formBean){
         formBean.setToplam(formBean.getSayi1()+formBean.getSayi2());
       return "form";
    }
}
