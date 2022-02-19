import org.junit.Test;

import pages.HomePage;

public class SanityTest extends BaseTest {
//@Test
//public void acd() {
	//int a = 76;
	//int b = 86+a;
//System.out.println(b);


public HomePage hp;
@Test
public void test() {
	hp = new HomePage(dr);
	hp.verifyHomePageLogo();

}

/*Build Lifecycle is Made Up of Phases
Each of these build lifecycles is defined by a different list of build phases, wherein a build phase represents a stage in the lifecycle.
For example, the default lifecycle comprises of the following phases (for a complete list of the lifecycle phases, refer to the Lifecycle Reference)
1.validate – validate the project is correct and all necessary information is available
2.compile – compile the source code of the project
3.test – test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
4.package – take the compiled code and package it in its distributable format, such as a JAR.
5.verify – run any checks on results of integration tests to ensure quality criteria are met
6.install – install the package into the local repository, for use as a dependency in other projects locally
7.deploy – done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.

*source code is any code written in src main jave

Project object model stands for pom.xml

Test notation is main method 

Source code is code that is supporting code

In the validation phase
  1.Maven Validates the src code 

In the compile phase there are two actions taking place
1. Instals maven compiler plugin
2. Complies src folder code ?

In the testing phase there are 3 actions that will take place
1. Compile testing code in src
2. Instals  sure fire  report  plugin 
3. Results are returned only after the plugin is installed even if your code is written correctly
If doesn’t down load auto you must add them manually.  Check console for solution. Google is your best friend. 

In the packaging phase 
1. It will convert your project as a jar file n a project level
2. At this step you can’t share your project 

[integration]

[verify ]

In the mvn install phase 
1. The jar file that was created will be installed in your local machine as a visible jar

In the deploy phase 
1. Copies the final package to the repository so that your project can be shared 
2. You have to add system path tag under dependency if you want to use it, but it happens automatically. 

Can you add your jar to your pom.xml?
 In a pom.xml you can as long as you use the <systempath> along with the other 3 tags 
1. group id
2. Artifact id
3. Version
4. System path

What can be in a pom.xml file?
  1. Dependencies  
2. Plugin
3. Property
*
*
*
*
*
*
*
*
*
*
*/







}











