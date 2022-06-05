class Main{
  public static void main(String[] args){
    LL_insert_at_first ll = new LL_insert_at_first();
    LL_insert_at_first.Node ln = ll.new Node(23);
    ln.addFirst(154);
    ln.addFirst(23);
    ln.addFirst(45);
    ln.addFirst(54);
    ln.addFirst(74);

    System.out.println("");
    
    ln.display();
    
    System.out.println("");
  }
}