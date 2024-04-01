public class MyClass {
    public static void main(String[] args) {
        String name = "Matheus";
        String lastName = "Costa";

        String getFullName = getFullName(name, lastName);

        System.out.println(getFullName);
    }

    public static String getFullName(String name, String lastName) {
        return name.concat(" ").concat(lastName);
    }
}

