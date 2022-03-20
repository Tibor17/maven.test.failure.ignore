# maven.test.failure.ignore
Maven Test Failure Ignore

```
$ mvn test -DfailTests=true -Dmaven.test.failure.ignore

[INFO] --- maven-surefire-plugin:3.0.0-M6-SNAPSHOT:test (default-test) @ maven-test-failure-ignore ---
[INFO] Using auto detected provider org.apache.maven.surefire.junit4.JUnit4Provider
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running org.apache.maven.OOMTest
[ERROR] Tests run: 1, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 0.167 s <<< FAILURE! - in org.apache.maven.OOMTest
[ERROR] org.apache.maven.OOMTest.test  Time elapsed: 0.015 s  <<< FAILURE!
java.lang.AssertionError
        at org.apache.maven.OOMTest.test(OOMTest.java:11)

[INFO]
[INFO] Results:
[INFO]
[ERROR] Failures:
[ERROR]   OOMTest.test:11
[INFO]
[ERROR] Tests run: 1, Failures: 1, Errors: 0, Skipped: 0
[INFO]
[ERROR] There are test failures.

Please refer to C:\vcs\github\maven.test.failure.ignore\target\surefire-reports for the individual test results.
Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.480 s
[INFO] Finished at: 2022-03-20T00:35:12+01:00
[INFO] ------------------------------------------------------------------------
```

but now force OOM while testing...

```
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 2.13 s <<< FAILURE! - in org.apache.maven.OOMTest
[ERROR] org.apache.maven.OOMTest.test  Time elapsed: 1.955 s  <<< ERROR!
java.lang.OutOfMemoryError: Java heap space
        at org.apache.maven.OOMTest.test(OOMTest.java:14)

[INFO]
[INFO] Results:
[INFO]
[ERROR] Errors:
[ERROR]   OOMTest.test:14 » OutOfMemory Java heap space
[INFO]
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO]
[ERROR]

Please refer to C:\vcs\github\maven.test.failure.ignore\target\surefire-reports for the individual test results.
Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.743 s
[INFO] Finished at: 2022-03-20T00:40:38+01:00
[INFO] ------------------------------------------------------------------------
```
