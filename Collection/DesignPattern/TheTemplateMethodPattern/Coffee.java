package DesignPattern.TheTemplateMethodPattern;

public class Coffee extends CaffeineBeverage {
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    public void addCondinents() {
        System.out.println("Adding Suger and Milk");
    }
}
