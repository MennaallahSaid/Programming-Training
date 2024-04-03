public class Semployee extends Employee {

    protected int deva ;

    int bounce ;
    int deco ;
    public Semployee(){

    }
    public Semployee(String n,int a,String ad,String j,int s , int h,int bo , int de){
        super(n,a,ad,j,s,h);
        bounce=bo ;
        deco= de;

    }
    @Override

    public int getSalary(){
        return salary + bounce - deco ;

    }


}
