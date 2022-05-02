package assignment7;

interface Cycles {
    void ride();
}

interface CycleFactory {
    Cycles getCycle();
}

class Unicycle implements Cycles {
    public void ride() {
        System.out.println("Ride Unicycle");
    }
}

class UnicycleFactory implements CycleFactory {
    public Cycles getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycles {
    public void ride() {
        System.out.println("Ride Bicycle");
    }
}

class BicycleFactory implements CycleFactory {
    public Cycles getCycle() {
        return new Bicycle();
    }
}


class Tricycle implements Cycles {
    Tricycle() {
        System.out.println("Tricycle()");
    }
    public void ride() {
        System.out.println("Ride Tricycle");
    }
}

class TricycleFactory implements CycleFactory {
    public Cycles getCycle() {
        return new Tricycle();
    }
}
public class Assignment7_4 {
    public static void rideCycle(CycleFactory factory) {
        Cycles c = factory.getCycle();
        c.ride();
    }
    public static void main(String [] args) {
        rideCycle(new UnicycleFactory());
        rideCycle(new BicycleFactory());
        rideCycle(new TricycleFactory());
    }
}
