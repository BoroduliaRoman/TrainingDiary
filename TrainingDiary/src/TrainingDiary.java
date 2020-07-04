/**
 * Created by BR 30.06.2020
 *
 * 01.07 - Created getters and setters for all fields of the class DaysOfTRaining
 */
public class TrainingDiary {
    public static void main(String[] args) {
        DaysOfTRaining.description = "Keep track of your workouts every day";
        DaysOfTRaining.getDescription();

        DaysOfTRaining day1 = new DaysOfTRaining();
        day1.setDate(29.06F);
        day1.setExercise("Pull-ups");
        day1.setNumberOfRepetitions(18);
        day1.setAverageHeartRate(98);
        day1.setTrainingTime(12.0F);
        day1.getGeneralTrainingInformation();

        DaysOfTRaining day2 = new DaysOfTRaining();
        day2.setDate(30.06F);
        day2.setExercise("Bars");
        day2.setNumberOfRepetitions(32);
        day2.setAverageHeartRate(98);
        day2.setTrainingTime(17.0F);
        day2.getGeneralTrainingInformation();

        DaysOfTRaining day3 = new DaysOfTRaining();
        day3.setDate(01.07F);
        day3.setExercise("Squats");
        day3.setNumberOfRepetitions(66);
        day3.setAverageHeartRate(106);
        day3.setTrainingTime(25.17F);
        day3.getGeneralTrainingInformation();

        DaysOfTRaining day4 = new DaysOfTRaining();
        day4.setDate(02.07F);
        day4.setExercise("Pull-ups");
        day4.setNumberOfRepetitions(19);
        day4.setAverageHeartRate(98);
        day4.setTrainingTime(12.29F);
        day4.getGeneralTrainingInformation();

        DaysOfTRaining day5 = new DaysOfTRaining();
        day5.setDate(03.07F);
        day5.setExercise("Bars");
        day5.setNumberOfRepetitions(39);
        day5.setAverageHeartRate(105);
        day5.setTrainingTime(18.40F);
        day5.getGeneralTrainingInformation();
    }
}

class DaysOfTRaining {

    public static String description;
    private static int numberOfTraining;
    public static String MOTIVATION = "No pain no gain";

    private float date;
    private String exercise;
    private int numberOfRepetitions;
    private int averageHeartRate;
    private float trainingTime;


    public DaysOfTRaining() {
        this.exercise = "Lead the name of the exercise";
        numberOfTraining++;
    }

    public float getDate() {
        return date;
    }

    public void setDate(float date) {
        if (date > 31 || date < 1) {
            System.out.println("There is no such date yet");
        } else {
            this.date = date;
        }
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        if (exercise.isEmpty()){
            System.out.println("Lead the name of the exercise");
        } else {
            this.exercise = exercise;
        }
    }

    public int getNumberOfRepetitions() {
        return numberOfRepetitions;
    }

    public void setNumberOfRepetitions(int numberOfRepetitions) {
        if (numberOfRepetitions < 10) {
            System.out.println("You are weak today, sleep longer" + numberOfRepetitions);
        } else {
            this.numberOfRepetitions = numberOfRepetitions;
        }
    }

    public int getAverageHeartRate() {
        return averageHeartRate;
    }

    public void setAverageHeartRate(int averageHeartRate) {
        if (averageHeartRate < 0) {
            System.out.println("You're probably dead");
        } if (averageHeartRate < 50) {
            System.out.println("You definitely need a doctor");
        } if (averageHeartRate > 140) {
            System.out.println("Reduce the load");
        } else {
            this.averageHeartRate = averageHeartRate;
        }
    }

    public float getTrainingTime() {
        return trainingTime;
    }

    public void setTrainingTime(float trainingTime) {
        if (trainingTime < 10) {
            System.out.println("Do something else");
        } else {

            this.trainingTime = trainingTime;
        }
    }

    public void getGeneralTrainingInformation() {
        System.out.println("Date: " + date + "| Exercise: " + exercise + "| Number of repetitions: " +
                numberOfRepetitions + "| Average Heart Rate: " + averageHeartRate + "| Training time: "
                + trainingTime + "m! | Workout day " + numberOfTraining + " | " + MOTIVATION);
    }

    public static void getDescription() {
        System.out.println(description + "\n");
    }
}