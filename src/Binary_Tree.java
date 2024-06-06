import java.util.LinkedList;

public class Binary_Tree {

    public int data = -1;
    public Binary_Tree parent;
    public Binary_Tree left_child;
    public Binary_Tree right_child;
    public Binary_Tree root;

    public static void main(String[] args) {
        Binary_Tree tree = new Binary_Tree();
        int[] input = {2,4,5,8,6,3,9,0,1,7};
        for(int num : input){
            tree.insert(num);
        }
        tree.print_tree(tree.root);
    }

    public Binary_Tree(int element){
        this.data = element;
        this.parent = null;
        this.right_child = null;
        this.left_child = null;
    }
    public Binary_Tree(){
        this.data = 0;
        this.parent = null;
        this.right_child = null;
        this.left_child = null;
    }
    public void insert(int data){
        Binary_Tree node = new Binary_Tree(data);
        if(root == null){
            root = node;
            return;
        }
        Binary_Tree parent_node = Binary_tree_search(data , root);
        if(parent_node != null){
            if (data < parent_node.data)
                parent_node.left_child = node;
            else if(data > parent_node.data)
                parent_node.right_child = node;
        }
    }
    public void print_tree(Binary_Tree node){
        if (node == null)
            return;

        print_tree(node.left_child);
        System.out.println(node.data);
        print_tree(node.right_child);
    }
    public Binary_Tree Binary_tree_search( int data, Binary_Tree root){
        LinkedList<Binary_Tree> temp_list = new LinkedList<>();
        temp_list.add(root);
        while(!temp_list.isEmpty()){
            Binary_Tree current = temp_list.remove();
            if (data < current.data){
                if(current.left_child == null)
                    return current;
                else
                    temp_list.add(current.left_child);

            }
            else if(data > current.data){
                if(current.right_child == null)
                    return current;
                else
                    temp_list.add(current.right_child);
            }
        }
        return null;
    }
}
