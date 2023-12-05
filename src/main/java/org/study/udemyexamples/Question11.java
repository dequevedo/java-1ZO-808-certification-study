package org.study.udemyexamples;

abstract class Animal {
    private String name;
    private Integer age;

    Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}

class Dog extends Animal {
    private String breed;

//    Dog(String breed) {
//        super(null, null); //Sem isso o código não compila
//        this.breed = breed;
//    }

    Dog(String name, String breed) {
        super(name, null);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}

//public class Question11 {
//    public static void main(String[] args) {
//        Dog dog1 = new Dog("Beagle");
//        Dog dog2 = new Dog("Bubbly", "Poodle");
//        System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" +
//                dog2.getName() + ":" + dog2.getBreed());
//    }
//}