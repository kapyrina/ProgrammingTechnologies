public class Runner {
    public static void main (String[] args) {
        List list = new List();
        
        list.addFirst(data:1);
        list.addFirst(data:2);
        list.addLast(data:3);
        list.addByIndex(data:4, index:1);
        list.print();
        
        System.out.println();
        list.removeAt(key:1);
        list.print();
    }
}
