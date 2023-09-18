import java.util.*;

public class SJF 
{   void execute(ArrayList<ProcessDetails> arl)
    {   Sorting s = new Sorting();
        Print p = new Print();
        ArrayList<ProcessDetails> temp = new ArrayList<>();
        arl = s.sortBT(arl);
        int i = 0;
        int sT = 0; // system time
        int cT,tAT,wT;
        do
        {   if(sT >= arl.get(i).getArrivalTime())
            {   sT = sT + arl.get(i).getBurstTime();
                cT = sT;
                arl.get(i).setCompletionTime(cT);
                tAT = arl.get(i).getCompletionTime() - arl.get(i).getArrivalTime();
                arl.get(i).setTurnAroundTime(tAT);
                wT = arl.get(i).getTurnAroundTime() - arl.get(i).getBurstTime();
                arl.get(i).setWaitingTime(wT);
                temp.add(arl.get(i));
                arl.remove(i);
                i = 0;
            }
            else if( i < arl.size()-1)
            { i++;  } 
            else
            {   sT++;
                i = 0;
            }  
        } while(!arl.isEmpty() );
        temp = s.sortByID(temp);
        System.out.println("\t\t\t Shortest Job First(SJF)");
        p.printCompleteTable(temp);
        System.out.println("\n\n");
    }
}