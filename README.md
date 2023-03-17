#Jenkins Technique
This repository is is my Jenkins Technique project.
For this project I am testing a java program that takes an integer and returns that number plus all the non-negative numbers less than it ex: 4 -> 10

In order to run this, you will need the following installed:
  - JDK
  - ANT
  - Jenkins

Once those 3 are properly installed, go to your browser and go to "localhost:[INSERT THE PORT NUMBER YOU CHOSE WHEN YOU SET UP JENKINS]".
Once you're signed in, click on the "New Item" option on the left. Name your project -call it whatever you want, it doesn't matter- and click on the "Freestyle Project" option. Give your project a description. 
Under "Source Code Management", cloose the Git option and enter the url of this repository. Make sure you change the root directory to main instead of master.
Under "Build Steps" choose "Invoke ANT" and type "clean comple test".
Hit "Save".
You will be brought to a new page, click on "Build Now" whicl will be to your left. This is was does the testing.
After a while, you will be able to click on the build to check its status.

USEFUL RESOURCES
- https://www.guru99.com/jenkins-tutorial.html
- https://www.tutorialspoint.com/jenkins/index.htm
- https://www.codingninjas.com/codestudio/library/junit-plugin-with-apache-ant
- https://www.tutorialspoint.com/ant/index.htm
- https://ant.apache.org/manual/using.html
