package week_4;

public class PasswordRandomizer {
        public PasswordRandomizer(int length) {
            String Password = "";
            for (int i = 0; i < length; i++) {
                Password = Password + createPassword();
            }
        }

        public String createPassword() {
            String chars = "abcdefghijklmnopqrstuvwxyz";
            String character = "";
            character = (String.valueOf(chars.charAt((int) Math.floor(Math.random() * chars.length()))));
            return (character);
        }

}
