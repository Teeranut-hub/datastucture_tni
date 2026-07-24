
public class TodoList {

	public static void main(String[] args) {
		DoublyLinkedList todoList = new DoublyLinkedList();
		todoList.insert("Finish Homework");
		System.out.println(todoList.traversal());
		
		todoList.insert("Laundry");
		todoList.insert("Group Meeting");
		System.out.println(todoList.traversal());
		// Exercise no.2.1
		todoList.insert(0, "Submit Report");
		System.out.println(todoList.traversal());
		// Exercise no.2.2
		todoList.insert(2, "Buy Food");
		System.out.println(todoList.traversal());
		// Exercise no.2.3
		todoList.insert("Go to Gym");
		System.out.println(todoList.traversal());
		
		
	}

}
