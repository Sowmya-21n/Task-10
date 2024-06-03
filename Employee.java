package task10;
public class Employee {
    private int id;
    private String firstName;
    private String LastName;
    private double monthlySalary;
    public Employee(int id, String fname,String lname, double msalary) {
        this.firstName = fname;
        this.id = id;
        this.LastName = lname;
        this.monthlySalary = msalary;
        if (msalary < 0)
            msalary = 0;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    public void setFirstName(String fname)
    {
        firstName=fname;
    }
    public  void setLastName(String lname)
    {
        LastName = lname;
    }

    public void setMonthlySalary(double msalary)
    {
        monthlySalary=msalary;
    }
    public double getMonthlySalary()
    {
        return monthlySalary;
    }

    public double getyearlySalary()
    {
        double yearlySalary=monthlySalary*12;
        return yearlySalary;
    }
    public double getRaiseSalary()
    {
        double raise=monthlySalary*0.1;
        double raiseSalary=(monthlySalary+raise)*12;
        return raiseSalary;
    }
}
