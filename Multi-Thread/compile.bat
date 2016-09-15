@echo off

ECHO Compiling...
javac -d classes -cp src src\*java
ECHO Compiled!

pause


rem put " javac -d classes -cp src src\*java " in Mac