public class StringManipulation {
    public static void main(String[] args) {
        String firstName = "The";
        String middleName = "Sneha";
        String lastName = "Singh";
        String fullName = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
        System.out.println(fullName.toUpperCase());
    }
}
