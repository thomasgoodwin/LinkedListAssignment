public class Test {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        int size = 5;
        for (int i = 0; i < size; i++) {
            Node newNode = new Node(String.valueOf(i), null);
            myList.push_back(newNode);
            myList.print();
        }
        myList.pop_back();
        myList.print();
        myList.pop_front();
        myList.print();
    }
}