import java.util.ArrayList;

public class Selection_Sort {

    static int[] input = {2,4,5,8,6,3,9,0,1,7};

    public static void main(String[] args) {
        input = select_sort(input);
        for (int dex = 0; dex < input.length; dex++){
            System.out.println(input[dex]);
        }
    }

    public static int[] select_sort(int[] list){
        int[] temp_list = new int[list.length];
        for(int dex = 0; dex < list.length; dex++){
            temp_list[dex] = list[dex];
        }
        int counter = 0;
        while(counter < temp_list.length){
            int less_than = 0;
            for (int dex = 0; dex < temp_list.length; dex++){
                if(temp_list[counter] > temp_list[dex])
                    less_than++;
            }
            list[less_than] = temp_list[counter];
            counter++;
        }
        return list;
    }
}
