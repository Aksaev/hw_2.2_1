import java.time.LocalDate;

public class Human {
    private static final String DEFAULT_STRING_VALUE = "[ Информация не указана ]";
    String name;
    private String town;
    private int yearOfBirth;
    private String job;

    public Human(String name, String town, int yearOfBirth, String job) {
        this.town = town;
        this.yearOfBirth = yearOfBirth;

        this.name =validOfDefault(name, "[ Информация не указана ]");
        this.town =validOfDefault(town, "[ Информация не указана ]");
        this.job =validOfDefault(job, "[ Информация не указана ]");
        this.yearOfBirth = Math.max(yearOfBirth, 0);
    }

    private String validOfDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        }
        return value;
    }

    // Getter - город проживания
    public String getTown() {
        return town;
    }

    // Setter - город проживания
    public void setTown(String town) {
        if (town == null && town.isEmpty() && town.isBlank()) {
            this.town = "[ Информация не указана ]";
        } else {
            this.town = town;
        }
    }

    // Getter - день рождения
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    // Setter - день рождения
    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    private int getAgeInYears() {
        int curretYear = LocalDate.now().getYear();
        return curretYear - this.yearOfBirth;
    }

    @Override
    public String toString() {
        System.out.println("-----------------------------------------------------------");
        return "Привет! Меня зовут " + name + ".\n" +
                "Я из города " + town + ".\n" +
                "Мне " + yearOfBirth + " лет.\n" +
                "Работаю на должности - " + job + ".\nБудем знакомы!";
    }
}
