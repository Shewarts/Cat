
public class Cat
{
    private double originWeight;
    private double weight;
    public static int count;
    private static final int countEye = 2;
    private static final double minWeight = 1000.0;
    private static final double maxWeight= 9000.0;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;
    }

    public static int getCount()
    {
       return count;
    }

    public void meow()
    {
        weight = weight - 1;
        if (weight < minWeight)
        {
            count--;
        }
        System.out.println("Meow");
    }

    public void feed()
    {
        weight = weight +150;
        if (weight < minWeight)
        {
            count--;
        }
        System.out.println("Feed");
    }

    public void setOkras(Color type)
    {
    }]

    public Double Return_eat()
    {
        return getWeight()-originWeight;
    }
    {

        System.out.println("return_eat");
    }

    public Double pee()
    {
        weight = weight -1;
        if (weight < minWeight)
        {
            count--;
        }
        System.out.println("Pee complete");
        return weight;
    }

    public void drink(Double amount)

    {
        weight = weight + amount;
        if (weight < minWeight)
        {
            count--;
        }
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

}