package interview1;

public class Test {
    public static void main(String[] args) {
        String[][] scores = {
                {"Manisha", "14"},
                {"Sachin", "12"},
                {"Ram", "16"},
                {"Sachin", "18"}
        };

        // Arrays to store unique names, total scores, and counts
        String[] names = new String[scores.length];
        int[] totalScores = new int[scores.length];
        int[] counts = new int[scores.length];
        int uniqueCount = 0;

        for (String[] scoreEntry : scores) {
            String name = scoreEntry[0];
            int score = Integer.parseInt(scoreEntry[1]);

            // Check if name exists in names array
            int index = findIndex(names, uniqueCount, name);

            if (index == -1) {
                // New name, add to the list
                names[uniqueCount] = name;
                totalScores[uniqueCount] = score;
                counts[uniqueCount] = 1;
                uniqueCount++;
            } else {
                // Existing name, update score and count
                totalScores[index] += score;
                counts[index]++;
            }
        }

        // Print average for each name
        System.out.println("Name-wise Average Calculation:");
        for (int i = 0; i < uniqueCount; i++) {
            double average = (double) totalScores[i] / counts[i];
            System.out.println("Name: " + names[i] + ", Average: " + String.format("%.2f", average));
        }
    }

    // Helper function to find the index of a name in the array
    private static int findIndex(String[] names, int size, String name) {
        for (int i = 0; i < size; i++) {
            if (names[i] != null && names[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
