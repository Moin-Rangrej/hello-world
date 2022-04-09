package com.example.tewasocialmedia;

public class CarDetails {
   private String carName;
   private int Miles_per_Gallon;
   private int Cylinders;
   private int Horsepower;
   private String Year;
   private String Origin;


    public CarDetails() {
    }

    public CarDetails(String carName,String Year,String Origin,int Miles_per_Gallon,int Horsepower,int Cylinders) {
        this.carName = carName;
        this.Year = Year;
        this.Origin = Origin;
        this.Miles_per_Gallon = Miles_per_Gallon;
        this.Cylinders = Cylinders;
        this.Horsepower = Horsepower;
        //, float miles_per_Gallon, int cylinders, int horsepower, String year, String origin
    }



    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setMiles_per_Gallon(int miles_per_Gallon) {
        Miles_per_Gallon = miles_per_Gallon;
    }

    public void setCylinders(int cylinders) {
        Cylinders = cylinders;
    }

    public void setHorsepower(int horsepower) {
        Horsepower = horsepower;
    }

    public void setYear(String year) {
        Year = year;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    @Override
    public String toString() {
        return "CarDetails{" +
                "carName='" + carName + '\'' +
                ", Miles_per_Gallon=" + Miles_per_Gallon +
                ", Cylinders=" + Cylinders +
                ", Horsepower=" + Horsepower +
                ", Year='" + Year + '\'' +
                ", Origin='" + Origin + '\'' +
                '}';
    }

    public String getCarName() {
        return carName;
    }

    public int getMiles_per_Gallon() {
        return Miles_per_Gallon;
    }

    public int getCylinders() {
        return Cylinders;
    }

    public int getHorsepower() {
        return Horsepower;
    }

    public String getYear() {
        return Year;
    }

    public String getOrigin() {
        return Origin;
    }
}
