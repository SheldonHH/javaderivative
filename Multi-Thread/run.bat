@echo off

call compile.bat

ECHO Starting...
java -cp classes ThreadDemoSOP

pause

rem  put java -cp classes ThreadDemoSOP in Mac