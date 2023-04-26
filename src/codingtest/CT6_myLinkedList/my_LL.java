public class my_LL {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public void push_front(Object input){
        Node newNode = new Node(input);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    public void push_back(Object input){
        Node newNode = new Node(input);

        if(tail == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public void printList() {
        if (size == 0) {
            System.out.println("Empty List");
        }
        else {
            Node temp = head;
            String str = "";
            while ((temp.getNext()) != null) {
                str += temp.getData() + ", ";
                temp = temp.getNext();
            }
            str += temp.getData();
            System.out.println(str);
        }
    }

    public Object search(int idx){
        Node toSearch = head;
        if(idx >= size){
            System.out.println("Index out of Range");
            return null;
        }

        for(int i = 0; i < idx ; i++){
            toSearch = toSearch.getNext();
        }
        return toSearch;
    }

    public Object pop(int k){
        Node temp = head;
        if(k == 0){
            this.head = temp.getNext();
            temp.setNext(null);
            size--;
            return temp;
        }
        else if(k >= size){
            System.out.println("Index out of Range");
            return null;
        }
        else{
            temp = (Node)search(k-1);
            Node toRemove = temp.getNext();

            temp.setNext(toRemove.getNext());

            if(toRemove == tail)
                this.tail = temp;

            toRemove.setNext(null);
            size--;

            return toRemove;
        }
    }

    public int size(){
        return this.size;
    }
}
