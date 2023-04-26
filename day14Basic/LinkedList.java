package day14Basic;

 class LinkedList<T> {

	/*
	 * Ability to create Linked List by appending 30 and 70 to 56 - Node with data
	 * 56 is First Created - Next Append 30 to 56 - Finally Append 70 to 30 -
	 * LinkedList Sequence: 56->30->70 pop means head position remove\
	 * 
	 */

	Node<T> head;
	Node<T> tail;

	public void add(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
//			tail.next = newNode;
//			tail = tail.next;
			
			newNode.next=head;
			head=newNode;
		}
	}

	public void push(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;

		}
	}

	public void append(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void insert(T insertData, T searchData) {
		Node<T> newNode = new Node<T>(insertData);
		Node<T> serchNode = new Node<T>(searchData);
		Node<T> temp = serchNode.next;
		newNode.next = temp;
	}

	public T pop() {
		T popData = head.data;
		head = head.next;
		return popData;
	}

	public T popLast() {
		T data = tail.data;
		Node<T> temp = head;
		while (temp.next != tail) {
			temp = temp.next;
		}

		temp.next = null;
		tail = temp;
		return data;
	}

	public Node<T> search(T data) {
		Node<T> temp = head;
		 
		while (temp != null) {
			if (temp.data.equals(data)) {
				return temp;
			}
			temp = temp.next;
		}
		return null;

	}

	public boolean insertAfter(T insertData, T searchData) {
		Node<T> newNode = new Node<>(insertData);
		Node<T> serchedData = search(searchData); // error is Type mismatch: cannot convert from void to Node<T>

		if (serchedData != null) {
			Node<T> temp = serchedData.next;
			serchedData.next = newNode;
			newNode.next = temp;
			return true;
		}
		return false;

	}

	public void display() {

		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}
}
