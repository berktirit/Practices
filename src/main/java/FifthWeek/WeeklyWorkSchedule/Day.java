package FifthWeek.WeeklyWorkSchedule;

/**
 * Haftanın günlerini ve o günlere ait çalışma saatlerini tutan enum.
 */
enum Day {
    SUNDAY("Closed"),
    MONDAY("09:00 - 17:00"),
    TUESDAY("09:00 - 17:00"),
    WEDNESDAY("09:00 - 17:00"),
    THURSDAY("09:00 - 17:00"),
    FRIDAY("09:00 - 17:00"),
    SATURDAY("10:00 - 14:00");

    // Her gün için çalışma saatini tutan değişken
    private final String workingHours;

    /**
     * Constructor: Her günün çalışma saatini ayarlamak için kullanılır.
     *
     * @param workingHours Working hours (e.g.: "09:00 - 17:00")
     */
    Day(String workingHours) {
        this.workingHours = workingHours;
    }

    /**
     * Günün çalışma saatlerini döndürür.
     *
     * @return working hours (String)
     */
    public String getWorkingHours() {
        return workingHours;
    }
}