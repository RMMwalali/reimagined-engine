# POS Engine

## DETAILS

- Authors: **Bikathi Martin**, **Ruth Mwende**
- Language: Java, Kotlin
- Framework: Spring, Android SDK
- Target Platform: *To Be Inserted*
- License: **For Private Use**

## ABOUT

### *To Be Inserted*

## STACK SETUP

### Backend Setup
### Requirements
- MySQL **Version ^8**. Check your MySQL version using the command `mysql -V`
- Apache Maven **Version ^3**. Check your Maven version using the command `mvn --version`
- Java **Version 17 LTS or greater**: Check your Java version using the command `java --version`
### Steps To  Follow
- Clone or pull this repo's **main** branch like this: `git clone [repo_url_address].git --branch=main` or `git pull origin main`
- Login to your MySQL session using the workbench or on a terminal use the command `mysql -u [your_mysql_username] -p` after which you will be asked to type your password
- From the directory in which you cloned the project, navigate to the `application.yml` file located in `posengine-source/posengine/src/main/resources/application.yml`
- Replace the following properties with your MySQL username and password respectively(on lines 6 & 7):
```
datasource:
    username: [your_mysql_username]
    password: [your_mysl_password]
```
- Go back to the MySQL session you just logged into and run the `setup.sql` file which is located at the root of this project. If you are in a terminal the command you type at the MySQL terminal is: `source [absolute_path_to]setup.sql`.  This should create the database(schema) for you.
- Once the schema is created, navigate back to the `posengine` folder at the root of the project you just cloned.
- Inside the folder, open a terminal and run `mvn clean package`. This should compile the project for you and download all necessary dependencies.# reimagined-engine
