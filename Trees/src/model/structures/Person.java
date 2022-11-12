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

    @Override
    public String toString() {
        return "Person [CPF=" + CPF + ", RG=" + RG + ", name=" + name + ", birthDay=" + birthDay + ", cityName="
                + cityName + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((CPF == null) ? 0 : CPF.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (CPF == null) {
            if (other.CPF != null)
                return false;
        } else if (!CPF.equals(other.CPF))
            return false;
        return true;
    }

    
    

    
   
}