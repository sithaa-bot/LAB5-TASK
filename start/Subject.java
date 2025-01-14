/**
 * Name: Subject.java
 * Date: 14 January 2025
 * Author: HUOTH SITHA
 * Modified: 14 January 2025
 * Description: Lab 05
 * Functions:
 * -getPrice(): Subject
 * -getProgram(): Subject
 * -getName(): Subject
 * -getCredits(): Subject
 * Variables:
 * -price: Subject
 * -PROGRAM: Subject
 * -name: Subject
 * -credits: Subject
 */
public class Subject {

    private static final double price;
    static {
        price = 9.9;
    }

    private static final String PROGRAM = "Year 2 Program";

    private String name;
    private int credits;

    public static final double getPrice() {
        return price;
    }

    public static String getProgram() {
        return PROGRAM;
    }

    public Subject(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Subject name can't be null or empty.");
        }
        this.name = name;
    }
    public static void main(String[] args) {

    }

}