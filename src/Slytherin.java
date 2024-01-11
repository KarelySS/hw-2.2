public class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;

    private final int resourcefulness;
    private final int lustForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance,
                     int cunning, int determination, int ambition,
                     int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }
    public void compare (Slytherin other){
        if (allPointsSum() > other.allPointsSum()) {
            System.out.println(getName() + " сильнее чем " + other.getName());
        } else if (allPointsSum() < other.allPointsSum()) {
            System.out.println(other.getName() + " сильнее чем " + getName());
        } else {
            System.out.println("Силы оказались равны");
        }
    }

    @Override
    public String toString() {
        return super.toString() +", cunning"+ cunning + ", determination=" + determination + ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness + ", lustForPower=" + lustForPower;
    }

    private int allPointsSum() {
        return cunning+determination+ambition+resourcefulness+lustForPower;
    }
}
