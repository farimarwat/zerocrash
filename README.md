
### ZeroCrash 
An android library to minimize crashes. It is a small yet most powerfull to handle crashes automatically and get logs in firebase crashlytics. This will prevent crashes as well as logging to google play console which causes down ranking of the app. In short a crash will not be considered as crash because it is handled gracefully by the library.

**Note:This library handles a crash by itself but still logs will be sent to crashlytics but it is necessary that you have already implemented firebase crashlytics and working correctly.**

### Step 1:
Implement Firebase Crashlytics according to <a href="https://firebase.google.com/docs/crashlytics/get-started?platform=android">google documentation</a>

**Important Note:If you have not integrated firebase crashlytics then don't use this library because it will give errors.**

**Example app is included but also integrate firebase crashlytics to the project after cloning**

### Step 2: Add ZeroCrash dependency
```
    implementation "io.github.farimarwat:zerocrash:1.1"

```

### Step 3: Initialize ZeroCrash and place it in every activity's onCreate() method where you want to handle crashes
```
  override fun onCreate(savedInstanceState: Bundle?) {
     
        super.onCreate(savedInstanceState)
        ZeroCrash.Builder(this)
            .setTitle("Title")
            .setMessage("Your message goes here")
            .start()
            ...
            //more code goes here
  }
```


**Note:This is a beta version and need testers to test play console logs. If you have a console account then kindly test it and send me feedback at: farimarwat@gmail.com**

### Change Log
**V 1.1**

Main Application implementation removed

**V 1.0**

Initial release
