package Models;

public class Student {

    private String Name;
    private String Gender;
    private double GPA;
    private String Address;
    private int BitNumber;

    public Student(String n, String ge, double g, String a, int b) {
        this.Name = n;
        this.Gender = ge;
        this.GPA = g;
        this.Address = a;
        this.BitNumber = b;

    }
    public String getName()
    {
        return this.Name;        
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getBitNumber() {
        return BitNumber;
    }

    public void setBitNumber(int BitNumber) {
        this.BitNumber = BitNumber;
    }
    
}
