import java.awt.*;
import java.util.Objects;

public class Employee {

    String name;
    int age;
    int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

   //public String toString() {
    //    return this.getClass().getName() + "[imie i nazwisko: " + name + " wiek " + age + " zxarobki " + salary + "]";
   // }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                salary == employee.salary &&
                Objects.equals(name, employee.name);
    }


    public static void main(String[] args) {
        Integer i = 1;
        System.out.println(i.toString());

        Point p = new Point(2,3);
        System.out.println(p.toString());

        Employee e1 = new Employee("Kowalski", 32, 2345);
        System.out.println(e1);//toString wyswietla sie defoltowo

        Employee e2 = new Employee("Nowak", 36, 23475);
        System.out.println(e2);//toString wyswietla sie defoltowo

        Employee e3 = new Employee("Kowalski", 32, 2345);

        Menager m1 = new Menager("Jan", 56, 23, 44);
        Menager m2 = new Menager("Jan", 56, 23, 44);
        Menager m3 = new Menager("Jafn", 565, 23, 44);
        System.out.println("---------------------------------------------------------");

        if (e1.equals(m1)){
            System.out.println("Ta sama osoba");
        } else {
            System.out.println("Rózne osoby");
        }



    }
}

class Menager extends Employee {
    int bonusSalary;

    public Menager(String name, int age, int salary, int bonusSalary) {
        super(name, age, salary);
        this.bonusSalary = bonusSalary;
    }

    @Override
    public String toString() {
        return "Menager{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", bonusSalary=" + bonusSalary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Menager menager = (Menager) o;
        return bonusSalary == menager.bonusSalary;
    }


}



