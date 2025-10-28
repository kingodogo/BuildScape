@echo off
echo BuildScape Mod Icon Test
echo ========================
echo.

if exist "src\main\resources\buildscape.png" (
    echo ✅ Icon file found: buildscape.png
    echo 📏 File size: 
    dir "src\main\resources\buildscape.png" | findstr "buildscape.png"
    echo.
    echo 🚀 Building mod with your icon...
    gradlew build
    echo.
    echo ✅ Build complete! Your icon should now appear in-game.
    echo 🎮 Launch Minecraft to test your icon.
) else (
    echo ❌ Icon file not found: buildscape.png
    echo.
    echo 📁 Please add your icon file to: src\main\resources\buildscape.png
    echo 📋 Requirements:
    echo    - File name: buildscape.png (exact)
    echo    - Format: PNG
    echo    - Size: 64x64 pixels recommended
    echo    - Location: src\main\resources\ folder
    echo.
    echo 📖 See MOD_ICON_GUIDE.md for detailed instructions.
)

pause
