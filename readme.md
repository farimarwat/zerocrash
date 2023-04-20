
### ZeroCrash 
An android library to minimize crashes. It is a small yet most powerfull to handle crashes automatically and get logs in firebase crashlytics. This will prevent crashes as well as logging to google play console which causes down ranking of the app. In short a crash will not be considered as crash because it is handled gracefully by the library.

**Note:This library handles a crash by itself but still logs will be sent to crashlytics but it is necessary that you have already implemented firebase crashlytics and working correctly.**

### Step 1:
Implement Firebase Crashlytics according to <a href="https://firebase.google.com/docs/crashlytics/get-started?platform=android">google documentation</a>

### Step 2: Add ZeroCrash dependency
```
    implementation "io.github.farimarwat:zerocrash:1.0"

```

### Step 3: Create an main application that extends from "Application" class and add apply ZeroCrash code
```
class MyApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        ZeroCrash.Builder(this)
            .showMessage(true)// optional
            .setMessage("An error occured. So closing the app") //optional
            .closeApp(true,5000) //optional - close app after certain milli seconds
            .create()
    }
}
```

### Final Step: Add the main application in manifest
```
  <application
        android:allowBackup="true"
        android:name=".MyApplication" // add this
        ...
        >
```

**Note:This is a beta version and need testers to test play console logs. If you have a console account then kindly test it and send me feedback at: farimarwat@gmail.com**
