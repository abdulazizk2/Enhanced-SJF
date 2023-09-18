import java.util.*;

public class ESJF 
{   void execute(ArrayList<ProcessDetails> arl)
    {   Sorting s = new Sorting();
        Print p = new Print();
        ArrayList<ProcessDetails> temp = new ArrayList<>();
        arl = s.sortBT(arl);
        int VarShortJob = 0;//8+6+6+8
        int VarLargeJob = 0;//28
        int i = 0;//Loop index
        int sT = 0; // system time
        int cT,tAT,wT,n;
        int f = 0;  // first process flag
        do
        {   n = arl.size() - 1;
            if((sT >= arl.get(n).getArrivalTime()) && (f > 0))
            {   if(VarShortJob >= VarLargeJob)
                {   i = n;  }
            }
            if(sT >= arl.get(i).getArrivalTime())//Elemenating starving
            {   sT += arl.get(i).getBurstTime();
                cT = sT;
                arl.get(i).setCompletionTime(cT);
                tAT = arl.get(i).getCompletionTime() - arl.get(i).getArrivalTime();
                arl.get(i).setTurnAroundTime(tAT);
                wT = arl.get(i).getTurnAroundTime() - arl.get(i).getBurstTime();
                arl.get(i).setWaitingTime(wT);
                temp.add(arl.get(i));
                if(f == 0)
                {   f = 1;
                    VarShortJob = arl.get(i).getBurstTime();
                    VarLargeJob = arl.get(n).getBurstTime();
                    arl.remove(i);
                    n = arl.size() - 1;
                    if(VarShortJob >= VarLargeJob)
                    {   i = n; }
                    else
                    {   i = 0; }
                }
                else if( i == n)
                {   if(n < 1)
                    {   VarShortJob = 0;
                        VarLargeJob = 0;
                        arl.remove(i);
                    }
                    else if (n >= 1)
                    {   VarShortJob = 0;
                        arl.remove(n);
                        n = arl.size() - 1;
                        VarLargeJob = arl.get(n).getBurstTime();
                        
                    }
                    i = 0;
                }
                else
                {   VarShortJob += arl.get(i).getBurstTime();
                    VarLargeJob = arl.get(n).getBurstTime();
                    arl.remove(i);
                    
                }
            }
            else if( i < n)
            {   i++;    } 
            else
            {   sT++;
                i = 0;
            }  
        }while(!arl.isEmpty() );
        temp = s.sortByID(temp);
        System.out.println("\t\t\t Enhacned Shortest Job First");
        p.printCompleteTable(temp);
        System.out.println("\n\n");
    }
} 