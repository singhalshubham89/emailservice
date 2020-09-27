# Email Service
Create a service that accepts the necessary information and sends emails. It should provide an abstraction between two different email service providers. If one of the services goes down, your service can quickly failover to a different provider without affecting your customers.
---

## Description of the problem and solution.
#### Problem
1) When user try to send email then the service should be reliable such that it sends through any service provider even if it is down.
---
#### Solution/Feature
Backend:- Spring Boot
1) Create single POST rest end point /sendemail which accepts username, useremail, to, cc (optional), bcc(optional)
2) Understand the different email provides and check what are common things between them and create abstract class Emailprovider which has abstract method sendemail
3) Create User class to store all details about users
4) Validation of emails and users
5) Error handling as well as checking if particular email request was not successful than failback to next service provider
6) Unit test case for good code coverage and expected outcomes

#####Challenges
1) Understand apis and check how to handle multiple users sending email simultaneously.
2) Load distrubutions
---
## Whether the solution focuses on back-end, front-end or if it's full stack.
1) It focuses on backend 
2) It can be extended to frontend react
---
## Reasoning behind your technical choices, including architectural.
1) Spring boot : It is fast, reliable as well as it is industry standard framework for rapid prototype development

---
## Trade-offs you might have made, anything you left out, or what you might do differently
1) Trade off 
 - It has complex implementation.
 - Coding and some part of design is left
---
## if you were to spend additional time on the project.
 - Think about design.
 - how to create basic mvp
 - Spend more time with Sprig framework to understand more and implement
 - where to host application as a starting
---
## Link to other code you're particularly proud of.
1. [Todo Application](https://github.com/singhalshubham89/to-do-app)
---
## Link to your resume or public profile.
1. [Resume Pdf](https://shubhamsinghal.expert/)
2. [Scaler](https://www.scaler.com/academy/profile/743e4822ab0f/)
3. [CodeChef](https://www.codechef.com/users/shubhams89)
4. [LinkedIn](https://www.linkedin.com/in/shubham-singhal-b747b610b/)
5. [Hackerearth](https://www.hackerearth.com/@singhalshubham89)
6. [Hackerrank](https://www.hackerrank.com/singhalshubham89)
7. [Portfolio](https://shubhamsinghal.life)
---
## Link to the hosted application where applicable.
* [Shubham Singhal Angular Portfolio](http://shubhamsinghal.life/)