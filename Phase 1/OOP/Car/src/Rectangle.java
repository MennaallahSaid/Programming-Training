public class Rectangle {
    private int length ;
    private int width ;

    public Rectangle(int i, int i1) {
        length=i;
        width=i1;

    }

    public Rectangle() {

    }
    public Rectangle add( Rectangle roo2){
        Rectangle result = new Rectangle();
        result.length= this.length + roo2.length ;
        result.width= this.width+ roo2.width ;
        return result ;

    }

    public void setwidth ( int w){
        w= 5 ;
        width = w ;
    }
    public void setlength ( int l) {
        l=18 ;
        length = l ;
    }
    public void modirec( Rectangle r){
        r.width= 2 ;
        r.length= 3 ;
    }

    public int returnwidth (){
        return width ;
    }
    public int returnlengh (){
        return length ;
    }
    public int getarea (){
        return width*length ;
    }
    public boolean ise(Rectangle obj){
        if (this.width== obj.width && this.length== obj.length)
            return true;
        else
            return false;



    }
}
