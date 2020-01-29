# Project 2

## Student Database Application

Scenario: You are a back-end developer and need to create an application to handle new customer bank account requests.

Your application should do the following:
* Read a .csv file of names, social security numbers, account type and initial deposit
* Use a proper data structure to hold all these accounts
* Both savings and checking accounts share the following properties:

    ``deposit() withdraw() transfer() showInfo()``
    
    ``11- digit account number (generated with the following process: 1 or 2 depending on Savings or Checking, last two digits of SSN, unique 5-digit number and random 3-digit number) ``
 * Savings Account holders are given a Safety Deposit Box identified with 
3-digit number and accessed with a 4-digit code
* Checking Account holders are assigned a Debit Card with a 12-digit number and 4-digit pin
* Both accounts will use an interface that determines the base interest rate

``Savings accounts will use .25 points less than the base rate ``

``Checking accounts will use 15% of the base rate ``

* ShowInfo method should reveal relevant account information as well as information specific to the Checking account or Savings account

Learning objectives:

* Learn to develop robust application architecture
* Learn when to use abstract classes and abstract methods
* Use an interface API to receive information from a developer's application
* Explore constructors deeper and use the super() keyword
* Explore access modifiers and when to use public, private or protected
* Read data from a file and store in an appropriate data structure
* Generate random numbers and work with the String API


*Note: This project has been done as a part of the course [Practice Java by Building Projects](https://www.udemy.com/course/practice-java-by-building-projects/) taught by Tim Short on Udemy* 