public class Admain extends Person{
    int access ;
    String admainname ;
    int block ;
    int application ;
    public Admain(){

    }
    public Admain(String n ,int idd,String dep ,int pass , int a ,int acc ,String adname ,int bo , int app ){
        super(n,idd,dep,pass,a);
        access= acc;
        admainname= adname;
        block=bo;
        application=app;
    }

    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    public String getAdmainname() {
        return admainname;
    }

    public void setAdmainname(String admainname) {
        this.admainname = admainname;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getApplication() {
        return application;
    }

    public void setApplication(int application) {
        this.application = application;
    }
    public int set_salary(){
        int salary = 70000;
        int bounce=300;
        return salary = salary+ bounce;
    }

}
