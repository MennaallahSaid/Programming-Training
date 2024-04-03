public class Person {
    String name;
    int age ;
    String address ;
    public Person(){

    }
    public Person( String n ,int a ,String ad ){
        name= n;
        age= a ;
        address= ad ;

    }
    public void setName( String n){
        name=n ;

    }
    public void setAge( int a){
        age= a ;
    }
    public void setAddress( String ad){
        address= ad;
    }
}
