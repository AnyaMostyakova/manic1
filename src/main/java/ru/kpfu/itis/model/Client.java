package ru.kpfu.itis.model;
public class Client {
    private Long id;
    private String password;
    private String email;
    public Client() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Client(Long id, String email, String password) {
        this.id = id;
        this.password = password;
        this.email = email;
    }
}