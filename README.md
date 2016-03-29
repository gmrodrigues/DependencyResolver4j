# DependencyResolver4j
Simple Dependency resolving algorithm

* based on [http://www.electricmonk.nl/log/2008/08/07/dependency-resolving-algorithm/]

## Example

* "A" depends on "B" and "C"
* "B" depends on "D"

In which order i must handle "A" "B" "C" and "D" so when i handle an item its dependencies are already handled?

```
        Resolver<String> resolver = new Resolver<String>();

        resolver.addDependency("A", "B");
        resolver.addDependency("A", "C");
        resolver.addDependency("B", "D");

        List<String> result = resolver.resolve();
        System.out.println(result);
        # Ouput ["D", "B", "C", "A"]
```

## At Maven Central
Maven
```
<dependency>
  <groupId>com.gmrodrigues</groupId>
  <artifactId>dependencyresolver4j</artifactId>
  <version>0.1</version>
</dependency>
```

Gradle
```
compile 'com.gmrodrigues:dependencyresolver4j:0.1'
```
