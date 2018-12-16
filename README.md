# Hochschule Bonn-Rhein-Sieg
## AST - WS 2018 Project : Object List Merger

### Description:
Given a set of observations from two sensors, this object list merger algorithm evaluates the belief of the two sensor readings, and assigns a label to the objects.<br><br>

The sensors are selected such that one is an absolute sensor, for instance, a <b>3D RGB-D camera</b>, and the other is a relative sensor, for instance, a <b>2D RGB camera</b>. Through the usage of these two sensors, the objects can be identified with an increased belief, which can then be used for further processing in user application.<br>

### Installation Steps:
In order to test this algorithm yourself (and suggest changes):
  * Fork this repository to your local repo, clone it to your machine, and setup the following package specifics:
  ```ast\objectListMerger\src```
  * Download the code and add it to aforementioned ```\src``` folder.
  * Import the project package to IDE of your choice ```Eclipse IDE```, etc.

### Executing the Code:
The code can be executed either through IDE or through command line.<br>
For command line execution:
  * Browse to the project path ```ast\objectListMerger\src```
  * Open a new terminal window, and run the following command:
    ```java Main.java```
Command line output would show what is the <i>label, ID and percentage surety of the object</i>.

### Testing the Code:
The code can be tested through IDE.<br>
  * Import this project from local machine
  * Execute ```SensorTest.java```
Testing output would <i>assert</i> whether the output is true for a given expected value.

### Summary:
  Source coded in <b><i>Eclipse IDE</i></b>.<br><br>
  Package name: <b><i>ast.objectListMerger</i></b><br><br>
  Source code files: 
  * Main.java 
  * SensorData.java 
  * SensorTest.java
  
  
+ **Continuous Integration** - [![Build Status](https://travis-ci.com/mihirm05/AST-WS2018.svg?branch=dev)](https://travis-ci.com/mihirm05/AST-WS2018)  
+ **Code Coverage** - ![codecov](https://codecov.io/gh/mihirm05/AST-WS2018/branch/master/graph/badge.svg)(https://travis-ci.com/mihirm05/AST-WS2018)  
+ **Documentation** - ![Test report](https://img.shields.io/badge/test%20report-master-blue.svg?style=flat)



### Team: 
  * Mihir Mulye
  * Raghuvir Shirodkar
