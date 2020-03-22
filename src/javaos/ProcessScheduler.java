
package javaos;

import java.util.ArrayList;

public class ProcessScheduler {

//    int [] processes = new int[5];
    public static ArrayList <Integer>processes = new ArrayList(5);
    public static void main(String[] args) {
        
    }
    
    public static boolean priorityCheck(int priority)
    {
        if(!processes.isEmpty())
        {
            for(int i=0;i<processes.size();i++)
            {
                if(priority > processes.get(i))
                {
                    processes.remove(i);
                    processes.add(priority);
                    return true;
                }
            }
            return false;
        }
        else{
            
            processes.add(priority);
            return true;
            }
    }
}
