# kocax

[ ![Download](https://api.bintray.com/packages/luthfihariz/kocax/com.luthfihariz.kocax%3Akocax/images/download.svg) ](https://bintray.com/luthfihariz/kocax/com.luthfihariz.kocax%3Akocax/_latestVersion) [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

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

## License
```
Copyright 2016 Shintaro Katafuchi

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
