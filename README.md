# The Berlin Clock

The Berlin Uhr (Clock) is a rather strange way to show the time. On the top of the clock there is a yellow lamp that
blinks on/off every two seconds. The time is calculated by adding rectangular lamps.
 
The top two rows of lamps are red. These indicate the hours of a day. In the top row there are 4 red lamps. Every lamp
represents 5 hours. In the lower row of red lamps every lamp represents 1 hour. So if two lamps of the first row and
three of the second row are switched on that indicates 5+5+3=13h or 1 pm.
 
The two rows of lamps at the bottom count the minutes. The first of these rows has 11 lamps, the second 4. In the
first row every lamp represents 5 minutes. In this first row the 3rd, 6th and 9th lamp are red and indicate the first
quarter, half and last quarter of an hour. The other lamps are yellow. In the last row with 4 lamps every lamp
represents 1 minute.

One can be seen [here](http://uniqueclocks.co.uk/media/berlin~clock.jpg~1.gif)

## The brief

We have created a number of acceptance tests for the Berlin Clock and your challenge is to get them passing.

## Some hints
If you are new to Gradle, it may be worth spending 10 minutes reading a high level summary.  We are using the Gradle
Wrapper so `gradlew` from the command line should download everything you need.  Most modern IDEs support Gradle projects.

The use of JBehave in this instance is to provide you with our definition of done for the task.

Please ensure that you are familiar with our values in the instructions project.  They are important to us.

# Description of implementation
- Created below classes
-- TimeConverterImpl - This class converts String time into Berlin Clock Format
-- BerlinHoursConverter - This class converts String hours into Berlin Clock Hour Format
-- BerlinMinutesConverter - This class converts String minutes into Berlin Clock Minutes Format
-- BerlinSecondsConverter - This class converts String Seconds into Berlin Clock Seconds Format


One of the scenario mentioned in berlin-clock.story file looks incorrect. The scenario looks to test time 24:00:00 which to my understanding is an invalid time. In a day a clock can show 23:59:59 and at the stroke of midnight the clock shows 00:00:00.

I initally implemented using Calendar class to parse String time but since Calendar will never parse 24:00:00 into 24 hours so then I used String split method to get 24 hours value

The time converter is written in DateTimeUtils class.