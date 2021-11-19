# Chapter 3

## SBT
- Build tools:
  - Maven, Ant, Gradle
  - SBT is most common
  - Another option is [mill](https://github.com/lihaoyi/mill)
- Install
  - `choco install sbt`
- Change Scala version from 2.x to 3
  - `sbt> ++3.0.0!`
  - Similarly, start sbt with v3 - `sbt ++3.0.0!`

### Project Templates
- [giter8](https://github.com/foundweekends/giter8/wiki/giter8-templates)
- Seach for 'g8' on github for others

### Project Structure
- `build.sbt`
  - Contains everything sbt needs to know to compile and run the code
  - Specify dependencies
- `project` folder
  - Contains sbt configurations and settings
- `src` folder
  - Contains the source code
- `target` folder
  - Created by sbt when you compile your code
  - Includes the JVM bytecode of your application
  - Includes external dependencies as well

### `project` folder
- `build.properties`
  - Specifies desired sbt version
- `plugins.sbt`
  - Example `addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.1")`
- `target`

### `src` folder
- `main` folder
  - all production code
- `test` folder
  - all test code
- `scala` folder (under main and test)
  - scala code
- `java` folder (under main and test)
  - java code
- `resources` folder (under main and test)
  - static files, such as logging config files
  - test data (if under test)
- 
