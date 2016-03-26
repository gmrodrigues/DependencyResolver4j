package com.gmrodrigues.dependencyresolver4j.test;

import com.gmrodrigues.dependencyresolver4j.CircularReferenceException;
import com.gmrodrigues.dependencyresolver4j.Resolver;
import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class ResolverTest
{
    @Test
    public void testSomeLibraryMethod() throws CircularReferenceException
    {
        Resolver<String> resolver = new Resolver<String>();

        resolver.addDependency("A", "B");
        resolver.addDependency("A", "C");
        resolver.addDependency("B", "D");

        List<String> result = resolver.resolve();

        assertArrayEquals("Dependency Resolution must match", new String[]{"D", "B", "C", "A"}, result.toArray());
    }
}
