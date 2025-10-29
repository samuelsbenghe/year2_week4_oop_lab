// System Detective

/*
 * A)
 * i:   The System class cannot be instantiated because it is a final class with a private constructor.
 * 
 * ii:  - public static final InputStream in
 *      - public static final PrintStream out
 *      - public static final PrintStream err
 * 
 * iii: java.io.PrintStream
 */

package Task1;

import java.nio.ByteOrder;

public class Main {
    public static void main(String[] args) {
        B();
        C();
        D();
    }

    // B) Write a program that prints a given string to the console, but repeats
    // every letter 'o' twice. For, example, if the string is "Hello World!" the
    // program should print "Helloo Woorld!". You must use System.out, but cannot
    // use any of its print* methods. This means you cannot just create a new string
    // and pass it to System.out.print---your solution should only require the
    // original string. Hint: Start by creating a String variable to store the
    // message and then piece together which methods print might be calling
    // internally.
    private static void B() {
        String message = "Hello World!";
        var out = System.out;
        for (char c : message.toCharArray()) {
            out.write(c);
            if (c == 'o')
                out.write(c);
        }
        out.write('\n');
        out.write('\n');
        out.flush();
    }

    /*
     * B) Write a program that prints out the time taken to run the following code
     * in milliseconds.
     * 
     * double x = 0.;
     * for(int i=0; i<1_000_000; ++i){
     * x += Math.sin(i);
     * }
     * System.out.println(x);
     */
    private static void C() {
        long timeStart = System.currentTimeMillis();
        double x = 0.;
        for (int i = 0; i < 1_000_000; ++i) {
            x += Math.sin(i);
        }
        System.out.println(x);
        long timeEnd = System.currentTimeMillis();
        System.out.println("Time taken: " + (timeEnd - timeStart) + "ms");
        System.out.println();
    }

    /*
     * Using System, write a program that prints out the following: the user name,
     * the user's home path, the OS, the machine architecture, the machine
     * endianness, the Java virtual machine name and the Java run-time name. For
     * example, the printout may look like the following:
     * 
     * User: John
     * Home: C:\Users\John
     * OS: Windows 10
     * Arch: amd64
     * Endian: little
     * VM: OpenJDK 64-Bit Server VM
     * Runtime: OpenJDK Runtime Environment
     */
    private static void D() {
        System.out.println("User: " + System.getProperty("user.name"));
        System.out.println("Home: " + System.getProperty("user.home"));
        System.out.println("OS: " + System.getProperty("os.name"));
        System.out.println("Arch: " + System.getProperty("os.arch"));
        System.out.println("Endian: " + (ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN) ? "big" : "little"));
        System.out.println("VM: " + System.getProperty("java.vm.name"));
        System.out.println("Runtime: " + System.getProperty("java.runtime.name"));
    }
}
