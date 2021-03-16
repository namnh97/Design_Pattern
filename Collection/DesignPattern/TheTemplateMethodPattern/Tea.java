package DesignPattern.TheTemplateMethodPattern;

public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondinents() {
        System.out.println("Adding Lemon");
    }
}
