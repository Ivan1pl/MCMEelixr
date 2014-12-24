package us.dhmc.mcmeelixr.commands.arguments;

import us.dhmc.mcmeelixr.commands.exceptions.CommandArgumentException;

public interface ArgumentValidator {

    public void validate( String arg ) throws CommandArgumentException;
    
}