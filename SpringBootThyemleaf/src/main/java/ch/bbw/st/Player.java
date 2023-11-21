package ch.bbw.st;

public class Player {
   private int number;
   private String name;
   private String bildUrl;
   private String nationaliti;
   private double hight;
   private String gebDate;
   private int age;
   private double value;
   private String club;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBildUrl() {
        return bildUrl;
    }

    public void setBildUrl(String buildUrl) {
        this.bildUrl = buildUrl;
    }

    public String getNationaliti() {
        return nationaliti;
    }

    public void setNationaliti(String nationaliti) {
        this.nationaliti = nationaliti;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public String getGebDate() {
        return gebDate;
    }

    public void setGebDate(String gebDate) {
        this.gebDate = gebDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", bildUrl='" + bildUrl + '\'' +
                ", nationaliti='" + nationaliti + '\'' +
                ", hight=" + hight +
                ", gebDate='" + gebDate + '\'' +
                ", age=" + age +
                ", value=" + value +
                ", club='" + club + '\'' +
                '}';
    }
}
