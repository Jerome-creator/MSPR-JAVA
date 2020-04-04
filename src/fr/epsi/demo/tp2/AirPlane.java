package fr.epsi.demo.tp2;

import java.util.Objects;

public class AirPlane {
    private final String brand;
    private final String model;
    private int capacity;
    private int speed;
    private int elevation;

    public AirPlane(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public AirPlane(String brand, String model, int capacity) {
        this(brand, model);
        this.capacity = capacity;
    }

    public void decelerate(int deceleration) {
        if (this.speed > deceleration) {
            this.speed -= deceleration;
        } else {
            this.speed = 0;
        }
    }

    public void accelerate(int acceleration) {
        this.speed += acceleration;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "AirPlane{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                ", speed=" + speed +
                ", elevation=" + elevation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirPlane airPlane = (AirPlane) o;
        return Objects.equals(brand, airPlane.brand) &&
                Objects.equals(model, airPlane.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}
