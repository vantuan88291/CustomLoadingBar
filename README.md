# CustomLoadingBar
[![](https://jitpack.io/v/vantuan88291/CustomLoadingBar.svg)](https://jitpack.io/#vantuan88291/CustomLoadingBar)

You can custom your own loading bar, this library just using ProgressBar and some layout basic.

## Overview
![CustomLoadingBar Android](https://github.com/vantuan88291/CustomLoadingBar/raw/master/scr3.png)![CustomLoadingBar Android](https://github.com/vantuan88291/CustomLoadingBar/raw/master/scr1.png)
![CustomLoadingBar Android](https://github.com/vantuan88291/CustomLoadingBar/raw/master/scr4.png)
## Features
- Custom loading text and color
- Custom color of loading line
- Custom loading box
### To use font resources add support library to your dependencies:
add maven in to your build.gradle project

```gradle
allprojects {
   repositories {
      ...
      maven { url 'https://jitpack.io' }
   }
}
```
	
Add the dependency

`implementation 'com.github.vantuan88291:CustomLoadingBar:1.9'`

### Usage
- Just add in your code, set visibility to hide and show the Customloadingbar
```xml
<com.tuan88291.library.CustomLoadingBar
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:visibility="visible"
        app:loadingText="Loading ..."
        app:isboxLoading="true"
        app:isloadingCircular="false"
        app:loadingBarColor="@color/colorAccent"
        app:loadingTextColor="@color/colorPrimary" />
```
      
      
      
####  Supported Attributes
 XML Attribute            | Description  |
| ------------- | -----:|
| app:loadingText      | Text of the loading |
| app:isboxLoading     | boolean to show or hide box |
| app:loadingBarColor | color of the loading bar |
| app:loadingTextColor | color of the text|
| app:isloadingCircular | boolean to show Circular or Horizontal loading|
