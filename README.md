# Simple_Java_Library

https://raw.githubusercontent.com/abodinagdat16/Simple_Java_Library/master/io1.PNG

https://raw.githubusercontent.com/abodinagdat16/Simple_Java_Library/master/io2.PNG

Step 1.Add it in your root build.gradle at the end of repositories:

	allprojects {

		repositories {

			...

			maven { url 'https://jitpack.io' }

		}

	}

Step 2. Add the dependency

	dependencies {

	       dependencies {
	        implementation 'com.github.abodinagdat16:Simple_Java_Library:1.3'
	}

	}
