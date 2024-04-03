//import System.*//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("hi");
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
        System.out.println(" hi");
 //       Rectangle r = new Rectangle();
//        r.get area();
   //     r.setlength(4);;;;;;;
  //      r.setwidth(4);
     //   System.out.println(r.getarea());
        Car c1 = new Car();
       // c1.setmodel(2010);
        c1.getModel();
        System.out.println(c1.getModel());

        System.out.println("area");

        Employee e1 = new Employee("ali" , 200,true,15000 ,15 );
        Employee e2 = new Employee("nae" ,250,false);
        e2.sername(8000 , "lali");

        e1.printd();
        e2.printd();
//        Rectangle room3 = new Rectangle();
//        Rectangle myi = new Rectangle(15,9 );
//        room3.modirec(myi);
//        System.out.println (myi.returnlengh());
//        System.out.println ( myi.returnwidth());
//        System.out.println ( myi.getarea());
        Rectangle r1 = new Rectangle(5,7);
        Rectangle r2 = new Rectangle(8,11);
        Rectangle r3 = r1.add(r2);
        Rectangle r4 =  r3.add( r2);
        System.out.println(r4.returnlengh());
        System.out.println(r4.returnwidth());
        if (r1.ise(r2))
            System.out.println("is  the same");

        else
            System.out.println("is not the same");






    }
}