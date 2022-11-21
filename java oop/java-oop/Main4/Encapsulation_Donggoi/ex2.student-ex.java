class Student{
    private int id;
    private String name;
    private int age;
    private String address;
    private int score;

    public Student(){
        //khong tham so;
    }
    public Student(int id, String name, int age, String address, int score){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.score = score;
        //co tham so;
    }
    
    
    //set functions;
	public void setAge(int age) {
		this.age = age;
	}
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setScore(int score){
        if(score < 0){
            this.score = 0;
        }else if(score > 10){
            this.score = 10;
        }else{
            this.score = score;
        }
    }
    
    //get functions;
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getAddress(){
        return address;
    }
    public int getScore(){
        return score;
    }
    public int getAge() {
		return age;
	}
     
}