package org.example.datatype.collection;

import java.util.Objects;

public class Laptop implements Comparable<Laptop> {
    private String brand;
    private double price;

    public Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.getPrice(), getPrice()) == 0 && getBrand().equals(laptop.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getPrice());
    }

    /**
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Laptop o) {
        return  this.getBrand().compareToIgnoreCase(o.getBrand());
    }
}
