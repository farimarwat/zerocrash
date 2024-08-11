## This library has been deprecated. Now use <a href="https://github.com/farimarwat/grizzly">Grizzly</a>

### ZeroCrash 
An android library to minimize crashes. It is a small yet most powerfull to handle crashes automatically and get logs in firebase crashlytics. This will prevent crashes as well as logging to google play console which causes down ranking of the app. In short a crash will not be considered as crash because it is handled gracefully by the library.

**Note:This library handles a crash by itself but still logs will be sent to crashlytics but it is necessary that you have already implemented firebase crashlytics and working correctly.**


**Example app is included but also integrate firebase crashlytics to the project after cloning**

### Step 1: Add ZeroCrash dependency
```
    implementation "io.github.farimarwat:zerocrash:1.6"

```

### Step 2: Initialize ZeroCrash and place it in every activity's onCreate() method where you want to handle crashes
```
  override fun onCreate(savedInstanceState: Bundle?) {
     
        super.onCreate(savedInstanceState)
        ZeroCrash.Builder(this)
            .setTitle("Title") //optional, default will be showen
            .setMessage("Your message goes here") // optional,  default stacktrace logs will be showen
            .setFirebaseInstance(FirebaseCrashlytics.getInstance()) //optional to get the crash in firebase
            .start()
            ...
            //more code goes here
  }
```
### Important
While building an instance of ZeroCrash, you must pass context of activity via "this" keyword of launcher activity
```
ZeroCrash.Builder(this)
```

**Note:This is a beta version and need testers to test play console logs. If you have a console account then kindly test it and send me feedback at: farimarwat@gmail.com**

### Change Log
**V 1.6**
Minor bugs fixed

**V 1.5**
Show crash message via activity

**V 1.3**

A bug fixed

**V 1.1**

Main Application implementation removed

**V 1.0**

Initial release
