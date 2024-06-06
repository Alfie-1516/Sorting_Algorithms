import java.lang.reflect.Array;
import java.util.Arrays;

public class Quick_sort {
    public static void main(String[] args) {
        int[] numbers = {1, 21, 3, 28, 15, 9, 6, 19, 5, 50};
        System.out.println(Arrays.toString(numbers));
        quick_sort(numbers,0, 9);
        System.out.println(Arrays.toString(numbers));

    }
    public static void quick_sort(int[] list_number, int first_element,int last_element){
        if (first_element<last_element) {
            int pivot = partition(list_number, first_element, last_element);
            quick_sort(list_number, first_element, pivot);
            quick_sort(list_number, pivot+1, last_element);
        }

    }
    public static int partition(int[] list_number, int first_element,int last_element){
        int checker = first_element-1;
        int counter = first_element;
        int pivot_index = find_pivot(list_number, first_element, last_element);

        if (pivot_index != last_element){
            swap(pivot_index, last_element, list_number);
        }
        while(counter < last_element){
            if (list_number[counter] < list_number[last_element]){
                checker++;
                swap(counter, checker, list_number);
            }
            counter++;
        }
        swap(checker+1, last_element, list_number);
        return checker+1;
    }
    public static int[] swap(int index_1, int index_2, int[]numbers){
        int temp_num = numbers[index_1];
        numbers[index_1] = numbers[index_2];
        numbers[index_2] = temp_num;
        return numbers;
    }
    public static int find_pivot(int[] temp_numbers, int first_number, int last_number){
        int sum = 0;
        int counter = first_number;
        while(counter <= last_number){
            sum += temp_numbers[counter];
            counter++;
        }
        int higher_mean = sum/counter;
        int lower_mean = sum/counter;
        while(true){
            for (int dex = first_number; dex <=last_number; dex++){
                if (higher_mean == temp_numbers[dex] || lower_mean == temp_numbers[dex]){
                    return dex;
                }
            }
            higher_mean++;
            lower_mean--;
        }
    }
}
