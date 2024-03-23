// Right now I am adding single codes for each process scheduling algorithm, but after adding every single one, I will merge it into one for the choice of the user to what to do

#include<stdio.h>
int main(){
    int process, i, timeQuantum, tempOne;
    int count = 0, tempTwo = 0;
    int bustTime[5], waitingTime[5], turnAroundTime[5], remainingBustTime[5]; 
    float averageWaitingTime = 0, averageTurnAroundTime = 0;
    printf("Enter the number of process\n");
    scanf("%d", &process);
    printf("Enter the bust time of the processes\n");
    
    // Logic for calculating turn around time

    for(i = 0; i < process; i++){
        scanf("%d", &bustTime[i]);
        remainingBustTime[i] = bustTime[i];
    }
    printf("Enter the time quantum\n");
    scanf("%d", &timeQuantum);
    while (1)
    {
        for (i = 0, count = 0; i < process; i++)
        {
            tempOne = timeQuantum;
            if(remainingBustTime[i] == 0){
                count++;
                continue;
            }
            if(remainingBustTime[i] > timeQuantum){
                remainingBustTime[i] = remainingBustTime[i] - timeQuantum;
            } else{
                if (remainingBustTime >= 0)
                {
                    tempOne = remainingBustTime[i];
                    remainingBustTime[i] = 0;
                }
                tempTwo = tempTwo + tempOne;
                turnAroundTime[i] = tempTwo;
            }
        }
        if(process == count){
            break;
        }
    }
    printf("\nProcess\tBust Time\tTurn Around Time\tWaiting Time\n");

    // Logic for calculating waiting time

    for(i = 0; i < process; i++){
        waitingTime[i] = turnAroundTime[i] - bustTime[i];
        averageWaitingTime += waitingTime[i];
        averageTurnAroundTime += turnAroundTime[i];
        printf("\n%d\t%d\t%d\t%d", i+1, bustTime[i], turnAroundTime[i], waitingTime[i]);
    }
    averageWaitingTime = averageWaitingTime / process;
    averageTurnAroundTime = averageTurnAroundTime / process;
    printf("Average waiting time = %f\n", averageWaitingTime);
    printf("Average turnaround time = %f\n", averageTurnAroundTime);
    return 0;
}