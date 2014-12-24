package us.dhmc.mcmeelixr.commands.arguments;

import us.dhmc.mcmeelixr.commands.exceptions.CommandArgumentException;

public class ArgumentCurrencyValidator implements ArgumentValidator {

    /**
     * 
     */
    public void validate(String arg) throws CommandArgumentException {
        try {
            Float.parseFloat( arg );
        } catch( NumberFormatException e ){
            throw new CommandArgumentException("Argument "+arg+" invalid: must be currency");
        }
    }
}