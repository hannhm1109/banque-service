package com.example;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8686/";
        BanqueService banqueService = new BanqueService();
        Endpoint.publish(url, banqueService);
        System.out.println("Web service deployed at: " + url);
    }
}