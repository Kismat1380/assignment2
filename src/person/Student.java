package person;

public class Student extends Person {
    private double gpa;
    public Student(){
        super();
    }
    public Student(String name, String surname, double gpa){
        super(name, surname);
        setGpa(gpa);
    }
    @Override // to correctly compare Students` gpa
    public double getGpa(){ return gpa; }
    public void setGpa(double gpa){ this.gpa = gpa; }
    @Override
    public String getPosition(){
        return "Student: ";
    }

    @Override
    public double getPaymentAmount(){
        if(gpa < 2.67){ return 0; }

        return 36660.00;
    }
    @Override
    public String toString(){
        return getPosition() + getId() + "." + getName() + " " + getSurname() + " earns " + getPaymentAmount() + " tenge.";
    }
    @Override
    public int compareTo(Person another){
        return Double.compare(gpa, another.getGpa());
    }
}
