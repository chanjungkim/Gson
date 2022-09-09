# How To:

To get a Git project into your build:

## Step 1. Add the JitPack repository to your build file

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

## Step 2. Add the dependency

```
	dependencies {
	        implementation 'com.github.chanjungkim:Gson:Tag'
	}
```

# How to use

```kotlin!=
val json = "[{\"name\":\"evan\", \"level\": 1}, {\"name\":\"hazel\", \"level\": 2}, {\"name\":\"mason\", \"level\": 3}]"
val myArrayList = Gson().fromJsonToArrayList(json, TestModel::class.java)
```
