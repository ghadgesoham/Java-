//ArrayList is nothing but a list if want to work with index use List class and want to add and fetch data use Collection class..


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;  
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        
        //Use of Collection
        Collection<Integer> nums = new ArrayList<Integer>();      //Collection interface using array list <data type(you want to use)>  -----> generics 
        nums.add(10);
        nums.add(12);
        nums.add(13);
        nums.add(14);

        System.out.println(nums);

        for(int n : nums){
            
            int num = (Integer)n;
            System.out.println(num*2);
        }


        //Use of list 
        List<Integer> num1 = new ArrayList<Integer>();

        num1.add(12);
        num1.add(20);
        num1.add(16);
        num1.add(18);

        System.out.println(num1.get(1));  //gets element at that index
        System.out.println(num1.indexOf(18)); //get index of element
        
        //Use of Set
        
        Set<Integer> a = new HashSet<Integer>(); //just creats an collection
        a.add(5);
        a.add(14);
        a.add(16);
        a.add(1);;

        System.out.println(a);
        
        //Use of treeSet 

        Set<Integer> b = new TreeSet<Integer>(); //Sorts the set
        b.add(5);
        b.add(14);
        b.add(16);
        b.add(1);;

        System.out.println(b);

        //Use of iterator 

        Iterator<Integer> values = b.iterator();
        
        while (values.hasNext()){ //tells that do we have nect element 
            System.out.println(values.next()); //prints the next value
        }
    
    }
}