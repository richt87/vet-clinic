package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class Dog {
    private final String name;
    private final String breed;
    private final LocalDateTime dateOfBirth;
    private final String homeTown;
    private final String favoriteFood;

    public Dog(String name, String breed, LocalDateTime dateOfBirth, String homeTown) {
        this(name, breed, dateOfBirth, homeTown, null);

    }

    public Dog(String name, String breed, LocalDateTime dateOfBirth, String homeTown, String favoriteFood) {
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.homeTown = homeTown;
        this.favoriteFood = favoriteFood;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }
    public String getHomeTown() {
        return homeTown;
    }
    public String getFavoriteFood() {return favoriteFood; }


    public static DogBuilder called(String name) {
    return new DogBuilder(name);
    }
    public static class DogBuilder {
        private String name;
        private String breed;
        private String homeTown;

        private LocalDateTime birthday;

        public DogBuilder (String name) {
            this.name = name;
        }
        public DogBuilder ofBreed(String breed) {this.breed = breed; return this;}
        public DogBuilder homeTown(String homeTown) {this.homeTown = homeTown; return this;}
        public DogBuilder bornOn(LocalDateTime birthday) {this.birthday = birthday; return this;}


        public Dog build() {return new Dog(name, breed, birthday, homeTown);}
    }
}
