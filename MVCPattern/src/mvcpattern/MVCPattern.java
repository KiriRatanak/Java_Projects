package mvcpattern;


//Model
class Foods {
    private String rice;
    private String egg;

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public String getEgg() {
        return egg;
    }

    public void setEgg(String egg) {
        this.egg = egg;
    }
}
///////////////////////////////////////

//View
class SomeoneWhoDoesntKnowHowToCook {
    public void complain(String rice, String egg) {
        System.out.println(rice+" and "+egg+" again."+" I 'LOVE' it. ^3^ (sarcasm)");
    }
}
///////////////////////////////////////


//Controller
class Chef {
    private Foods foods;
    private SomeoneWhoDoesntKnowHowToCook KITStudent;
    
    public Chef(Foods model,SomeoneWhoDoesntKnowHowToCook view) {
        this.foods = model;
        this.KITStudent = view;
    }
    
    public void cookRice(String rice) {
        foods.setRice(rice);
    }
    public String getRice() {
        return foods.getRice();
    }
    public void cookEgg(String egg) {
        foods.setEgg(egg);
    }
    public String getEgg() {
        return foods.getEgg();
    }
    
    public void serveFoods() {
        KITStudent.complain(foods.getRice(),foods.getEgg());
    }
}
///////////////////////////////////////


public class MVCPattern {
    
    public static void main(String[] args) {
        Foods foods = cookFoods();
        SomeoneWhoDoesntKnowHowToCook KITStudent = new SomeoneWhoDoesntKnowHowToCook();
        Chef chef = new Chef(foods, KITStudent); //(model,view)
        chef.serveFoods();
        chef.cookRice("Rice");
        chef.cookEgg("Flies egg");
        chef.serveFoods();
    }
    
    //Instantiating data model
    public static Foods cookFoods(){
        Foods foods = new Foods();
        foods.setRice("Rice");
        foods.setEgg("Fried egg");
        
        return foods;
    }
    
    
}
