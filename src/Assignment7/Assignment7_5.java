package assignment7;

class Ex{
    static class Demo {
        boolean flag = true;
        Demo(boolean a) {
            this.flag = a;
        }

        public void method(){
            System.out.println("From method1 of Demo");
        }
    }
}

class Ex2 {
      class Demo1 extends Ex{
          public void print(){
              System.out.println("Print method");
          }
      }

    public void method1(){
        System.out.println("From inherited method");
    }

}
public class Assignment7_5  {
    public static void main(String[] args){
        Ex2 obj = new Ex2();
        Ex.Demo demo =  new Ex.Demo(true);
        obj.method1();
    }
}
