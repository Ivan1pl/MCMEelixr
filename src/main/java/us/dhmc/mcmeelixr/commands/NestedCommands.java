package us.dhmc.mcmeelixr.commands;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface NestedCommands {
    
    Class<?>[] value();
    
}