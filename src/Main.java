//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Removing_duplicates rd = new Removing_duplicates();
        rd.add(2);
        rd.add(3);
        rd.add(3);
        rd.add(1);
        rd.add(4);
        rd.add(3);
        rd.add(3);
        rd.display();
        System.out.println("after deleting");
        rd.delete(3);
        rd.display();

    }
}