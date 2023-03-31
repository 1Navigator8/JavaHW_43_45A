package org.example.HomeWork._17_03_23;

//  Объявляем класс Person с полем name и методом toString, который возвращает имя
class Person {
    private String Firstname;
    private String Lastname;
    private int age;


    Person(String Firstname, String Lastname, int age) {
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
