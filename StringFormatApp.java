public class StringFormatApp
{
    public static void main(String[] args)
    {
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        float height = Float.parseFloat(args[2]);
        System.out.printf("Name: %-20s age: %3d height: %4.2f\n", name, age, height);
        float spaceHeight = height*1.023f;
        System.out.printf("My space height would be %.1fcm\n",spaceHeight);
        float marsAge = age/1.88f;
        System.out.printf("On Mars I would be approximately %.0f years old.",marsAge);
    }
}