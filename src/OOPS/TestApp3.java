package OOPS;

class Animal {}
    class Monkey extends Animal {

    }
    class AnimalApp {
        public void m1(Monkey m){
            System.out.println("Monkey version.....");
        }
        public void m1(Animal  a){
            System.out.println("Animal version....");
        }
    }


    class Demo {

    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void add(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

    public void add(int a, int b, int c, int d, int e){
        System.out.println(a+b+c+d+e);
    }
    }



    class AdvancedDemo{

    // var args
    public void add(int... args){
        int sum = 0;
        for(int data: args){
            sum +=data;
        }
        System.out.println(sum);

    }
    }

public class TestApp3 {
    public static void main(String[] args){
      AnimalApp a =new AnimalApp();
      Monkey m = new Monkey();
              a.m1(m);  // m(monkey  ------> Monkey)

              Animal animal = new Animal();
              a.m1(animal);    // Animal ----> Animal

        Animal an = new Monkey();
        a.m1(an);   // an(Animal) ----> Animal


        Demo d = new Demo();
        d.add(1,2);
        d.add(1,2,3);
        d.add(1,2,3,4);
        d.add(1,2,3,4,5);
        System.out.println();

        AdvancedDemo ad = new AdvancedDemo();
        ad.add(1,2);
        ad.add(2,3,4);
    }
}
