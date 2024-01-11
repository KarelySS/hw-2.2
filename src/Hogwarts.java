public abstract class Hogwarts {
    private final String name;
    private final int magicPower;
    private final int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void compare(Hogwarts other) {
        if (allPointsSum() > other.allPointsSum()) {
            System.out.println(name + " сильнее чем " + other.name);
        } else if (allPointsSum() < other.allPointsSum()) {
            System.out.println(other.name + " сильнее чем " + name);
        } else {
            System.out.println("Силы оказались равны");
        }
    }
    private int allPointsSum() {
        return magicPower + transgressionDistance;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance;
    }
}

