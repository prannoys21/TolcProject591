# WeLearn: Adaptive and Innovative MOOC Framework
This is the course project done in Spring MVC along with Hibernate with MySQL database and Maven for building. 

The project consists of the files required to run an online learning platform with 
features such as a hyperlink-based chat system, a ticker and a progress tracking/reporting 
system. 

Getting Started
The project is developed in eclipse IDE for Java EE developers and deployed online on amazon ec2 windows server instance.

Please use the provided url to access the index page: http://ec2-18-217-184-220.us-east-2.compute.amazonaws.com/TolcProject
and the rest of the navigation is self-explanatory.

Sample login credentials for Testing

To see the sample functioning of the application use the following logins:

User-1:
Username:jason  
Password:12345

User-2:
Username: ambarish   
Password: 12345

### NOTE: Unlimited logins can be generated by using the "Sign Up" button on the login page. This is recommended for a proper understanding of the website.

### NOTE: For convenience purposes, we assume the user is the admin of the website

Sample workflow

Step1: Login as user using the above credentials

Step2: Scroll down to view the progress bar section or click on the Courses(on top) for learning

Step3: Start learning the course, if faced with a problem click on the burger (menu) symbol on the top-right for ticker updates

Step4: Click on the user name from whom you need help and send a message with the course details

Step5: Once done with the conversation give feedback on the user

Step6: Once done with the course, mark as complete to generate a ticker update to all other users

Step7: (If you are seeking help) Once you get ticker updates, click on their name (in blue) to start a chat with them

Step8: (If you are providing help) When you receive a message from other users, a text notification will be visible on top right (with a message icon) 

Step9: Clicking on the message icon shows a list of all the users who wants to chat with you

Step10: Clicking on their name (in blue) opens a chat with that user

Step11: After helping the person, you have to answer 'yes' or 'no' to the question asked by the system for feedback purposes

Step12: Click on 'welearn' on top left of the screen to navigate to the user homepage. Here you can see all your stats and feedback responses

# List of known bugs     
●	Once the users chatting click on the hyperlink and navigate to the appropriate page, the chat will disappear and once the user clicks on it again, it will be restored.   
●	When the ticker is open and the user clicks on ‘Mark as completed’, the completion is not updated. It has to be done only when the ticker is closed/hidden.

##### NOTE: Some files were committed on Prannoy's system due to some issues with github in Ambarish and Abhiram's laptops. 
