package eu.pierrebeitz;

import org.beryx.textio.TextIO;
import picocli.CommandLine.Command;

import javax.inject.Inject;

@Command(name = "textio", mixinStandardHelpOptions = true)
public class GreetingCommandTextIO implements Runnable {

    @Inject
    TextIO textIO;

    @Override
    public void run() {
        var name = textIO.newStringInputReader().read("Input your name");
        System.out.printf("Hello %s\n", name);
    }

}
