package us.dhmc.mcmeelixr.commands.arguments;

import us.dhmc.mcmeelixr.commands.exceptions.CommandArgumentException;

public class ArgumentIntegerValidator implements ArgumentValidator {

    /**
     * 
     */
    public void validate(String arg) throws CommandArgumentException {
        try {
            Integer.parseInt( arg );
        } catch( NumberFormatException e ){
            throw new CommandArgumentException("Argument "+arg+" invalid: must be a number");
        }
    }
}