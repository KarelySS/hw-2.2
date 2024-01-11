public class Hufflepuff extends Hogwarts {
    private final int hardworking;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionDistance,
                      int hardworking, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
    public void compare (Hufflepuff other){
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
        return super.toString() +", hardworking"+ hardworking + ", loyalty=" + loyalty + ", honesty=" + honesty;
    }

    private int allPointsSum() {
        return hardworking + loyalty + honesty;
    }
}
