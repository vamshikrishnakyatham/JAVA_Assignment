package Assignment7;

class Rodent{
    Rodent() {
        System.out.println("Rodent class");
    }
    void eat(){
        System.out.println("Rodent is eating");
    }
    void move(){
        System.out.println("Rodent is moving");
    }
    void hide(){
        System.out.println("Rodent is hiding");
    }

}
class Mouse extends Rodent {
    Mouse() {
        System.out.println("Mouse class");
    }
    void eat(){
        System.out.println("Mouse is eating");
    }
    void move(){
        System.out.println("Mouse is moving");
    }
    void hide(){
        System.out.println("Mouse is hiding");
    }

}
class Gerbil extends Rodent {
    Gerbil() {
        System.out.println("Gerbil class");
    }
    void eat(){
        System.out.println("Gerbil is eating");
    }
    void move(){
        System.out.println("Gerbil is moving");
    }
    void hide(){
        System.out.println("Gerbil is hiding");
    }

}
class Hamster extends Rodent {
    Hamster() {
        System.out.println("Hamster class");
    }
    void eat(){
        System.out.println("Hamster is eating");
    }
    void move(){
        System.out.println("Hamster is moving");
    }
    void hide(){
        System.out.println("Hamster is hiding");
    }
}
public class MainRodents {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Rodent(),
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };
        for(Rodent i : rodents){
            i.eat();
            i.move();
            i.hide();
        }
    }
}
