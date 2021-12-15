# CGIChallenge

Fan Test Problem Statement:

Using Core Java, Implement a simple ceiling fan with these characteristics:

·         The unit has 2 pull cords:

o   One increases the speed each time it is pulled.  There are 3 speed settings, and an “off” (speed 0) setting. 

§  If the cord is pulled on speed 3, the fan returns to the “off” setting.

o   One reverses the direction of the fan at the current speed setting.

§  Once the direction has been reversed, it remains reversed as we cycle through the speed settings, until reversed again.

·         You can assume the unit is always powered (no wall switch)

## App developed using Amazon Corrento Version 17 (java 17)


## To run
a) Download the app package
b) On linux, unpackage on root directory enter:
 - $ javac ./src/ca/com/cgi/CeilingFanOperations.java ./src/ca/com/cgi/MainCeilingFan.java  
 - $ cd src ; java ca.com.cgi.MainCeilingFan    
