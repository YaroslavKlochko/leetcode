public class DroneFlightPlanner {

    static int calcDroneMinEnergy(int[][] route) {
        // your code goes here
        int startZ = route[0][2];
        int maxSoFar = route[0][2];

        for(int i = 1; i < route.length; i++) {
            int currentZ = route[i][2];
            if(currentZ > maxSoFar) {
                maxSoFar = currentZ;
            }
        }
        return maxSoFar - startZ;
    }
}
