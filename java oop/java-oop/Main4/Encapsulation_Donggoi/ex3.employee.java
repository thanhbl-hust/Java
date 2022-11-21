class Employee{
    private int id;
    private String firstName;
    private String lastName;
    private int salary;


    public Employee(int id, String firstName, String lastName, int salary){

        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;

    }

    //set functions;
    public void setId(int id){
        this.id = id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    //get functions;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getSalary(){
        return salary;
    }
    public int getId(){
        return id;
    }





    public String getFullName(){
        return firstName + lastName;
    }

}