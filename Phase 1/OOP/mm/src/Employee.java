public abstract class Employee extends Person{
    String job ;
    int salary ;
    int hours ;
    public Employee(){

    }
    public Employee(String n,int a,String ad,String j,int s , int h){
        super(n,a,ad);
        job=j;
        salary=s;
        hours= h ;

    }

    public String getJob() {

        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public abstract int getSalary() ;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
