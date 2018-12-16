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
+ **Code Coverage** - [![codecov](https://codecov.io/gh/mihirm05/AST-WS2018/branch/master/graph/badge.svg)](https://travis-ci.com/mihirm05/AST-WS2018)  
+ **Documentation** - ![Test report](https://img.shields.io/badge/test%20report-master-blue.svg?style=flat)


What “Travis” is about? 
Travis is a hosted, continuous integration service used to build and test projects at GitHub. 
How to utilize the service and instructions to use it? 
Basics of using the service are very nominal, namely you should have a GitHub account and Owner permissions for the project being hosted on the GitHub. 
Following are the steps to get registered for the service- 
1. Visit the link and signup with GitHub account. 
2. Accept the authorization and you will be redirected to the GitHub.
3. Select “Activate” and select the repositories you want to use with Travis CI.
4. Create a .travis.yml file in the repository you want to integrate. Since we have used Java for coding the task we have included the following script in our .yml file- 
Language: java
jdk: -oraclejdk8
script: -ant build
5. Add, commit and push the file to the repository and trigger the Travis Build.

How to add badges to the README.md file? 
After adding the repository to the Travis CI and triggering the build, we get the result whether the build is successful or a failure. It is displayed via a badge on the page itself. 
To add that badge to the README.md of out GitHub, add the following command on the README.md file 
+ **Continuous Integration** - [![Build Status](https://travis-ci.com/mihirm05/AST-WS2018.svg?branch=dev)](https://travis-ci.com/mihirm05/AST-WS2018)  
To add the codecov badge on the README.md we need to follow a certain different approach. This time we need to make change to the .yml file again. 
Following are the additions which we made to the .yml file- 
after_success:
 - bash <(curl -s https://codecov.io/bash)
env:
 global:
    - CODECOV_TOKEN="5cb96507-96ce-496c-a034-6a9383db4a84"
[![codecov](https://codecov.io/gh/mihirm05/AST-WS2018/branch/master/graph/badge.svg)](https://codecov.io/gh/mihirm05/AST-WS2018)

Once, the coverage run completes, we added the badge by adding the following line to the README.md 
+ **Code Coverage** - ![codecov](https://codecov.io/gh/mihirm05/AST-WS2018/branch/master/graph/badge.svg)

References- 
[1] - https://en.wikipedia.org/wiki/Travis_CI
[2] - https://docs.travis-ci.com/user/tutorial/



### Team: 
  * Mihir Mulye
  * Raghuvir Shirodkar
