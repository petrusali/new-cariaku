#!/bin/bash
# Android SDK Environment Setup
export ANDROID_HOME=~/Library/Android/sdk
export PATH=$PATH:$ANDROID_HOME/cmdline-tools/latest/bin:$ANDROID_HOME/platform-tools

echo "Android SDK environment configured:"
echo "ANDROID_HOME=$ANDROID_HOME"
echo "SDK tools available in PATH"
