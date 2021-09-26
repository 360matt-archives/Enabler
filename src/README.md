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
    <artifactId>FastMongo-v2</artifactId>
    <version>2.0.2-SNAPSHOT</version>
</dependency>
```

## Usage:
```java
Enabler.call( class );
// Call the Runnable if it exists, only once.


Enabler.register( class, Runnable );
// Register Runnable for a class.
```