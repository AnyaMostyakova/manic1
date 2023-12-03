package ru.kpfu.itis.model;

public class Services {
    private Long id;
    private String type;
    private int time;
    private int price;
    public Services(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Services(Long id, String type, int time, int price) {
        this.id = id;
        this.type = type;
        this.time = time;
        this.price = price;
    }
}
