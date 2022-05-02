package Assignment7;

class Cycle{
    int numOfWheels=0;

    public int wheels(){
        return numOfWheels;
    }

    public void balance() {
        System.out.println("Balanced Cycle");
    }
}

class UniCycle extends Cycle{
    int numOfWheels=1;

    public int wheels(){
        return numOfWheels;
    }

    public void balance(){
        System.out.println("Balanced UniCycle");
    }
}

class BiCycle extends Cycle{
    int numOfWheels=2;

    public int wheels(){
        return numOfWheels;
    }
    public void balance(){
        System.out.println("Balanced BiCycle");
    }
}

class TriCycle extends Cycle{
    int numOfWheels=3;

    public int wheels(){
        return numOfWheels;
    }
}
public class MainCycles {
    public static void main(String[] args){
        Cycle[] cycle = {
                new Cycle(),
                new UniCycle(),
                new BiCycle(),
                new TriCycle()
        };
        for(Cycle i : cycle){
            i.balance();
        }
    }
}


