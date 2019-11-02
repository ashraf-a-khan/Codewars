static int length(Node head) {
    int count = 0;
    Node current = head;
    while(current != null){
      current = current.next;
      count++;
    }
    return count;
  }