package week_8.exercise_9;
import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners= new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.containsKey(plate)) {
            return false;
        }
        owners.put(plate, owner);
        return true;
    }
    public String get(RegistrationPlate plate){
        return owners.get(plate);
    }
    public boolean delete(RegistrationPlate Plate){
        if (owners.containsKey(Plate)) {
            owners.remove(Plate);
            return true;
        }
        return false;
    }
    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }
    public void printOwners(){
        HashSet<String> uniqueOwners = new HashSet<>(owners.values());
        for (String owner : uniqueOwners) {
            if (owners.containsValue(owner)) {
                System.out.println(owner);
            }
        }
    }
}