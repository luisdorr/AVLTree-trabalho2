package model.structures;

import java.util.Date;

public class Person {
    private Long CPF;
    private Long RG;
    private String name;
    private Date birthDay;
    private String cityName;
    
    public Person(long cPF, long rG, String name, Date birthDay, String cityName) {
        CPF = cPF;
        RG = rG;
        this.name = name;
        this.birthDay = birthDay;
        this.cityName = cityName;
    }

    public long getCPF() {
        return CPF;
    }
    public void setCPF(long cPF) {
        CPF = cPF;
    }
    public long getRG() {
        return RG;
    }
    public void setRG(long rG) {
        RG = rG;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    

    
   
}