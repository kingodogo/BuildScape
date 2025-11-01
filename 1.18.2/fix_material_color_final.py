#!/usr/bin/env python3
"""
Script to remove all materialColor() calls from ModBlocks.java for 1.18.2 compatibility
"""

import re
import os

def fix_material_color_final(file_path):
    """Remove all materialColor() calls from ModBlocks.java"""
    with open(file_path, 'r', encoding='utf-8') as f:
        content = f.read()
    
    # Remove all .materialColor() calls
    content = re.sub(r'\.materialColor\([^)]+\)', '', content)
    
    with open(file_path, 'w', encoding='utf-8') as f:
        f.write(content)
    
    print(f"Removed all materialColor() calls from {file_path}")

if __name__ == "__main__":
    # Fix the ModBlocks.java file
    fix_material_color_final("src/main/java/com/kingodogo/buildscape/block/ModBlocks.java")
