import java.security.SecureRandom;

public class Customer {

    private String firstName;
    private String lastName;
    private String address;
    private String cardNumber;
    private int pin;
    private String username;
    private String password;

    public Customer(String firstName,
                    String lastName,
                    String address,
                    String cardNumber,
                    int pin,
                    String username,
                    String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.username = username;
        if (isValidPassword(password)) {
            this.password = password;
        }
        else {
            this.password = "DefaultPassword@20";
        }
    }
    public Customer(String firstName,
                    String lastName,
                    String address,
                    String cardNumber,
                    int pin,
                    String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.username = username;
        this.password = generatePassword();
    }

    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPin() {
        return this.pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "Customer [firstName='"
                + this.firstName + "', lastName='"
                + this.lastName + "', cardNumber='"
                + this.cardNumber + "', pin='"
                + this.pin + "', username='"
                + this.username + "', password='"
                + this.password + "', address='"
                + this.address + "']";
    }

    private boolean isValidPassword(String password) {
        boolean numericValidator = false;
        boolean lowercaseValidator = false;
        boolean uppercaseValidator = false;
        boolean specialSymbolValidator = false;
        if (password.length() <= 8 || password.length() >= 20) {
            return false;
        }
        for (int counter = 0; counter < password.length(); counter++) {
            int characterUnicode = password.codePointAt(counter);
            if (!numericValidator) {
                if (characterUnicode >= 48 && characterUnicode <= 57) {
                    numericValidator = true;
                }
            }
            if (!lowercaseValidator) {
                if (characterUnicode >= 97 && characterUnicode <= 122) {
                    lowercaseValidator = true;
                }
            }
            if (!uppercaseValidator) {
                if (characterUnicode >= 65 && characterUnicode <= 90) {
                    uppercaseValidator = true;
                }
            }
            if (!specialSymbolValidator) {
                if ((characterUnicode >= 35 && characterUnicode <= 37) || characterUnicode == 64) {
                    specialSymbolValidator = true;
                }
            }
            // Check for other symbols which are not allowed in password
            if (characterUnicode < 35 ||
                    (characterUnicode > 37 && characterUnicode < 48) ||
                    (characterUnicode > 57 && characterUnicode < 64) ||
                    (characterUnicode > 90 && characterUnicode < 97) ||
                    characterUnicode > 122) {
                return false;
            }
        }
        return numericValidator && lowercaseValidator && uppercaseValidator && specialSymbolValidator;
    }

    private String generatePassword() {
        SecureRandom random = new SecureRandom();
        String[] symbolTypes = {"numeric", "lowercase", "uppercase", "specialSymbol"};
        StringBuilder password = new StringBuilder();
        int numerics = 0, lowercaseSymbols = 0, uppercaseSymbols = 0, specialSymbols = 0;
        for (int characterCounter = 1; characterCounter < 12; characterCounter++) {
            String symbolType = symbolTypes[random.nextInt(3)];
            if (numerics == 0 && characterCounter > 7) {
                symbolType = "numeric";
            }
            else if (lowercaseSymbols == 0 && characterCounter > 7) {
                symbolType = "lowercase";
            }
            else if (uppercaseSymbols == 0 && characterCounter > 7) {
                symbolType = "uppercase";
            }
            else if (specialSymbols == 0 && characterCounter > 7) {
                symbolType = "specialSymbol";
            }
            if (symbolType.equals("numeric")) {
                numerics++;
                String randomNumeric = String.valueOf((char) (48 + random.nextInt(10)));
                password.append(randomNumeric);
            }
            if (symbolType.equals("lowercase")) {
                lowercaseSymbols++;
                String randomLowercase = String.valueOf((char) (97 + random.nextInt(26)));
                password.append(randomLowercase);
            }
            if (symbolType.equals("uppercase")) {
                uppercaseSymbols++;
                String randomUppercase = String.valueOf((char) (65 + random.nextInt(26)));
                password.append(randomUppercase);
            }
            if (symbolType.equals("specialSymbol")) {
                specialSymbols++;
                int randomSpecialSymbolInt = random.nextInt(4);
                if (randomSpecialSymbolInt == 3) {
                    password.append("@");
                }
                else {
                    String randomSpecialSymbol = String.valueOf((char) (35 + randomSpecialSymbolInt));
                    password.append(randomSpecialSymbol);
                }
            }
        }
        return String.valueOf(password);
    }
}
