package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int vegPizza;
    private int nonVegPizza;
    private int extraCheese;
    private int extraToppingForVeg;
    private int extraToppingForNonVeg;
    private int bagPrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.vegPizza = 300;
        this.nonVegPizza = 400;
        this.extraCheese = 80;
        this.extraToppingForVeg = 70;
        this.extraToppingForNonVeg = 120;
        this.bagPrice = 20;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        // same price for both veg and non-veg pizza
        this.price += this.extraCheese;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            this.price += this.extraToppingForVeg;
        }else {
            this.price += this.extraToppingForNonVeg;
        }
    }

    public void addTakeaway(){
        // your code goes here
        this.price += this.bagPrice;
    }

    public String getBill(){
        // your code goes here
        if(isVeg){
            this.price += this.vegPizza;
            this.bill = "Base Price Of The Pizza: "+this.vegPizza+"\n"+
                        "Extra Cheese Added: "+this.extraCheese+"\n"+
                        "Extra Toppings Added: "+this.extraToppingForVeg+"\n"+
                        "Paperbag Added: "+this.bagPrice+"\n"+
                        "Total Price: "+getPrice()+"\n";
        }
        else{
            this.price += this.nonVegPizza;
            this.bill = "Base Price Of The Pizza: "+this.nonVegPizza+"\n"+
                    "Extra Cheese Added: "+this.extraCheese+"\n"+
                    "Extra Toppings Added: "+this.extraToppingForNonVeg+"\n"+
                    "Paperbag Added: "+this.bagPrice+"\n"+
                    "Total Price: "+getPrice()+"\n";
        }
        return this.bill;
    }
}
