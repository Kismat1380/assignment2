package person;

public abstract class Person implements Payable, Comparable<Person>{
    private static int gen_id = 1;
    private final int id;
    private String name;
    private String surname;

    public Person(){
        id = gen_id++;
    }

    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }

    public int getId(){ return id; }
    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }
    public String getSurname(){ return surname; }
    public void setSurname(String surname){ this.surname = surname; }

    public abstract String getPosition();
    @Override
    public double getPaymentAmount() {
        return 0;
    }
    @Override
    public String toString(){
        return getPosition() + id + ". " + name + " " + surname + " earns " + getPaymentAmount() + " tenge.";
    }
}
