Run
```
./gradlew testCodeCoverageReport
```

Removing dependency without a version (see `core/build.gradle.kts:16`) make the code work fine:

```
./gradlew testCodeCoverageReport -PremoveThatDependency
```
