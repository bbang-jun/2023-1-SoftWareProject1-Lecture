public class LL_implement {
    public static void main(String[] args) {
        my_LL numbers = new my_LL();

        numbers.push_front(10);
        numbers.push_back(15);
        numbers.push_front(23);
        numbers.push_back(45);

        System.out.println(numbers.size());
        numbers.printList();
        System.out.println("====================");

        Node forSearch = (Node)numbers.search(2);
        System.out.println(forSearch.getData());
        System.out.println("====================");

        Node forRemove = (Node)numbers.pop(3);
        System.out.println(forRemove.getData());
        System.out.println("====================");

        numbers.printList();
        System.out.println(numbers.size());
    }
}
