class LL_insert_at_first{
  Node head;
  class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  // Add at begining

  void addFirst(int data){
    Node newNode = new Node(data);

    if(newNode != null){
      head = newNode;
    }
    newNode.next = head;
    head = newNode;
  }
  void display(){
    Node temp = head;
    while(temp != null){
    System.out.print(temp.data + " --> ");
   temp = temp.next;
    }
    System.out.println("Null");
  }
}