package com.example.oopsection2;

public class Eye extends Organ{
    private String color;
    private Boolean isOpened;

    public Eye(String name, String condition, String color, Boolean isOpened) {
        super(name, condition);
        this.color = color;
        this.isOpened = isOpened;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: " + this.getColor());
    }

    public void open() {
        this.setOpened(true);
        System.out.println(this.getName() + " Opened");
    }

    public void close() {
        this.setOpened(false);
        System.out.println(this.getName() + " Closed");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isOpened() {
        return isOpened;
    }

    public void setOpened(Boolean opened) {
        isOpened = opened;
    }
}
