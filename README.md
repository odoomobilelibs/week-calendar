#Week Calendar (Agenda view)

How to include ?
----------------

**Step 1.** Add it in your root **build.gradle** at the end of repositories:

```gradle
allprojects {
    repositories {
      ...
      maven { url "https://jitpack.io" }
    }
  }
```

**Step 2.** Add the dependency


```gradle
dependencies {
    compile 'com.github.odoomobile:week-calendar:2.0'
}
```

Add to your view
----------------

```xml
 <com.odoo.calendar.widget.WeekCalendarView
        android:id="@+id/weekCalendarView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />
```

It will be used with other view also,

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <com.odoo.calendar.widget.WeekCalendarView
        android:id="@+id/weekCalendarView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:fillViewport="true">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical">
            <!-- Your view -->
        </LinearLayout>
    </ScrollView>
</LinearLayout>

```

Handle events
-------------

**Date change listener:**

```java
    WeekCalendarView weekCalendarView = (WeekCalendarView) findViewById(R.id.weekCalendarView);
    weekCalendarView.setCalendarDateChangeListener(new CalendarDateChangeListener() {
        @Override
        public void onCalendarDateChange(DateInfo dateInfo) {
            // Perform your action on date
        }
    });
```

**Highlight date**

```java
    WeekCalendarView weekCalendarView = (WeekCalendarView) findViewById(R.id.weekCalendarView);
    weekCalendarView.setCalendarWeekDayHighlightListener(new CalendarWeekDayHighlightListener() {
        @Override
        public boolean canHighlightDate(DateInfo date) {
            // Highlight 5th October
            if(date.dayOfMonth==5 && date.monthOfYear == 10){
                return true;
            }
            return false;
        }
    });
```
