class Employee
{
    public Employee()
    {
        System.out.println("Employee ");
    }
    public void print()
    {
        System.out.println("Employee Details");
    }
}

class Manager extends Employee
{
    public Manager()
    {
        System.out.println("Manager");
    }
    public void print()
    {
        System.out.println("Manager Details");
    }
}
class Supervisor extends Employee
{
    public Supervisor()
    {
        System.out.println("Supervisor");
    }
    public void print()
    {
        System.out.println("Supervisor Details");
    }
}
public class Test {

    public static void main(String[] args) {

        Employee emp3 = new Manager();

        emp3.print();
    }
}
