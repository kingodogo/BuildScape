@echo off
echo BuildScape Mod - Quick Launch
echo =============================
echo.
echo Choose an option:
echo 1. Launch Client
echo 2. Launch Server
echo 3. Clean and Build
echo 4. Exit
echo.
set /p choice="Enter your choice (1-4): "

if "%choice%"=="1" (
    echo Launching BuildScape Client...
    gradlew runClient
) else if "%choice%"=="2" (
    echo Launching BuildScape Server...
    gradlew runServer
) else if "%choice%"=="3" (
    echo Cleaning and building project...
    gradlew clean build
) else if "%choice%"=="4" (
    echo Goodbye!
    exit
) else (
    echo Invalid choice. Please run the script again.
    pause
)
