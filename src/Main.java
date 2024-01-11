public class Main {
    public static void main(String[] args) {

        Gryffindor potter = new Gryffindor(
                "Harry Potter", 79, 60, 99, 99, 99);
        Gryffindor granger = new Gryffindor(
                "Hermione Granger", 85, 75, 100, 100, 100);
        Gryffindor weasley = new Gryffindor(
                "Ron Weasley", 51, 35, 75, 64, 49);
        Slytherin malfoy = new Slytherin(
                "Draco Malfoy", 78, 79, 81,
                69, 91, 85, 89);
        Slytherin montague = new Slytherin(
                "Graham Montague", 49, 35, 28,
                43, 25, 10, 65);
        Slytherin goyle = new Slytherin(
                "Gregory Goyle", 47, 28, 35,
                54, 63, 78, 69);
        Hufflepuff smith = new Hufflepuff(
                "Zachariah Smith", 59, 63, 75, 89, 79);
        Hufflepuff diggory = new Hufflepuff(
                "Cedric Diggory", 87, 79, 91, 95, 100);
        Hufflepuff Fletchley = new Hufflepuff(
                "Justin Finch-Fletchley", 35, 49, 37,
                63, 59);
        Ravenclaw chang = new Ravenclaw(
                "Zhou Chang", 69, 57, 81,
                63, 71, 54);
        Ravenclaw patil = new Ravenclaw(
                "Padma Patil", 59, 68, 71,
                63, 72, 85);
        Ravenclaw belby = new Ravenclaw(
                "Marcus Belby", 14, 28, 5,
                31, 7, 3);
        System.out.println(potter);
        diggory.compare(belby);
        granger.compare(malfoy);
    }
}

