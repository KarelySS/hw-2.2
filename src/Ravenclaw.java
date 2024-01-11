public class Ravenclaw extends Hogwarts {
    private final int intellect;
    private final int wisdom;
    private final int wittiness;
    private final int creation;

    public Ravenclaw(String name, int magicPower,
                     int transgressionDistance, int intellect, int wisdom, int wittiness, int creation) {
        super(name, magicPower, transgressionDistance);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creation = creation;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public int getCreation() {
        return creation;
    }

    public void compare(Ravenclaw other) {
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
        return super.toString() +", intellect"+ intellect + ", wisdom=" + wisdom + ", wittiness=" +
                wittiness + ", creation=" + creation;
    }

    private int allPointsSum() {
        return intellect + wisdom + wittiness + creation;
    }
}
