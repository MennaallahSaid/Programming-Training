public  abstract class Person {
    String name ;
    int id ;
    String department ;
    int password ;
    int age ;
    public Person() {

    }
    public Person(String n ,int idd,String dep ,int pass , int a){
        name= n;
        id = idd;
        department=dep;
        password = pass;
        age= a;
    }
    public void setName(String n){
        name= n ;

    }



    public String getName() {
        return name;
    }
    public void setAge(int a){
        age= a ;
    }
    public int getAge(){
        return age;
    }
    public void setId(int idd){
        id= idd ;

    }
    public int getId(){
        return id;
    }
    public void setDepartment( String dep){
        department = dep ;
    }
    public String getDepartment(){
        return department;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
