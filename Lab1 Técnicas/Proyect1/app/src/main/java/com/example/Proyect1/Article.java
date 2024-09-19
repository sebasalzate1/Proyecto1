package com.example.Proyect1;

public class Article {

    private static final String[] categories = {"Shampoo", "Cera", "Crema", "Plancha", "Secador"};
    private static final int[] prices = {35000, 20000, 25000, 90000, 120000};
    private static int counter = 0;

    private String id;
    private int price;
    private String description;
    private String category;

    public Article(String description, int category) {
        this.description = description;
        this.price = prices[category];
        this.category = categories[category];
        counter++;
        char firstChar = Character.toUpperCase(description.charAt(0));
        char lastChar = Character.toUpperCase(description.charAt(description.length() - 1));
        String stringNumber = String.format("%07d", counter);
        this.id = firstChar + "" + lastChar + "-" + stringNumber;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

}
