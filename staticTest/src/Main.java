//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        new Test();
        new Test();
        new Test();
        new Test();

      //  System.out.println("Anzahl:"+Test.count);//4

        Todo t1= new Todo();
        t1.id=1;
        Todo t2= new Todo();
        t2.id=2;

        System.out.println(t1.id);
        System.out.println(t2.id);


    }
}