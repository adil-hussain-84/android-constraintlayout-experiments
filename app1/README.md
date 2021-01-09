# Flow horizontal alignment example

This Android application module demonstrates how to vertically stack and horizontally align referenced widgets in a [Flow](https://developer.android.com/reference/androidx/constraintlayout/helper/widget/Flow) virtual layout.

The application consists of a single activity named [MainActivity](src/main/java/com/tazkiyatech/constraintlayout/experiments/MainActivity.kt) which which has no functionality other than setting the [activity_main.xml](src/main/res/layout/activity_main.xml) layout file as its content view.

The [activity_main.xml](src/main/res/layout/activity_main.xml) layout file defines a [Flow](https://developer.android.com/reference/androidx/constraintlayout/helper/widget/Flow) virtual layout with the following properties:

1. It tightly wraps its referenced widgets by virtue of having a `layout_height` and `layout_width` value of `wrap_content`.
2. It vertically stacks its referenced widgets by virtue of having `orientation` value of `vertical`.
3. It horizontally aligns its referenced widgets by means of the `flow_horizontalAlign` property which can take a value of `start`, `end` or `center`.
