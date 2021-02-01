public class DCdemo01 {
    public static void main(String[] args) {

//        Person personPeter = new Person();
//        Person personIvan = new Person();
//        Person personGeorge = new Person();

//        personGeorge.setName("George");
////        personGeorge.setAge(35);
////        personGeorge.setJobTitle("driver");
////        personGeorge.setSalary(1000.00);
////
////        personIvan.setName("Ivan");
////        personIvan.setAge(25);
////        personIvan.setJobTitle("worker");
////        personIvan.setSalary(500.00);
////
////        personIvan.setName("George");
////        personIvan.setAge(45);
////        personIvan.setJobTitle("developer");
////        personIvan.setSalary(3500.00);

        Person[] people = {new Person(), new Person(), new Person()};
        String[] names = {"George", "Ivan", "Peter"};
        int[] age = {25, 35, 45};
        String[] jobTitles = {"worker", "developer", "driver"};
        double[] salary = {1000.0, 5000.0, 1500};

        for (int i = 0; i < people.length; i++) {
            people[i].setName(names[i]);
            people[i].setAge(age[i]);
            people[i].setJobTitle(jobTitles[i]);
            people[i].setSalary(salary[i]);
        }

        for (int i = 0; i < people.length; i++) {
            System.out.println
                    (String.format("%s\nage: %d, job title: %s, salary: %.2f",
                            people[i].getName(),
                            people[i].getAge(),
                            people[i].getJobTitle(),
                            people[i].getSalary()
                            )
                    );

            System.out.println();
        }

    }
}
