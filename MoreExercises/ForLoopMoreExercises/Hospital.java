package ForLoopMoreExercises;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());

        int doctors = 7;
        int treatedPatients = 0;
        int unTreatedPatients = 0;

        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0 && unTreatedPatients > treatedPatients) {
                doctors++;
                }
            if (patients > doctors) {
                unTreatedPatients += patients - doctors;
                treatedPatients += doctors;
            } else {
                treatedPatients += patients;
            }
        }
        System.out.println("Treated patients: " + treatedPatients + ".");
        System.out.println("Untreated patients: "+ unTreatedPatients + ".");
    }
}
