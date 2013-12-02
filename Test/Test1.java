package JavaHomeWork;

import java.util.List;
import java.util.ArrayList;

public class Test1 {
    
	static List <Long> list = new ArrayList <Long>();
    public List<Long> scan(long begin,long end) {
        int div = 0;
       lable: for(long i = begin ; i <= end; i++) {                                                                               
            for(long j=1 ; j<=i; j++) { 
                if (i % j==0) 
                div++;
                if(div>2) {
                	div = 0;
                	continue lable;
                }
            }
            if(div == 2){
            	 System.out.println(i+" ");
            	 //list.add((long) i); 
            }
            div = 0;
         } 
        return list;
    }    
    public void showArray(List<Long> list){
    	for (Long li : list){
    		System.out.println(li);
    	}
    	
    }
 
    public static void main(String[] args) {
    	long start, finish;
    	start = System.currentTimeMillis();
    	Test1 t = new Test1();
    	t.scan(1, 1000);
    	finish = System.currentTimeMillis();
    	//t.showArray(list);
    	System.out.println("Time = " + (finish - start));
    	
    }
}