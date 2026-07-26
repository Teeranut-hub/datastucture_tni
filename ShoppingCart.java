import java.util.LinkedList;

public class ShoppingCart {

	public static void main(String[] args) {
		LinkedList<String> cart = new LinkedList<String>();
		
		cart.add("Wireless Mouse");			//no.1
		cart.add("Mechanical Keyboard");	//no.2
		cart.add("USB_C Hub");				//no.3
		System.out.println(cart);       	//no.4
		
		cart.add(1, "Mouse Pad");			//no.5
		System.out.println(cart);			//no.6
		
		cart.removeLast();					//no.7
		System.out.println(cart);			//no.8
		
		cart.remove("Mouse Pad");			//no.9
		System.out.println(cart);			//no.10
		
		cart.add("Monitor");				//no.11
		System.out.println(cart);			//no.12
		
		cart.set(2, "Phone Holder");		//no.13
		System.out.println(cart); 			//no.14
		
		System.out.println(cart.getLast());		//no.15
	}

}
