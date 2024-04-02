public class User extends Person{
    String uname ;
    int uid ;
    int application ;
    int ltimes;
    //boolean login ;
    public User(){

    }
    public User(String n ,int idd,String dep ,int pass , int a,String un,int uidd,int app,int lti ){
        super(n,idd,dep,pass,a);
        uname = un;
        uid = uidd;
        application= app;
        ltimes = lti ;

    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getApplication() {
        return application;
    }

    public void setApplication(int application) {
        this.application = application;
    }

    public int getLtimes() {
        return ltimes;
    }

    public void setLtimes(int ltimes) {
        this.ltimes = ltimes;
    }

   //

   // public void setLogin(boolean login) {
   //     this.login = login;
   // }
    public void logtimes (int count){
        count = 0 ;
        for (int i =0 ;i<5 ;i++){
            count += 1;
        }

    }
    public boolean login (String u, int p){
        if( u.equals(uname) && p==password){
            return true;

        }
        else
            System.out.println("false pass or name");
        return false;


    }
}
