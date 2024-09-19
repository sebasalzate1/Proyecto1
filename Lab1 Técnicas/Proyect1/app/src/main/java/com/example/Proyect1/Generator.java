package com.example.Proyect1;

public class Generator {

    private String[] shampoo = {"Pantene Pro-V", "Head & Shoulders", "Dove", "L'Oréal Paris", "Tresemme", "Garnier Fructis", "Herbal Essences", "Redken", "Schwarzkopf", "Biolage"};
    private String[] ceraCabello = {"Gatsby", "American Crew", "Bumble and Bumble", "Redken Brews", "Paul Mitchell", "Bed Head", "TIGI", "Osis", "Sebastian", "Suavecito"};
    private String[] cremaHumectante = {"Nivea", "L'Oréal Paris", "Neutrogena", "CeraVe", "Eucerin", "Aveeno", "Olay", "Olay Regenerist", "Nivea Soft", "Bioderma"};
    private String[] planchasCabello = {"GHD", "Chi", "BaBylissPRO", "Remington", "Conair", "Revlon", "Hot Tools", "Paul Mitchell", "Babyliss", "Keratin Complex"};
    private String[] secadoresPelo = {"Dyson Supersonic", "Conair InfinitiPro", "Remington D", "Revlon One-Step", "BaBylissPRO", "T3 Featherweight", "Panasonic EH-NA", "Chi Touch", "Hot Tools Professional", "Elchim 3900A"};

    private String[][] articles = {
        shampoo,
        cremaHumectante,
        ceraCabello,
        planchasCabello,
        secadoresPelo
    };

    private Article[] list = new Article[1000000];

    public Article[] fill() {
        for (int i = 0; i < 1000000; i++) {
            int category = (int) (Math.random() * 5);
            int article = (int) (Math.random() * 10);
            Article art = new Article(articles[category][article], category);
            list[i] = art;
        }
        return list;
    }

}
