package controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

public class EmpresaController {
    @GetMapping("/company")
    public Empresa Company(){
        Date newrecord = new Date();
        Empresa empresa1 = new Empresa(1,"DementesWeb","DementesWeb", "3005895255","carrera 45 #4-15", newrecord,newrecord);
        return empresa1;
    }
}
