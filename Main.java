package OOP3;
public class Main{
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(15);
        list.add(85);
        list.add(23);
        list.add(99);
        list.add(3);
        list.add(14);
        list.add(22);

        list.forEach(System.out::println);

        System.out.println("\n---------------\n");
        System.out.printf("Size: %d%n", list.size());
        System.out.println("\n---------------\n");
        System.out.println(list.getPreviousByIndex(3));
        System.out.println(list.getByIndex(3));
        System.out.println(list.getNextByIndex(3));
        list.replaceByIndex(3, 100);
        System.out.println(list.getByIndex(3));
    }
}