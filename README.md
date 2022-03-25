# RatatouilleLib
Library for conversions using the ratatouille measurement system (and minions! 🤪🙈🙊🙉)

## How to use it?
Add JitPack to your build.gradle file 
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
Add the dependency
```gradle
dependencies {
    implementation 'com.github.jbko6:RatatouilleLib:version'
}
```

On any double in java or kotlin code, you can simply call the extension function to convert the value to minion or rat related values. For example:
```kotlin
val minionInInches = 24.0
minionInInches.inchToRemy() // 4
```
### What conversions are available?
All double values can be converted to and from the following units for each item:

**Remy:** Inches, meters, miles, feet, yard

**Ratatouille (movie):** Hours, minutes, seconds

**Minion:** Inches, feet, yards, miles

**Despicable Me (movie)**: Minutes, hours, seconds, milliseconds

**Gru:** Inches, feet, yards miles


