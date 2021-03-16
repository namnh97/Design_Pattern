package DesignPattern.TheTemplateMethodPattern;

public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
