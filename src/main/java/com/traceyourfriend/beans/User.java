package com.traceyourfriend.beans;

public class User implements Comparable<User> {
    private long id;

    private String name;

    private String mail;

    private String password;

    private String coor;

    public User(){}

    public User(String name, String mail, String password) {
        this.name = name;
        this.mail = mail;
        this.password = password;
    }

    public User(String name, String mail, String password, String coor) {
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.coor = coor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCoor(){return coor;}

    public void setCoor(String coorNew){this.coor = coorNew;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return !(mail != null ? !mail.equals(user.mail) : user.mail != null);

    }

    @Override
    public int hashCode() {
        return mail != null ? mail.hashCode() : 0;
    }

    @Override
    public int compareTo(User o) {
        return mail.compareToIgnoreCase(o.getMail());
    }

    @Override
    public String toString() {
        return mail;
    }


}
