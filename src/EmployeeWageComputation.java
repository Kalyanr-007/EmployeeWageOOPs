
    import java.util.Random;

    public class EmployeeWageComputation {
        public static void main(String[] args) {
            System.out.println("Welcome to Employee Wage Computation Program");

            // Constants
            int WAGE_PER_HOUR = 20;
            int FULL_DAY_HOURS = 8;

            // Generate random attendance status
            Random random = new Random();
            boolean isPresent = random.nextBoolean();

            if (isPresent) {
                System.out.println("Employee is Present");

                // Calculate daily wage
                int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
                System.out.println("Daily Wage: " + dailyWage);
            } else {
                System.out.println("Employee is Absent");
            }
        }
    }

