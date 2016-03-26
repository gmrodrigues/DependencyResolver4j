# DependencyResolver4j
Simple Dependency resolving algorithm

* based on [http://www.electricmonk.nl/log/2008/08/07/dependency-resolving-algorithm/]

== Example ==

"A" depends on "B" and "C"
"B" depends on "D"

```
        Resolver<String> resolver = new Resolver<String>();

        resolver.addDependency("A", "B");
        resolver.addDependency("A", "C");
        resolver.addDependency("B", "D");

        List<String> result = resolver.resolve();
        System.out.println(result);
        # Ouput ["D", "B", "C", "A"]
```