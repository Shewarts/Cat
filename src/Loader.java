
public class Loader
{

    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        cat1.setOkras(Color.BLACK);
        Cat cat2 = new Cat();
        cat1.setOkras(Color.BLACK);
        Cat cat3 = new Cat();
        cat1.setOkras(Color.BLACK);
        Cat cat4 = new Cat();
        cat1.setOkras(Color.BLACK);
        Cat cat5 = new Cat();
        cat1.setOkras(Color.BLACK);
        Cat cat6 = new Cat();
        cat1.setOkras(Color.BLACK);
        Cat cat7 = new Cat();
        cat1.setOkras(Color.BLACK);
        System.out.println(cat1.getWeight());
        System.out.println(cat2.getWeight());
        System.out.println(cat3.getWeight());
        System.out.println(cat4.getWeight());
        System.out.println(cat5.getWeight());
        System.out.println(cat6.getWeight());
        System.out.println(cat7.getWeight());
        System.out.println(cat3.getStatus());
        cat3.feed();
        cat3.pee();
        cat3.pee();
        cat3.pee();
        System.out.println(cat3.Return_eat());
        System.out.println(cat3.getWeight());
        while (cat3.getStatus() != "Exploded") {
           cat3.feed();
        }
        System.out.println(cat3.getStatus());
    }
}