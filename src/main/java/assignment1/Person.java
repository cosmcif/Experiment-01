package assignment1;

/**
 * assignment1.Person class representing an individual with attributes such as name, age, profession,
 * marital status, and income.
 */
public class Person {

    private String name;
    private int age;
    private String profession;
    private boolean isMarried;
    private double income;

    /**
     * Constructs a new assignment1.Person object with the given attributes.
     *
     * @param name       The name of the person.
     * @param age        The age of the person.
     * @param profession The profession of the person.
     * @param isMarried  The marital status of the person.
     * @param income     The income of the person.
     */
    public Person(String name, int age, String profession, boolean isMarried, double income) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.isMarried = isMarried;
        this.income = income;
    }

    /**
     * Gets the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the age of the person.
     *
     * @return The age of the person.
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Gets the profession of the person.
     *
     * @return The profession of the person.
     */
    public String getProfession() {
        return this.profession;
    }

    /**
     * Checks if the person is married.
     *
     * @return True if the person is married, false otherwise.
     */
    public boolean isMarried() {
        return this.isMarried;
    }

    /**
     * Gets the income of the person.
     *
     * @return The income of the person.
     */
    public double getIncome() {
        return this.income;
    }
}
