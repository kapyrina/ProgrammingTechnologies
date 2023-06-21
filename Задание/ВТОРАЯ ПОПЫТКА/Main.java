package F;

public class Main {
    
    public static void main (String[] args) {
        Spisok list = new Spisok();
        
        list.add(6);
        list.add(6);
        list.add(7);
        list.add(2);
        list.add(9);
        
        list.print();
        
        list.remove(2);
        
        //list.print();
    }
}
