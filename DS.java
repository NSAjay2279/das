import java.util.*;

public class DS {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        
        list.add(Arrays.asList(2, 3));
        System.out.println(list);
        
        list.add(1, 100);
        System.out.println(list);
        
        list.add(0, "Geeks");
        System.out.println(list);
        
        list.addAll(Arrays.asList(8, "Geeks", "Always"));
        System.out.println(list);
        
        list.remove((Object) 8);
        System.out.println(list);
        
        list.remove(Arrays.asList(2, 3));
        System.out.println(list);
        
        list.remove(list.size() - 1);
        System.out.println(list);
        
        list.remove(1);
        System.out.println(list);
    }
}