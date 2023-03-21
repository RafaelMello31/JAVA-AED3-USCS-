package uscs;

public class DList {
	public int size;
	public DListNode head;
	public DListNode tail;
	
	public DList() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}
	
	public DList(int item) {
		DListNode trab = new DListNode(item);
		trab.next = null;
		trab.prev = null;
		this.head = trab;
		this.tail = trab;
		this.size = 1;
	
	}
	
	public void imprime_First() {
		
		if(this.head == null)
			System.out.println("Lista vazia...");
		else
			System.out.println("Primeiro item: " + this.head.item);
	}
	
	public void imprime_Last() {
		if(this.head == null)
			System.out.println("Lista vazia...");
		else 
			System.out.println("Ultimo item: " + this.tail.item);
	}
	
	public void insere_Fim(int item) {
		
		DListNode novoNode = new DListNode(item);
		
		if(this.size == 0) {
			this.head = novoNode;
			this.tail = novoNode;
			this.size++;
		}
		else {
			this.tail.next = novoNode;
			novoNode.prev = this.tail;
			this.tail = novoNode;
			this.size++;
		}
	}
	
	public void insere_Inicio(int item) {
		
		DListNode novoNode = new DListNode(item);
		
		if(this.size == 0) {
			this.head = novoNode;
			this.tail = novoNode;
			this.size++;
		}
		else {
			this.head.prev = novoNode;
			novoNode.next = this.head;
			this.head = novoNode;
			this.size++;
		}
	}
	
	public void imprime_Lista() {
		
		int contador = 0;
		
		DListNode p;
		
		p = this.head;
		
		if(this.size == 0)
			System.out.println("Lista vazia...");
		else {
			while(p!=null) {
				System.out.print("\nNó: " + ++contador);
				System.out.print("Item: " + p.item + "\n");
				p = p.next;
			}
		}
	}
	
	//public void imprime_Lista2() {
	
	public void delete_First() {
		
		if(this.size == 0)
			System.out.println("Deleção inválido. Lista vazia...");
		else {
			if(this.size == 1) {
				this.head = null;
				this.tail = null;
				this.size = 0;
			} 
			else {
				this.head = this.head.next;
				this.head.prev = null;
				this.size--;
			}
		}
	}
		
	public void delete_Last() {
		
		if(this.size == 0)
			System.out.println("Deleção inválida, lista vazia...");
		else {
			if(this.size == 1) {
				this.head = null;
				this.tail = null;
				this.size = 0;
			}
			else {
				this.tail = this.tail.prev;
				this.tail.next = null;
				this.size--;
			}
		}
		
	}

}

