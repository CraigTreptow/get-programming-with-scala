# Chapter 9

## Packages
- If published, call it a library
- Only import what is required in that scope
  - It will compile faster
  - It will make requirements clear
  - Author suggests importing within function definitions
- Auto-added
  - `scala`
  - `java.lang`
  - `scala.Predef`
- v2
  - `import scala.concurrent.duration._`
  - `import scala.io.{Source => Src}`
- v3
  - `import scala.concurrent.duration.*`
  - `import scala.io.{Source as Src}`
- Names do not *have* to match the directory structure
  - However, it is a good idea to make the project more maintainable
- 
