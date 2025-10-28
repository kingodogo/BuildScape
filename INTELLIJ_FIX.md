# 🔧 Fix IntelliJ IDEA "Non-parseable POM" Error

## ❌ Error Message
```
Non-parseable POM Z:\DGA mods\BuildScape\build.gradle: only whitespace content allowed before start tag and not b
```

## ✅ Solution

This error happens when IntelliJ IDEA tries to read your `build.gradle` file as a Maven `pom.xml` file. Here's how to fix it:

### **Step 1: Invalidate IntelliJ Cache**

1. Close IntelliJ IDEA completely
2. In File Explorer, delete these folders from your project:
   - `.idea/`
   - `build/`
   - `.gradle/` (if it exists)

### **Step 2: Reopen and Refresh**

1. Open IntelliJ IDEA
2. **File → Open** → Select your BuildScape project folder
3. **When prompted**, select "Open as Gradle Project"
4. Wait for Gradle sync to complete (may take a few minutes)

### **Step 3: Verify Setup**

1. Check if "Gradle" tab appears at the bottom/sides
2. Look for "Gradle sync completed" message
3. The project structure should show your Java files

## 🎯 Alternative: Use IntelliJ's Built-in Fix

### **Option 1: Invalidate Cache**
1. **File → Invalidate Caches / Restart**
2. Select "Invalidate and Restart"
3. Wait for IntelliJ to restart

### **Option 2: Reimport Project**
1. **File → Close Project**
2. **File → Open** → Select your project folder
3. When asked, select "Trust Project" and "Import Gradle Project"

### **Option 3: Manual Gradle Import**
1. Open IntelliJ IDEA
2. **File → Settings** → Build, Execution, Deployment → Build Tools → Gradle
3. Set "Gradle JVM" to Java 21
4. Click "OK"
5. Right-click project → **Gradle → Reload Gradle Project**

## 🚀 Command Line (Always Works)

If IntelliJ keeps having issues, you can always run from command line once Gradle is installed:

### **Install Gradle:**
1. Download from: https://gradle.org/releases/
2. Extract to a folder
3. Add to PATH environment variable

### **Then run:**
```bash
gradle runClient
gradle runServer
```

## 📋 What Causes This Error?

This error typically happens when:
- IntelliJ IDEA is confused about project type (Maven vs Gradle)
- Gradle files are missing or corrupted
- IntelliJ cache has outdated information
- Project was imported incorrectly

## ✅ Current Project Status

Your project files are actually **correct**:
- ✅ `build.gradle` is valid
- ✅ `settings.gradle` exists
- ✅ `gradle.properties` configured properly
- ✅ Source code is all there

The issue is just IntelliJ's understanding of the project!

## 🎉 Quick Fix Summary

**Fastest solution:**
1. Close IntelliJ
2. Delete `.idea`, `build`, `.gradle` folders
3. Reopen project
4. Select "Import Gradle Project"

**Done!** 🚀
