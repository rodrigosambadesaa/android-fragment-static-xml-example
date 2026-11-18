# Java4Shell (CVE-2026-114938) and Android builds

This Android project runs on ART at runtime, not on the affected HotSpot JVM.
However, GitHub Actions compiles it using an OpenJDK JDK (Gradle, javac, lint,
Android SDK command-line tools and other Java build processes).

GitHub Actions now temporarily sets
`JAVA_TOOL_OPTIONS=-XX:-UseBASE64Intrinsics` to disable the vulnerable
Base64 hardware intrinsic in all Java build processes.

For local builds and self-hosted runners, **update to a JDK build confirmed
fixed by its vendor**. If a fixed runtime is not yet available, apply that
temporary flag and restart Gradle daemons. Verify the effective value with
`java -XX:+PrintFlagsFinal -version` and check `UseBASE64Intrinsics = false`.
On PowerShell: `$env:JAVA_TOOL_OPTIONS = '-XX:-UseBASE64Intrinsics'`.

The workaround is not a substitute for installing a patched JDK.

References:
- https://www.cert.europa.eu/publications/security-advisories/2026-021/
- https://adoptium.net/news/2026/11/temurin-november-2026-cspu-java4shell/
