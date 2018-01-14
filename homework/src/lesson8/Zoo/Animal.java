package lesson8.Zoo;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Hrrr");
    }

    public void eat() {
        System.out.println("I usually eat " + food);
    }

    public void sleep() {
        System.out.println("I'm going to sleep! Goodnight!");
    }
}
