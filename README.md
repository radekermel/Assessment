# Given task:
Using the API given below create an automated test with the listed acceptance criteria:

API = https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false

Acceptance Criteria:

Name = "Carbon credits"
CanRelist = true
The Promotions element with Name = "Gallery" has a Description that contains the text "2x larger image"
Instructions:

- Your test needs to be written using a programming language of your choice (not a tool like SoapUI). Ensure you include a clear ReadMe
- Submit your test to us in a format that lets us execute and review the code (it must be submitted in a public repository like Bitbucket or Github)
- Your test must validate all the three acceptance criteria
- Points will be awarded for meeting the criteria, style and the use of good practices and appropriate use of source control
- We want to see your best work - no lazy coding or comments.

# Solution:
## Prerequisites:
Intellij Idea or other IDE

## How to run the test?
Import project to your IDE.

Wait for dependencies to be downloaded.

Run the test.


The test can be run by gradle task: Tasks -> verification -> test

Or using the command line by running command: gradle test

## What did I use?
I decied to use Groovy language with Spock and RestAssured library.

To build projest I have used Gradle.

For matchers in assertions I used Hamcrest matchers.

To create the initial structure of the project I have used Spring Initializr.
