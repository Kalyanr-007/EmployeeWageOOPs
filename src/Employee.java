
    public class Employee {
        private int wagePerHour;
        private int fullDayHours;

        public Employee(int wagePerHour, int fullDayHours) {
            this.wagePerHour = wagePerHour;
            this.fullDayHours = fullDayHours;
        }

        public int calculateDailyWage() {
            return wagePerHour * fullDayHours;
        }
    }

