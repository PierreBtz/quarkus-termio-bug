package eu.pierrebeitz;

import io.quarkus.picocli.runtime.annotations.TopCommand;
import picocli.CommandLine;

@TopCommand
@CommandLine.Command(
      subcommands = {
            GreetingCommandTextIO.class,
            GreetingCommandBufferedReader.class
      }
)
public class EntryCommand {
}
