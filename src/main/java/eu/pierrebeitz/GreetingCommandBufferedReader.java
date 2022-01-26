package eu.pierrebeitz;

import io.quarkus.logging.Log;
import picocli.CommandLine.Command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


@Command(name = "reader", mixinStandardHelpOptions = true)
public class GreetingCommandBufferedReader implements Runnable {

    @Override
    public void run() {
        System.out.println("Input your name");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            var name = reader.readLine();
            System.out.printf("Hello %s\n", name);
        } catch (IOException e) {
            Log.error(e);
        }
    }

}
