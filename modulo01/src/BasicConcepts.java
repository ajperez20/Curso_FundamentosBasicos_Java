import java.lang.classfile.instruction.SwitchCase;

public class BasicConcepts {
    static void main() {
        //Variables
        String name = "Arturo";
        int age = 18;
        int height = 180; // height in cm
        int weight = 75; //weight in Kg
        var lastName = "Pérez";

        System.out.println("I'm " + name + " "
                + lastName + ", I weigh "
                + weight + ", I'm "
                + height + " tall "
                + ", and I'm " + age);


        //Constantes
        final float PI = 3.14f;
        final String EMAIL = "ajperez31@gmail.com";
        final var MAX_AGE = 28;

        System.out.println("I'm " + PI);
        System.out.println("My email is " + EMAIL);
        System.out.println("I will gone when I'm " + MAX_AGE + " years old.");

        //Condicionales

        System.out.println(age > 20 ? "Im old" : "Im young"); //Operador Ternario

        if (age >= 18) { //Bloque IF/ELSE de toda la vida
            System.out.println("old");
        } else {
            System.out.println("Young");
        }

        //Switch tradicional
        switch (age) {
            case 18:
                System.out.println("young");
                break;
            case 50:
                System.out.println("old");
                break;
            default:
                System.out.println("f");
        }

        //Switch Nuevo
        switch (age) {
            case 18 -> System.out.println("young Nuevo");
            case 50 -> System.out.println("old Nuevo");
            default -> System.out.println("ff");
        }

        //
    }
}
