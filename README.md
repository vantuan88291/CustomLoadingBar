# CustomLoadingBar
You can custom your own loading bar, this library just using ProgressBar and some layout basic.

## Overview
![CustomLoadingBar Android](https://github.com/vantuan88291/CustomLoadingBar/raw/master/2sNEgmg.png)
![CustomLoadingBar Android](https://github.com/vantuan88291/CustomLoadingBar/raw/master/scr2.png)
## Features
- Custom loading text and color
- Custom color of loading line
- Custom loading box
### To use font resources add support library to your dependencies:
////////

### Usage
- Just add in your code, set visibility to hide and show the Customloadingbar

<com.tuan88291.customloadingbar.CustomLoadingBar
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:clickable="true"
        android:focusable="true"
        android:background="#c4535151"
        android:visibility="visible"
        app:loadingText="Loading ..."
        app:boxLoading="true"
        app:loadingBarColor="@color/colorAccent"
        app:loadingTextColor="@color/colorPrimary"/>
        
      
      
      
####  Supported Attributes
 XML Attribute            | Description  |
| ------------- | -----:|
| app:loadingText      | Text of the loading |
| app:boxLoading     | boolean to show or hide box |
| app:loadingBarColor | color of the loading bar |
| app:loadingTextColor | color of the text|
