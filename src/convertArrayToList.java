import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created on 24/Jan/2021 to Convert-Array-To-List
 */
public class convertArrayToList {


    static void convertArrayToListFunc(String[] matrix){

        //Method 1:
        //List<String> myList = Arrays.asList(matrix);


        //Method 2:
        //List<String> myList = new ArrayList<>();
        //for(String item: matrix){
        //    myList.add(item);
        //}

        //Method 3:
        //List<String> myList = new ArrayList<>();
        //Collections.addAll(myList, matrix);

        //Method 4
        List<String> myList =  Arrays.stream(matrix).collect(Collectors.toList());

        System.out.println("Our List: " + myList);
    }

    public static void main(String args[]){
        String[] matrix = {"Andreas", "Priftis", "Hello", "World"};
        convertArrayToListFunc(matrix);
    }
}
