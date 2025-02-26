package week_8.exercise_10;

public class Main {
    public static void main(String[] args){
        CivilService civilService = new CivilService();
        civilService.setDaysLeft(362);
        System.out.println("Days left: " + civilService.getDaysLeft());
        civilService.work();
        System.out.println("Days left after working once: " + civilService.getDaysLeft());
        for (int i = 0; i < 5; i++) {
            civilService.work();
        }
        System.out.println("Days left after working 5 times: " + civilService.getDaysLeft());
        for (int i = 0; i<9001; i++) {
            civilService.work();
        }
        System.out.println("Days left after completing service: " + civilService.getDaysLeft());
    }
}
