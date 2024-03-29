#include <stdio.h>

int main() {
    int n, i, quantum;
    printf("Enter the number of processes: ");
    scanf("%d", &n);

    int burst_time[n], remaining_time[n], waiting_time[n], turnaround_time[n];

    printf("Enter the burst times for each process:\n");
    for (i = 0; i < n; i++) {
        printf("Burst time for process %d: ", i + 1);
        scanf("%d", &burst_time[i]);
        remaining_time[i] = burst_time[i];
    }

    printf("Enter the time quantum: ");
    scanf("%d", &quantum);

    int time = 0; // Current time
    while (1) {
        int done = 1; // Flag to indicate if all processes are done

        for (i = 0; i < n; i++) {
            if (remaining_time[i] > 0) {
                done = 0; // There are still remaining processes

                if (remaining_time[i] > quantum) {
                    time += quantum;
                    remaining_time[i] -= quantum;
                } else {
                    time += remaining_time[i];
                    waiting_time[i] = time - burst_time[i];
                    remaining_time[i] = 0;
                }
            }
        }

        if (done == 1) // If all processes are done, break out of the loop
            break;
    }

    // Calculate turnaround time
    for (i = 0; i < n; i++) {
        turnaround_time[i] = burst_time[i] + waiting_time[i];
    }

    // Display results
    printf("\nProcess\tBurst Time\tWaiting Time\tTurnaround Time\n");
    for (i = 0; i < n; i++) {
        printf("%d\t%d\t\t%d\t\t%d\n", i + 1, burst_time[i], waiting_time[i], turnaround_time[i]);
    }

    // Calculate average waiting time
    float avg_waiting_time = 0;
    for (i = 0; i < n; i++) {
        avg_waiting_time += waiting_time[i];
    }
    avg_waiting_time /= n;

    // Calculate average turnaround time
    float avg_turnaround_time = 0;
    for (i = 0; i < n; i++) {
        avg_turnaround_time += turnaround_time[i];
    }
    avg_turnaround_time /= n;

    printf("\nAverage Waiting Time: %.2f\n", avg_waiting_time);
    printf("Average Turnaround Time: %.2f\n", avg_turnaround_time);

    return 0;
}