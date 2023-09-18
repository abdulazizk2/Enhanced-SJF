import java.util.*;

public class Sorting
{   Print p = new Print();

    ArrayList<ProcessDetails> sortBT(ArrayList<ProcessDetails> arl)
    {   int i = 0;
        ProcessDetails Temp = new ProcessDetails();  
        boolean NoMoreSwaps;
        do
        {   // Flag to check if swapping occurs
            NoMoreSwaps = true;
            for ( i = 0; i < arl.size()-1; i++)
            {   if( arl.get(i).getBurstTime() > arl.get(i+1).getBurstTime() )
                {   // swapping occurs if elements are not in ascending order
                    Temp = arl.get(i);
                    arl.set(i,arl.get(i+1));
                    arl.set(i+1,Temp);
                    NoMoreSwaps = false;
                }
                else if(arl.get(i).getBurstTime() == arl.get(i+1).getBurstTime())
                {   if (arl.get(i).getArrivalTime() > arl.get(i+1).getArrivalTime())
                    {   Temp = arl.get(i);
                        arl.set(i,arl.get(i+1));
                        arl.set(i+1,Temp);
                        NoMoreSwaps = false;
                    }
                }
                else if(arl.get(i).getBurstTime() == arl.get(i+1).getBurstTime())
                {   if (arl.get(i).getArrivalTime() == arl.get(i+1).getArrivalTime())
                    {   if (arl.get(i).getProcessID() > arl.get(i+1).getProcessID())
                        {   Temp = arl.get(i);
                            arl.set(i,arl.get(i+1));
                            arl.set(i+1,Temp);
                            NoMoreSwaps = false;
                        }
                    }
                }
            } 
        } while (NoMoreSwaps == false);
        return arl;
    }

    ArrayList<ProcessDetails> sortAT(ArrayList<ProcessDetails> arl)
    {   int i = 0;
        ProcessDetails Temp = new ProcessDetails();  
        boolean NoMoreSwaps;
        do
        {   // Flag to check if swapping occurs
            NoMoreSwaps = true;
            for ( i = 0; i < arl.size()-1; i++)
            {   if (arl.get(i).getArrivalTime() > arl.get(i+1).getArrivalTime())
                {   Temp = arl.get(i);
                    arl.set(i,arl.get(i+1));
                    arl.set(i+1,Temp);
                    NoMoreSwaps = false;
                }
                else if (arl.get(i).getArrivalTime() == arl.get(i+1).getArrivalTime())
                {   if (arl.get(i).getProcessID() > arl.get(i+1).getProcessID())
                    {   Temp = arl.get(i);
                        arl.set(i,arl.get(i+1));
                        arl.set(i+1,Temp);
                        NoMoreSwaps = false;
                    }
                }
            } 
        } while (NoMoreSwaps == false);
        return arl;
    }

    ArrayList<ProcessDetails> sortByID(ArrayList<ProcessDetails> arl)
    {   int i = 0;
        ProcessDetails Temp = new ProcessDetails();  
        boolean NoMoreSwaps;
        do
        {   // Flag to check if swapping occurs
            NoMoreSwaps = true;
            for ( i = 0; i < arl.size()-1; i++)
            {   if( arl.get(i).getProcessID() > arl.get(i+1).getProcessID() )
                {   // swapping occurs if elements are not in ascending order
                    Temp = arl.get(i);
                    arl.set(i,arl.get(i+1));
                    arl.set(i+1,Temp);
                    NoMoreSwaps = false;
                }
            }
        } while (NoMoreSwaps == false);
        return arl;
    }
}
