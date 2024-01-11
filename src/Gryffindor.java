public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int courage;

    public Gryffindor(String name, int magicPower,
                      int transgressionDistance, int nobility, int honor, int courage) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public void compareTo(Gryffindor other) {
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
        return super.toString() + ", nobility=" + nobility + ", honor=" + honor + ", courage=" + courage;
    }

    private int allPointsSum() {
        return nobility + honor + courage;
    }

}
