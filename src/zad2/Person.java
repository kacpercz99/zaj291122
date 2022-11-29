package zad2;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String pesel;
    private String firstName;
    private String lastName;

    public Person(String pesel, String firstName, String lastName) {
        this.pesel = pesel;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pesel='" + pesel + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Person o) {
        if(this == o) return 0;
        if(o == null) return -1;
        int last = lastName.compareTo(o.lastName);
        return last == 0 ? firstName.compareTo(o.firstName) : last;
    }
}
