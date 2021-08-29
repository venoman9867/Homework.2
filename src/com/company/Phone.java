package com.company;
public class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone(int number, String model, double weight) {
        this(number, model);// почему должно быть первым?
        this.number = number;
        this.model = model;
        this.weight = weight;

    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public String toString() {
        return "Phone's model : " + this.model + " \nNumber: " + this.number + " \nWeight: " + this.weight;
    }

    public String getNumber() {
        String number = Integer.toString(this.number);
        return number;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name + " " + getNumber());
    }
    //@Override почему не пропускает?
    public void receiveCall(String name, int number){
        System.out.println("Звонит " + name + " " + number);
    }
    public void sendMessage(String name, int number){
        System.out.println(name+" привет, займи сотку до пятницы)");
        //System.out.println(number);
    }
}
