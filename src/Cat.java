import java.util.Scanner;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int strenth;

    public Cat(String name, int age, int weight, int strenth){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strenth = strenth;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }
    public void setStrenth(int strenth){
        this.strenth = strenth;
    }

    public int getStrenth(){
        return strenth;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public boolean fight(Cat anotherCat){
        int ourScore = this.age * this.strenth * this.weight;
        int opponentScore = anotherCat.age * anotherCat.weight * anotherCat.strenth;
        if (ourScore>opponentScore){
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        Cat catSimba = new Cat("Simba", 2, 10, 100);
        Cat catMurzik = new Cat("Murzik", 1, 5,50);
        Cat catBaloo = new Cat("Baloo", 3, 7,70);

        System.out.println(catSimba.fight(catBaloo));
        System.out.println(catSimba.fight(catMurzik));
        System.out.println(catBaloo.fight(catMurzik));


    }

}
