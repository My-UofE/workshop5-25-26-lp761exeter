public class AuthorApp
{
    public static void main(String[] args)
    {
        Author osman = new Author("Richard Osman", "noone@nowhere.com", 'm');

        System.out.println(osman); // Test toString()
        osman.setEmail("osman@murderclub.com"); // Test setter
        System.out.println("name is: " + osman.getName()); // Test getter
        System.out.println("email is: " + osman.getEmail()); // Test getter
        System.out.println("gender is: " + osman.getGender()); // Test getter
    }
}
