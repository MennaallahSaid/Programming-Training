public class Student extends Person{
    String dep ;
    int level ;
    public Student(){

    }
    public Student(String n,int a,String ad ,String d ,int l ){
//        name= n ;
//        age=a;
//        address= ad;
        super(n,a,ad);
        dep= d ;
        level= l;

    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getDep() {
        return dep;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
