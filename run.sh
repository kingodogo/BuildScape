#!/bin/bash

echo "BuildScape Mod - Quick Launch"
echo "============================="
echo ""
echo "Choose an option:"
echo "1. Launch Client"
echo "2. Launch Server"
echo "3. Clean and Build"
echo "4. Exit"
echo ""
read -p "Enter your choice (1-4): " choice

case $choice in
    1)
        echo "Launching BuildScape Client..."
        ./gradlew runClient
        ;;
    2)
        echo "Launching BuildScape Server..."
        ./gradlew runServer
        ;;
    3)
        echo "Cleaning and building project..."
        ./gradlew clean build
        ;;
    4)
        echo "Goodbye!"
        exit 0
        ;;
    *)
        echo "Invalid choice. Please run the script again."
        ;;
esac
