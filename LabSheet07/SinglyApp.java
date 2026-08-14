public class SinglyApp {
    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();

        System.out.println("Test method 'append()'");
        System.out.println("=======================");
        for (int i = 101; i <= 105; i++) {
            list1.append(i);
        }
        System.out.print("Current List => ");
        list1.printList();
        System.out.println();

        System.out.println("Test method 'get()'");
        System.out.println("=======================");
        int i = 2, j = 7;
        Object valI = list1.get(i);
        Object valJ = list1.get(j);
        System.out.println("Get element index " + i + " = " + (valI != null ? valI : "No data"));
        System.out.println("Get element index " + j + " = " + (valJ != null ? valJ : "No data"));
        System.out.println();

        System.out.println("Test method 'set()'");
        System.out.println("=======================");
        list1.set(2, 111);
        System.out.print("Current List => ");
        list1.printList();
        list1.set(7, 222);
        System.out.print("Current List => ");
        list1.printList();
        System.out.println();

        System.out.println("Test method 'contains()'");
        System.out.println("=======================");
        int find1 = 104, find2 = 222;
        System.out.println(find1 + (list1.contains(find1) ? " found!!" : " not found..."));
        System.out.println(find2 + (list1.contains(find2) ? " found!!" : " not found..."));
        System.out.println();

        System.out.println("Test method 'addAll()'");
        System.out.println("=======================");
        System.out.print("Elements in list1 => "); list1.printList();
        System.out.print("Elements in list2 => "); list2.printList();
        list1.addAll(list2);
        System.out.print("Merge result => "); list1.printList();
        System.out.println();

        for (int k = 201; k <= 205; k++) {
            list2.append(k);
        }
        System.out.print("Elements in list1 => "); list1.printList();
        System.out.print("Elements in list2 => "); list2.printList();
        list1.addAll(list2);
        System.out.print("Merge result => "); list1.printList();
        System.out.println();

        list1.clear();
        System.out.print("Elements in list1 => "); list1.printList();
        System.out.print("Elements in list2 => "); list2.printList();
        list1.addAll(list2);
        System.out.print("Merge result => "); list1.printList();
    }
}