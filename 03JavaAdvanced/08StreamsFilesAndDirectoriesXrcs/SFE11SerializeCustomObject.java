import java.io.*;
import java.util.List;

public class SFE11SerializeCustomObject {
    private static final String PATH = "C:\\Users\\Workstation9" +
            "\\Desktop\\JavaCoffee\\SoftUni\\javaAdvanced202101" +
            "\\10StreamsFilesAndDirectoriesExercises\\SFDXrcs\\src\\resources" +
            "\\list.ser";


    public static void main(String[] args) {

        //List<Double> list = List.of(4.5, 3.7, 1.0, 8.8);
        Course course = new Course();
        course.setName("Java Advanced");
        course.setStudentsCount(200);


        try {
            FileOutputStream fos = new FileOutputStream(PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(course);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(PATH);
            ObjectInputStream oos = new ObjectInputStream(fis);
            Course deSerialized = (Course) oos.readObject();
            //deSerialized.forEach(e -> System.out.println(e));
            System.out.println(deSerialized);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static class Course implements Serializable {
        private String name;
        private int studentsCount;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getStudentsCount() {
            return studentsCount;
        }

        public void setStudentsCount(int studentsCount) {
            this.studentsCount = studentsCount;
        }

        //call overides with ctrl+

        @Override
        public String toString() {
            return String.format("%s -> %d", this.getName(), this.getStudentsCount());
        }
    }
}
