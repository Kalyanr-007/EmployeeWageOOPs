
    public class Employee {
        private int wagePerHour;
        private int fullDayHours;
        private int partTimeHours;

        public Employee(int wagePerHour, int fullDayHours, int partTimeHours) {
            this.wagePerHour = wagePerHour;
            this.fullDayHours = fullDayHours;
            this.partTimeHours = partTimeHours;
        }

        public int calculateDailyWage(boolean isFullTime) {
            int hours = isFullTime ? fullDayHours : partTimeHours;
            return wagePerHour * hours;
        }
    }

    public class EmployeeWageComputation {
        public static void main(String[] args) {
            System.out.println("Welcome to Employee Wage Computation Program");

            // Create an instance of Employee
            int wagePerHour = 20;
            int fullDayHours = 8;
            int partTimeHours = 4;
            Employee employee = new Employee(wagePerHour, fullDayHours, partTimeHours);

            // Calculate and display the daily wage for full-time employee
            int fullTimeWage = employee.calculateDailyWage(true);
            System.out.println("Full-time Daily Wage: " + fullTimeWage);

            // Calculate and display the daily wage for part-time employee
            int partTimeWage = employee.calculateDailyWage(false);
            System.out.println("Part-time Daily Wage: " + partTimeWage);
        }
    }

}
