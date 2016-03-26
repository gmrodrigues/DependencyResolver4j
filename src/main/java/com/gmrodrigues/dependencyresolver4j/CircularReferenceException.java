package com.gmrodrigues.dependencyresolver4j;

public class CircularReferenceException extends Exception
{
    public CircularReferenceException()
    {
    }

    public CircularReferenceException(String message)
    {
        super(message);
    }
}
