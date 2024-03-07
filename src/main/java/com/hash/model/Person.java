package com.hash.model;

public class Person {

    private int age;
    private String fname;
    private String lname;
    private String city;

    public Person(){

    }
    public Person(int age, String fname, String lname, String city) {
        this.age = age;
        this.fname = fname;
        this.lname = lname;
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
