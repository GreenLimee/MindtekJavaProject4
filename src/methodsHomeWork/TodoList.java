package methodsHomeWork;

import java.util.Arrays;

public class TodoList {
    public static void main(String[] args) {
        String[] arr = new String[]{"Morning Exercise", "Drink water", "Meditate", "Read"};
        System.out.println(Arrays.toString(arr));
        TodoList obj = new TodoList();
        String res = obj.createTodoList(arr);
        System.out.println(res.substring(0,res.length()-2));
    }

    public String createTodoList(String[] text) {

        String result = "Your today's to do list: ";
        int count=1;
        for (int i=0; i<text.length; i++){
            result = result + count +" " + (text[i]+", ");
            count++;
        }

        return result;
    }
}