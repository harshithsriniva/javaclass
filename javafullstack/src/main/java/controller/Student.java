package controller;

public class Student {
    private String name;
    private int score;
    private String address;
    private String phoneNumber;

    public Student(String name, int score, String address, String phoneNumber, String city) {
        this.name = name;
        this.score = score;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }

    private String city;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }
}
