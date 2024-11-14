package stack;

import java.util.LinkedList;
import java.util.Queue;


public class Stackusing1queue {

class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    void push(int a)
    {
	    
      q2.add(a);
        
      int sz = q2.size()-1;
      while(sz>0)
      {
        q1.add(q2.poll());
        sz--;
      }
        
      Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    
    int pop()
    {
	    
	   if (q1.isEmpty())
            return -1;
            
        return q1.remove();
    }
	
}


}
