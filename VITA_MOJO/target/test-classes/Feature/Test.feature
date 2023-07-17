Feature: VitaMojo Login Functionality

Background: User is Logged In
	Given User at VitaMojo site "https://automation.vmos-demo.com/" using "CROME"
	And Navigate to Login Page

Scenario Outline: SignUp on VitaMojo
	And Click on Create Account tab
	When User enter Name as "<Name>" 
	And User Enter email as "<Email>"
	And  User Enter password as "<Password>"
	And User select discount offer as "<option>" 
	And press Create AccountButton 
	Then User Should be created and Sign in into system with Login Name as "<Name>"
	
	Examples: 
		| Name     | Email          | Password | option |
    | Dinesh22 | dt22@gmail.com | qwer1234 | yes    |
       
Scenario Outline: SignIn on VitaMojo
	And Click on Login tab
	And User Enter email as "<Email>"
	And User Enter password as "<Password>"
	And Go for Login 
	Then User Should be Logged in system with Login Name as "<Name>"
	
	Examples: 
		| Email          | Password |
    | dt21@gmail.com | qwer1234 |