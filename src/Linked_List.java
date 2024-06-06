import org.w3c.dom.Node;

public class Linked_List {
    LL_Node head;
    public Linked_List(){
        head = new LL_Node(0);
    }

    public void insert(int element){
        LL_Node new_node = new LL_Node(element);
        if (this.head.next == null){
            this.head.next = new_node;
        }
        else{
            LL_Node curr_node = find_index(this.get_size()-1);
            if (curr_node != null)
                curr_node.next = new_node;
        }
    }
    public void swap(int first_index, int second_index){
        LL_Node first_node = find_index(first_index);
        LL_Node second_node = find_index(second_index);
        if(second_node != null && first_node != null){
            int temp_element = second_node.element;
            second_node.element = first_node.element;
            first_node.element = temp_element;
        }

    }
    public int get_size(){
        int counter = 1;
        LL_Node temp_node = this.head.next;
        while (temp_node.next != null){
            counter ++;
            temp_node = temp_node.next;
        }
        return counter;
    }
    public void print_list(){
        LL_Node current = this.head.next;
        while(current.next != null){
            System.out.println(current.element);
            current = current.next;
        }
        System.out.println(current.element);

    }
    private LL_Node find_index( int index){
        if (this.head.next != null && index <= this.get_size()){
            LL_Node current_node = this.head.next;
            int counter = 0;
            while(counter != index){
                counter++;
                current_node = current_node.next;
            }
            return current_node;
        }
        return null;
    }
    public int get_index(int index){
        LL_Node index_element = find_index(index);
        assert index_element != null;
        return index_element.element;
    }
}
class  LL_Node{
    int element;
    LL_Node next;
    public LL_Node(int element){
        this.element = element;
        this.next = null;
    }

}
