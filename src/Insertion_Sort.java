import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Insertion_Sort {

    public static void main(String[] args) {
        int[] numbers = {1, 7, 3, 2, 8, 9, 6, 4, 5, 0};
        ArrayList<Integer> list = new ArrayList<>();
        for(int elements : numbers){
            list.add(elements);
        }
        list = insert_sort(list);
        System.out.println(list.toString());
    }
    public static ArrayList<Integer> insert_sort(ArrayList<Integer> list){
        int count = 0;
        int[] temp_array = new int[list.size()];
        while(count < temp_array.length){
            int dex = get_smallest(list);
            temp_array[count] = list.get(dex);
            list.remove(dex);
            count++;
        }
        for(int dex = 0; dex < temp_array.length; dex++){
            list.add(temp_array[dex]);
        }
        return list;
    }
    public static int get_smallest(ArrayList<Integer> tempList){
        int smallest_num = tempList.get(0);
        int index = 0;
        for (int dex = 0; dex < tempList.size(); dex++){
            if(smallest_num > tempList.get(dex)){
                smallest_num = tempList.get(dex);
                index = dex;
            }
        }
        return index;
    }
}
