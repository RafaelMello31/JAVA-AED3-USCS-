package Uscs;

public class SList {
	
	int size;
	Node head;
	
	public SList(int x) {
	
	Node y = new Node(x);
		
	this.size = 1;
	this.head = y;
}
	
	public static void main (String[]args) {
		SList x = new SList(10);
		int cont = 1;
		
		Node p = x.head;
		
		while(cont <= x.size ) {
			System.out.println(" " + p.item;)
			p = p.next;
			cont++;
			
		}
	}
}
