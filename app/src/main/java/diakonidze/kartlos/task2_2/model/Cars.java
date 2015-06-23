package diakonidze.kartlos.task2_2.model;

import java.io.Serializable;

/**
 * Created by kartlos on 6/11/2015.
 */
public class Cars implements Serializable {

    private String marka, modeli, owner, phone, condition, color, imig;
    private int year, cost, odometer;

    public Cars(String marka, String modeli, String owner, String phone, String condition, String color, int year, int cost, int odometer, String imig) {
        this.marka = marka;
        this.modeli = modeli;
        this.owner = owner;
        this.phone = phone;
        this.condition = condition;
        this.color = color;
        this.year = year;
        this.cost = cost;
        this.imig = imig;
        this.odometer = odometer;
        
    }

    @Override
    public String toString() {
        return "Cars{" +
                "marka='" + marka + '\'' +
                ", modeli='" + modeli + '\'' +
                ", owner='" + owner + '\'' +
                ", phone='" + phone + '\'' +
                ", condition='" + condition + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", cost=" + cost +
                ", odometer=" + odometer +
                '}';
    }

    public String getImig() {
        return imig;
    }

    public void setImig(String imig) {
        this.imig = imig;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModeli() {
        return modeli;
    }

    public void setModeli(String modeli) {
        this.modeli = modeli;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
