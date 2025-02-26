package week_8.exercise_9;

public class VehicleRegister_Main {
    public static void main(String[] args) {

        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");
        RegistrationPlate reg4 = new RegistrationPlate("FI", "ABC-124");

        VehicleRegister register = new VehicleRegister();

        System.out.println(register.add(reg1, "Arto"));
        System.out.println(register.add(reg2, "Jürgen"));
        System.out.println(register.add(reg1, "Mikko"));
        System.out.println(register.add(reg3, "Mikko"));
        System.out.println(register.add(reg4, "Jürgen"));

        System.out.println(register.get(reg1));
        System.out.println(register.get(reg2));

        System.out.println(register.delete(reg1));
        System.out.println(register.get(reg1));

        System.out.println(register.delete(reg1));
        System.out.println("Registration Plates:");
        register.printRegistrationPlates();
        System.out.println("Owners:");
        register.printOwners();
    }
}

