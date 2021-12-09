package org.vashonsd;

public class Main {

    /**
     * For now, use the main() method to print out the name of a show.
     * Create several Performers by giving them names and descriptions.
     * If you want a performer to have had one or more hit songs, use the performer's
     * .addHit() method along with the name of the hit.
     * Then print out the performers.
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Desert Rocks, the hot new venue! Featuring: ");

        Performer alan = new Performer("Alan", "has been performing for 6 years and lives in Ohio");

        alan.addHit("food");
        alan.addHit("water");
        alan.addHit("cat food");
        System.out.println(alan);

        Performer jann = new Performer( "Jann", "Has been performing for 3 years and lives in Texas");
        System.out.println(jann);
        jann.addHit("see the sea");

    }
}
