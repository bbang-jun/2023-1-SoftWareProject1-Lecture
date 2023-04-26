public class Node {
    private Object data = null;
    private Node next = null;

    public Node(Object input){
        this.data = input;
        this.next = null;
    }

    public void setData(Object input){
        this.data = input;
    }

    public String getData(){
        return String.valueOf(this.data);
    }

    public void setNext(Node A){
        this.next = A;
    }

    public Node getNext(){
        if(this.next == null)
            return null;
        else
            return this.next;
    }
}
