# Implement bottom navigation bar in KMP

## 1. Add dependency
- Open `/gradle/libs.version.toml`
- Add below code:
```
...
// Declare the version (Replace with latest version if needed).
androidx-navigation-compose = "2.8.3" 
...

// Declare the dependency
androidx-navigation-compose = { module = "androidx.navigation:navigation-compose", version.ref = "androidx-navigation-compose"}
```