import java.util.*;

public class Print 
{   void printTable(ArrayList<ProcessDetails> arl)
    {   int i;
        System.out.print("Process_ID\tArrival_Time\tBurst_Time\n");
        for ( i = 0; i < arl.size(); i++)
        {   System.out.print("    "+arl.get(i).getProcessID()+"\t\t     "+arl.get(i).getArrivalTime()+"\t\t     "+
                                arl.get(i).getBurstTime()+"\n"
                            );
        }
        System.out.println("\n\n");
        return;
    }
   
    void printCompleteTable(ArrayList<ProcessDetails> arl)
    {   int i;
        float totalWT = 0;
        float totalTAT = 0;
        for ( i = 0; i < arl.size(); i++)
        {   totalTAT += arl.get(i).getTurnAroundTime();
            totalWT += arl.get(i).getWaitingTime();
        }
        float avgWT = totalWT/arl.size();
        float avgTAT = totalTAT/arl.size();
        System.out.print("Process_ID\tArrival_Time\tBurst_Time\tCompletion_Time \tTurnAround_Time \tWaiting_Time\n");
        for ( i = 0; i < arl.size(); i++)
        {   System.out.print("    "+arl.get(i).getProcessID()+"\t\t    "+
                                    arl.get(i).getArrivalTime()+"\t\t    "+
                                    arl.get(i).getBurstTime()+"\t\t   "+
                                    arl.get(i).getCompletionTime()+"\t\t      "+"\t  "+
                                    arl.get(i).getTurnAroundTime()+"\t\t     "+"\t  "+
                                    arl.get(i).getWaitingTime()+"\n"
                            );
        }
        System.out.println("average Turn_Around_Time = " + avgTAT + "ms");
        System.out.println("average Waiting_Time = " + avgWT + "ms"+"\n\n");
        return;
    }
}