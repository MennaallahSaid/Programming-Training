public class Employee {
    int emlployeeId ;
    String  emlployeeName ;
    int  emlployeeDepart ;
    int  emlployeeSalary ;
    boolean  emlployeerasint ;
    public Employee(){
        emlployeeName = "ahmed" ;
        emlployeerasint= true;
        emlployeeDepart= 5 ;
        emlployeeSalary = 7000;
        emlployeeId = 70;

    }
    public Employee(String n , int idn){
        emlployeeName= n;
        emlployeeId= idn ;

    }
    public Employee(String n , int idn , boolean r){
        this( n , idn);
        emlployeerasint = r ;

    }
    public Employee(String n , int idn , boolean r, int s , int d){
        this(n ,idn,r);
        emlployeeSalary =s ;
        emlployeeDepart=d;

    }
    public void setsalary( int s){
        emlployeeSalary = s ;
    }
    public void sername(int s , String n){
        this.setsalary(s);
        emlployeeName = n;
    }
    public void printd(){
        System.out.println("depart" +emlployeeDepart );
        System.out.println( "name"+emlployeeName);
        System.out.println("rasist"+ emlployeerasint);
        System.out.println("salary"+emlployeeSalary);
        System.out.println("id"+emlployeeId);
    }


}
