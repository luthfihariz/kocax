# kocax
Kotlin Calendar extension

## Usage

Convert string to calendar

```kotlin
val firstJan2018 = "01 01 2018".toCalendar()
```

Convert calendar to string with preferred format

```kotlin
val calendar = Calendar.getInstance().formatTime("dd MM yyyy hh:mm aaa")
```

Change calendar displayed format

```kotlin
val newFormat = "2018-10-19".adjustTimePattern("dd MM yyyy")
```

Get specific time
```kotlin
val yesterday = Calendar.getInstance().yesterday()
val midnight = Calendar.getInstance().midnight()
```

## Installation 

Gradle
```
repositories {
    maven { url "https://dl.bintray.com/luthfihariz/kocax"}
}

dependencies {
    implementation 'com.luthfihariz.kocax:kocax:0.1'
}

```
