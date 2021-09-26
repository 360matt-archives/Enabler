# Enabler

## Maven
```
<repositories>
    <repository>
        <id>sonatype</id>
        <url>https://oss.sonatype.org/content/repositories/snapshots</url>
    </repository>
</repositories>
<dependency>
    <groupId>io.github.360matt</groupId>
    <artifactId>Enabler</artifactId>
    <version>1.1.0-SNAPSHOT</version>
</dependency>
```

## Usage:

#### Create a empty class extends Enabler:
```java
public class ProjectXEnabler extends Enabler {
    // nothing here
}
```  

#### Now, add the call in all your project main API class:
```java
Enabler.call(Enabler | ProjectXEnabler);
// Call the Runnable if it exists, only once.
```


#### Now, in your main app/jar, register a task:
```java
Enabler.register(Enabler | ProjectXEnabler, Runnable);
// Register Runnable for a class.
```