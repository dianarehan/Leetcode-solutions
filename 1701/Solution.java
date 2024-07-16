class Solution {
    public double averageWaitingTime(int[][] customers) {
        int timeline =customers[0][0];
        double waitTime=0;
        for(int i=0;i<customers.length;i++){
            if (timeline < customers[i][0]) {
                timeline = customers[i][0];
            }


            timeline+= customers[i][1];
            waitTime+=(timeline-customers[i][0]);
        }
        return waitTime/customers.length;
    }
}
