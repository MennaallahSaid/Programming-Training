//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2= new Student("mel",14,"alm","ai",2);
        System.out.println(s2.address + "  and  " +s2.age);
        // System.out.println("hi");
        //System.out.printf(s2.dep);


        Semployee se1 = new Semployee("lola",21 ,"aloml","nom",15000,7 ,1500,800);
        System.out.println(se1.getSalary());
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}