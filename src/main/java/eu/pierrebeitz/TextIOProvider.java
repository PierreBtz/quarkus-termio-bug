package eu.pierrebeitz;

import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;

import javax.enterprise.inject.Produces;

public class TextIOProvider {

    @Produces
    public TextIO getTextIO() {
        return TextIoFactory.getTextIO();
    }

}
