import java.util.ArrayList;
import java.util.Scanner;

public class LU10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputSchedule = scanner.nextLine().split(", ");
        ArrayList<String> schedule = new ArrayList<>();
        for (int i = 0; i < inputSchedule.length; i++) {
            schedule.add(inputSchedule[i]);
        }

        String input = scanner.nextLine();
        while (!"course start".equals(input)) {
            String[] inputCommandAsString = input.split(":");
            String command = inputCommandAsString[0];
            String lessonTitle = inputCommandAsString[1];
            if ("Add".equals(command)) {
                if (!schedule.contains(lessonTitle)) {
                    schedule.add(lessonTitle);
                }
            } else if ("Remove".equals(command)) {
                if (schedule.contains(lessonTitle)) {
                    schedule.remove(lessonTitle);
                }
            } else if ("Swap".equals(command)) {
                String lessonTypeTwo = inputCommandAsString[2];
                int indexLessonTypeTwo = -1;
                for (int i = 0; i < schedule.size(); i++) {
                    if (lessonTypeTwo.equals(schedule.get(i))) {
                        indexLessonTypeTwo = i;
                    }
                }
                int indexLessonType = -1;
                for (int i = 0; i < schedule.size(); i++) {
                    if (lessonTitle.equals(schedule.get(i))) {
                        indexLessonType = i;
                    }
                }

                if (indexLessonType >= 0 && indexLessonTypeTwo >= 0) {
                    String temp1 = schedule.get(indexLessonType);
                    String temp2 = schedule.get(indexLessonTypeTwo);
                    schedule.set(indexLessonTypeTwo, temp1);
                    schedule.set(indexLessonType, temp2);
                }

            } else if ("Exercise".equals(command)) {
                int indexLessonType = -1;
                String excercise = lessonTitle + "-Exercise";
                if (schedule.contains(lessonTitle) && !schedule.contains(excercise)) {
                    for (int i = 0; i < schedule.size(); i++) {
                        if (lessonTitle.equals(schedule.get(i))) {
                            indexLessonType = i;
                            schedule.add(indexLessonType + 1, excercise);
                        }

                    }
                } else {
                    schedule.add(lessonTitle);
                    schedule.add(excercise);
                }

            } else if ("Insert".equals(command)) {
                int index = Integer.parseInt(inputCommandAsString[2]);
                if (!schedule.contains(lessonTitle)) {
                    schedule.add(index, lessonTitle);
                }
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < schedule.size(); i++) {
            String tempi = schedule.get(i).split("-")[0];
            for (int j = i + 1; j < schedule.size(); j++) {
                String tempj = schedule.get(j).split("-")[0];
                if (tempi.equals(tempj)) {
                    schedule.add(i + 1, schedule.get(schedule.size() - 1));
                    schedule.remove(schedule.size() - 1);
                }
            }
        }
        //int i = schedule.indexOf(inputSchedule);

        for (int j = 0; j < schedule.size(); j++) {
            System.out.println(j + 1 + "." + schedule.get(j));
        }
    }
}
