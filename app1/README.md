# Flow horizontal alignment example

This Android application module demonstrates how the [Flow](https://developer.android.com/reference/androidx/constraintlayout/helper/widget/Flow) virtual layout horizontally centre-aligns its referenced widgets rather than start- or end- aligning them.

The application consists of a single activity named [MainActivity](src/main/java/com/tazkiyatech/constraintlayout/experiments/MainActivity.kt) which which has no functionality other than setting the [activity_main](src/main/res/layout/activity_main.xml) layout file as its content view.

The [activity_main](src/main/res/layout/activity_main.xml) layout file defines a [Flow](https://developer.android.com/reference/androidx/constraintlayout/helper/widget/Flow) virtual layout which vertically stacks three Views but horizontally centre-aligns the Views rather than left-aligning them.
