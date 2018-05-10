public class LinkedListAppend {
    class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        Node(int value) {
            this.value = value;
        }

        Node() {
        }
    }

    /*
  Insert Node at the end of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
    Node Insert(Node head, int data) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        Node curr = head;
        Node result = new Node();
        result.value = data;
        if (curr == null) {
            return result;
        } else {
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = result;
        }
        return head;
    }
}
