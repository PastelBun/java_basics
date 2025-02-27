package week_8.exercise_9;

public class RegistrationPlate {
    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
       this.regCode = regCode;
       this.country = country;
    }
    public String getRegCode() {
        return this.regCode;
    }

    @Override
    public String toString(){
        return this.country+ " "+this.regCode;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        RegistrationPlate compared = (RegistrationPlate) obj;

        if (!this.country.equals(compared.country)) {
            return false;
        }
        return this.regCode != null && this.regCode.equals(compared.getRegCode());
    }
    @Override
    public int hashCode() {
        if (this.regCode == null) {
            return 0;
        }
        return this.country.hashCode() + this.regCode.hashCode();
    }
    }