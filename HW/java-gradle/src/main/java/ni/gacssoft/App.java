/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ni.gacssoft;

import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) throws IOException {
        String whoAmI = FigletFont.convertOneLine("JAVA");
        System.out.println(new App().getGreeting());
        System.out.println( "Yo soy ...." );
        System.out.println( whoAmI );
    }
}