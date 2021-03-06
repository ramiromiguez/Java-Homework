package gym.data;

public class GenericLinkedList<D> {
	Node<D> head;

	// function to add an element to the list at the end if there are element
	// already and at the start if no elements are there
	public void insert(D data) {
		Node<D> newNode = new Node<D>(data);
		if (head == null) {
			head = newNode;
		} else {
			Node<D> n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = newNode;
		}
	}

	// function to add an element at the start of the list
	public void insertAtStart(D data) {
		Node<D> newNode = new Node<D>(data);

		newNode.next = head;
		head = newNode;
	}

	// function to add an element at a given index
	public void insertAt(int index, D data) {
		if (index == 0) {
			insertAtStart(data); // We already have a function to do this.
		} else {
			Node<D> newNode = new Node<D>(data);

			Node<D> currentNode = head;
			for (int i = 0; i < index - 1; i++) {
				currentNode = currentNode.next;
			}
			newNode.next = currentNode.next;
			currentNode.next = newNode;
		}
	}

	// function to delete an element at the given index
	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node<D> currentNode = head;
			for (int i = 0; i < index - 1; i++) {
				currentNode = currentNode.next;
			}
		}
	}

	// function to show the list
	public void show() {
		Node<D> currentNode = head;
		if (currentNode == null) {
			System.out.println("Linked list is empty");
		} else {
			while (currentNode != null) {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			}
		}
	}
}
