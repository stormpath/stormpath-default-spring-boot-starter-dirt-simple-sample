## Stormpath Default Spring Boot Starter
## Dirt Simple Sample

This is the minimal configuration and supporting code to get:

1. Stormpath default auth views:
  * `/login`
  * `/register`
  * `/forgot`
  * `/change`
2. Stormpath Spring Security Integration
  * `/` endpoint is permitted
  * All other paths (outside the Stormpath provided ones above) are locked down
3. Spring Boot WebMVC including Thymeleaf views

## Setup

All communication with Stormpath must be authenticated with an API Key.

1. If you haven’t already, [sign up for Stormpath for free](https://api.stormpath.com/register). You’ll be sent a verification email.
2. Click the link in the verification email.
3. Log in to the [Stormpath Admin Console](https://api.stormpath.com/) using the email address and password you used during registration.
4. Click the Create API Key or Manage Existing Keys button in the middle of the page.
5. Under Security Credentials, click Create API Key.

    This will generate your API Key and download it to your computer as an `apiKey.properties` file.

6. Save the file in your home directory in the following location:

    * `~/.stormpath/apiKey.properties` on Unix, Linux and Mac OS
    * `C:\Users\YOUR_USERNAME\.stormpath\apiKey.properties` on Windows

7. Change the file permissions to ensure only you can read this file and not accidentally write or modify it. For example:

    ```
    $ chmod go-rwx ~/.stormpath/apiKey.properties
    $ chmod u-w ~/.stormpath/apiKey.properties
    ```
    
    On Windows, you can [set file permissions similarly](http://msdn.microsoft.com/en-us/library/bb727008.aspx).

## Build

```
mvn clean package
```

## Run

```
java -jar target/*.jar
```

## Exercise the code

```
curl localhost:8080
```
