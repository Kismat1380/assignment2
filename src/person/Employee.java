package person;

public class Employee extends Person {
    private double salary;
    private String position;

    public Employee(){ super(); }
    public Employee(String name, String surname, String position, double salary){
        super(name, surname);
        setSalary(salary);
        setPosition(position);
    }
    public double getSalary(){ return salary; }
    public void setSalary(double salary){ this.salary = salary; }
    @Override
    public String getPosition(){ return position; }
    public void setPosition(String position){ this.position = position; }
    @Override
    public double getGpa(){ return 0; }

    @Override
    public double getPaymentAmount() {
        return getSalary();
    }
    @Override
    public String toString(){
        return getPosition() + ": " + getId() + "." + getName() + " " + getSurname() + " earns " + getPaymentAmount() + " tenge.";
    }
    @Override
    public int compareTo(Person another){
        return Double.compare(getPaymentAmount(), another.getPaymentAmount());
    }
}
