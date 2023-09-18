import java.util.*;

public class Main
{   public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
        Print p = new Print();
        FCFS fcfs = new FCFS();
        SJF sjf = new SJF();
        ESJF esjf = new ESJF();
        ArrayList<ProcessDetails> q1 = new ArrayList<>();
        ArrayList<ProcessDetails> q2 = new ArrayList<>();
        ArrayList<ProcessDetails> q3 = new ArrayList<>();
        int n;
        do
        {   System.out.print("\nEnter number of processes: ");
            n = sc.nextInt();
            if (n < 0)
            {   System.out.println("Please enter a positive number !!");    }
        } while(n < 0);
        if(n > 0)
        {   for(int i = 0; i < n; i++)  
            {   ProcessDetails pD = new ProcessDetails(); 
                pD.setProcessID(i+1);
                System.out.print("\nEnter arrival time of process "+(pD.getProcessID())+": ");
                pD.setArrivalTime(sc.nextInt() );
                System.out.print("Enter burst time of process "+(pD.getProcessID())+": ");
                pD.setBurstTime(sc.nextInt() );
                q1.add(i,pD);
            }
            System.out.println("\n");
            q2 = (ArrayList<ProcessDetails>) q1.clone();
            q3 = (ArrayList<ProcessDetails>) q1.clone();
            p.printTable(q1);
            fcfs.execute(q1);
            sjf.execute(q2);
            esjf.execute(q3);
        }
        else
        { System.out.println("No process found");   }
        System.out.println("Exiting....");
        sc.close();
        System.exit(0);
    }
}