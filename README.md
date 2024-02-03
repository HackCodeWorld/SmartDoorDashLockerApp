## A Full Stack Development of DoorDash Food & Amazon Package Locker 
This project is a full-stack web application for managing express deliveries, specifically designed for couriers 
and users to interact with the express locker system. The backend is built with Spring Boot, providing RESTful APIs, 

while the frontend is a React application offering a user-friendly interface.
Frontend: React.js & Backend: SpringBoot + MyBatis + MySQL for fundamental functions

## Extended Features:
1. Add the Dockerfile for the SpringBoot Backend
2. Add the Dockerfile for the React.js Frontend
3. Add Redis for the SpringBoot Backend
4. Add the Nginx for the React.js Frontend

This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).

### Built With
Spring Boot - The backend framework used
Maven - Dependency Management for Java
React - The frontend framework used
Bootstrap - The frontend styling framework used
MySQL - The database used
MyBatis - The persistence framework used
Redis - The caching framework used
Nginx - The web server used
LATER: Stay tuned for the following features:
Docker - The containerization platform used
Jenkins - The CI/CD tool used
Kubernetes - The container orchestration platform used

## Structure
```scss
[ User Interface (Web Browser) ]
        |
        | HTTP Requests
        V
[ Frontend (React.js + Bootstrap) ] ---(AJAX Requests)---> [ Backend (Spring Boot + MyBatis) 
                                                            + Kafka (To be implemented)     ]
        |                                                         |       ^
        |                                                         |       |
        |                                                         V       |
        |                                                     [ Database (MySQL) ]
        |                                                         |
        |                                                         |
        |                                                         V
        |                                                     [ Cache (Redis) ] (To be implemented)
        | HTTP Responses
        V
[ User Interface (Web Browser) ]
```

## Available Scripts

In the project directory, you can run:

### `npm start`

Runs the app in the development mode.\
Open [http://localhost:3000](http://localhost:3000) to view it in your browser.

The page will reload when you make changes.\
You may also see any lint errors in the console.

### `npm test`

Launches the test runner in the interactive watch mode.\
See the section about [running tests](https://facebook.github.io/create-react-app/docs/running-tests) for more information.

### `npm run build`

Builds the app for production to the `build` folder.\
It correctly bundles React in production mode and optimizes the build for the best performance.

The build is minified and the filenames include the hashes.\
Your app is ready to be deployed!

See the section about [deployment](https://facebook.github.io/create-react-app/docs/deployment) for more information.

### `npm run eject`

**Note: this is a one-way operation. Once you `eject`, you can't go back!**

If you aren't satisfied with the build tool and configuration choices, you can `eject` at any time. This command will remove the single build dependency from your project.

Instead, it will copy all the configuration files and the transitive dependencies (webpack, Babel, ESLint, etc) right into your project so you have full control over them. All of the commands except `eject` will still work, but they will point to the copied scripts so you can tweak them. At this point you're on your own.

You don't have to ever use `eject`. The curated feature set is suitable for small and middle deployments, and you shouldn't feel obligated to use this feature. However we understand that this tool wouldn't be useful if you couldn't customize it when you are ready for it.

## Learn More

You can learn more in the [Create React App documentation](https://facebook.github.io/create-react-app/docs/getting-started).

To learn React, check out the [React documentation](https://reactjs.org/).

### Code Splitting

This section has moved here: [https://facebook.github.io/create-react-app/docs/code-splitting](https://facebook.github.io/create-react-app/docs/code-splitting)

### Analyzing the Bundle Size

This section has moved here: [https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size](https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size)

### Making a Progressive Web App

This section has moved here: [https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app](https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app)

### Advanced Configuration

This section has moved here: [https://facebook.github.io/create-react-app/docs/advanced-configuration](https://facebook.github.io/create-react-app/docs/advanced-configuration)

### Deployment

This section has moved here: [https://facebook.github.io/create-react-app/docs/deployment](https://facebook.github.io/create-react-app/docs/deployment)

### `npm run build` fails to minify

This section has moved here: [https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify](https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify)

### UX Design for Courier Interface
![image](/images/2.png)

### Showing the UX for DoorDasher / Amazon Driver Adding Temporary Storage Locker Interface
![image](/images/1.png)

### Showing the UX for DoorDasher / Amazon Driver Demonstrating all items list being stored in the locker

## Features

- **Courier Interface**: Couriers can log in to the system to perform operations such as adding, deleting, and updating express deliveries.
- **User Interface**: Users can view the status of their deliveries and receive notifications upon delivery completion.
- **Express Management**: The system supports operations including entering, deleting, modifying, and viewing all express deliveries.
- **Responsive Design**: The application is fully responsive and provides a seamless experience on both desktop and mobile devices.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- [Node.js and npm](https://nodejs.org/en/download/)
- [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [React](https://reactjs.org/)

### Installing

1. **Clone the repository**

```bash
git clone https://github.com/yourusername/SmartDoorDashLocker.git
cd SmartDoorDashLocker
```

## Set up the backend
Navigate to the backend(src/main/java) directory, build and run the Spring Boot application.

## Set up the backend
Navigate to the frontend directory, install dependencies, and start the React app.
```bash
cd ../frontend
npm install
npm start
```
The application should now be running on localhost:3000





