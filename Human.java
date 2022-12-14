public class Human {
    public String name;
    public String town;
    public int yearOfBirth;
    public String jobTitle;

    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        if (name == null || name.isEmpty()) {
            name = "'The information is missing.'";
        }
            this.name = name;
        if (town == null || town.isEmpty()) {
            town = "'The information is missing.'";
        }
            this.town = town;
        if (yearOfBirth < 0) {
            yearOfBirth = 0;
        }
        this.yearOfBirth = yearOfBirth;
        if (jobTitle == null || jobTitle.isEmpty()) {
            jobTitle = "'The information is missing.'";
        }
            this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Hello! My name is " + name + ". " + "I'm from " + town + ". " + "I was born in " + yearOfBirth + ". " +
                "I work for a position: " + jobTitle + ". " + "Nice to meet you!";
    }
}
