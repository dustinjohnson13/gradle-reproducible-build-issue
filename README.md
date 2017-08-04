To Duplicate:

Follow these steps with Java 1.8.0_25 for both systems (unsure if a newer JDK would have the same issue).

**On Mac** (maybe any non-Linux OS)
* ./gradlew clean build
* shasum build/classes/java/main/com/machenergy/CacheProducer.class
* ./gradlew clean build
* shasum build/classes/java/main/com/machenergy/CacheProducer.class
* Verify the hashes match

**On Linux** (at least Red Hat)
* ./gradlew clean build
* shasum build/classes/java/main/com/machenergy/CacheProducer.class
* ./gradlew clean build
* shasum build/classes/java/main/com/machenergy/CacheProducer.class
* Verify the hashes match

The hashes between Mac and Linux won't match.  If you delete BingBong2, then the hashes will match.
It appears to be related to how multiple Lambdas are handled/linked in the bytecode.