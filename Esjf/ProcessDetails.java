import java.util.*;

public class ProcessDetails
{   private int processID;
    private int  arrivalTime;
    private int  burstTime;
    private int  completionTime;
    private int  turnAroundTime;
    private int  waitingTime;

    int getProcessID()//Getter
    {   return processID;   }

    void  setProcessID(int pId)//Setter 
    {   this.processID = pId;   }

    int  getArrivalTime()
    {   return arrivalTime; }

    void setArrivalTime(int  aT) 
    {   this.arrivalTime = aT;   }

    int  getBurstTime() 
    {   return burstTime;   }

    void setBurstTime(int  bT) 
    {   this.burstTime = bT;   }

    int  getCompletionTime() 
    {   return completionTime;   }

    void setCompletionTime(int  cT) 
    {   this.completionTime = cT;    }

    int  getTurnAroundTime() 
    {   return turnAroundTime;  }

    void setTurnAroundTime(int  tT) 
    {   this.turnAroundTime = tT ;}

    int  getWaitingTime() 
    {   return waitingTime;  }

    void setWaitingTime(int  wT) 
    {   this.waitingTime = wT ;} 
}
