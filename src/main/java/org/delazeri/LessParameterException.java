package org.delazeri;

import java.security.InvalidParameterException;

public class LessParameterException extends InvalidParameterException {

    public LessParameterException() {
        super("The provided second parameter is less than the first");
    }
}
