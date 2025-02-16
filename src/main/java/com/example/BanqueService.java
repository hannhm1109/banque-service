package com.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod
    public double conversion(@WebParam(name = "montant") double mt) {
        return mt * 11.3;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, 1000 + Math.random() * 90000);
    }

    @WebMethod
    public List<Compte> getComptes() {
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1, 5000));
        comptes.add(new Compte(2, 6000));
        return comptes;
    }
}