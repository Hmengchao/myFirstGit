package org.entity;

public class Sell {
    private String Cargo_ID;
    private int Sell_num;
    private double Sell_Price;

    public String getCargo_ID() {
        return Cargo_ID;
    }

    public void setCargo_ID(String cargo_ID) {
        Cargo_ID = cargo_ID;
    }

    public int getSell_num() {
        return Sell_num;
    }

    public void setSell_num(int sell_num) {
        Sell_num = sell_num;
    }

    public double getSell_Price() {
        return Sell_Price;
    }

    public void setSell_Price(double sell_Price) {
        Sell_Price = sell_Price;
    }

    @Override
    public String toString() {
        return "Sell{" +
                "Cargo_ID='" + Cargo_ID + '\'' +
                ", Sell_num=" + Sell_num +
                ", Sell_Price=" + Sell_Price +
                '}';
    }
}
