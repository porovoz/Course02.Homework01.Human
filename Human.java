public class Human {
    String name;
    String town;
    int yearOfBirth;

    String jobTitle;

    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        if (name == null || name.isEmpty()) {
            this.name = "'The information is missing.'";
        } else {
            this.name = name;
        }
        if (town == null || town.isEmpty()) {
            this.town = "'The information is missing.'";
        } else {
            this.town = town;
        }
        this.yearOfBirth = Math.max(yearOfBirth, 0);
        if (jobTitle == null || jobTitle.isEmpty()) {
            this.jobTitle = "'The information is missing.'";
        } else {
            this.jobTitle = jobTitle;
        }
    }

//    void checkForNullInformation() {
//        if (name == null || town == null || jobTitle == null) {
//            System.out.println("The information is missing.");
//        } else {
//            System.out.println("Hello! My name is " + name + ". " + "I'm from " + town + ". " + "I was born in " + yearOfBirth + ". " +
//                    "I work for a position: " + jobTitle + ". " + "Nice to meet you!");
//        }
//    }

    @Override
    public String toString() {
        return "Hello! My name is " + name + ". " + "I'm from " + town + ". " + "I was born in " + yearOfBirth + ". " +
                "I work for a position: " + jobTitle + ". " + "Nice to meet you!";
    }

}
