[Leia em Português-Brasileiro](README.ptBR.md)
# MimeTypeMap

MimeTypeMap is a simple java library for resolving the mime type from and extension and back.
The code is based on the [MimeTypeMap](https://developer.android.com/reference/android/webkit/MimeTypeMap.html) and MimeUtils classes from the Android SDK.


## Getting the code

Get the latest code from GitHub using Git or download the repository as a ZIP file.
([Download](https://github.com/diegoflassa/mimetypemap/archive/master.zip))


    git clone https://github.com/diegoflassa/mimetypemap.git


## Building

This project uses [Maven](https://maven.apache.org/). Please refer to the following for additional information on how to [install it](https://maven.apache.org/install.html).  
You may build the library from the source by simply running the command bellow, in the console, from the project root folder.

```maven
mvn install
```

The following files will be generated in the "target" folder

```
* mimetypemap-x.x.x.jar
* mimetypemap-x.x.x-javadoc.jar
* mimetypemap-x.x.x-sources.jar
```


## QuickStart

Add the mimetypemap-x.x.x.jar file to your project and use:


Obtain a MimeTypeMap instance

```java
MimeTypeMap mtm= MimeTypeMap.getSingleton();
```

Obtain a extension from file in a URL

```java
String ext= MimeTypeMap.getFileExtensionFromUrl("http://norvig.com/big.txt");
```

Obtain the extension from a mime-type

```java
MimeTypeMap mtm= MimeTypeMap.getSingleton();
String ext= mtm.getExtensionFromMimeType("text/plain");
```

Obtain the mime-type from an extension

```java
MimeTypeMap mtm= MimeTypeMap.getSingleton();
String type= mtm.getMimeTypeFromExtension("TXT");
```

Check if the library support given extension

```java
MimeTypeMap mtm= MimeTypeMap.getSingleton();
Boolean hasExt= mtm.hasExtension("TXT");
```

Check if the library support given mime-type

```java
MimeTypeMap mtm= MimeTypeMap.getSingleton();
Boolean hasType= mtm.hasMimeType("text/plain");
```


## History changes

* See [HISTORY.md](HISTORY.md)


## Contributing changes

* See [CONTRIBUTING.md](CONTRIBUTING.md)


## Licensing

* See [LICENSE](LICENSE)