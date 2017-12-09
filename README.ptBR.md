[Read in English-American](README.md)
# MimeTypeMap

MimeTypeMap é uma simples biblioteca em java para resolver o mime-type de uma dada extensão, e vice-versa.
O código é naseado nas classes [MimeTypeMap](https://developer.android.com/reference/android/webkit/MimeTypeMap.html) e MimeUtils do Android SDK.


## Obtendo o código

Obtenha a versão mais recente do código no Github utilizando o Git, ou baixe o repositório em um arquivo ZIP.
([Download](https://github.com/diegoflassa/mimetypemap/archive/master.zip))


    git clone https://github.com/diegoflassa/mimetypemap.git


## Building

Você pode gerar a biblioteca a partir do fonte através do commando abaixo, no console, na pasta-raiz do projeto.

```maven
mvn install
```
Os seguintes arquivos serão gerados na pasta "target"

```
* mimetypemap-x.x.x.jar
* mimetypemap-x.x.x-javadoc.jar
* mimetypemap-x.x.x-sources.jar
```


## QuickStart

Adicione o arquivo .jar em seu projeto e use:


Obtêm uma instância do MimeTypeMap

```java
MimeTypeMap mtm= MimeTypeMap.getSingleton();
```

Obtêm a extensão do arquivo da URL

```java
String ext= MimeTypeMap.getFileExtensionFromUrl("http://norvig.com/big.txt");
```

Obtêm a extensão do mime-type

```java
MimeTypeMap mtm= MimeTypeMap.getSingleton();
String ext= mtm.getExtensionFromMimeType("text/plain");
```

Obtêm o mime-type da extensão

```java
MimeTypeMap mtm= MimeTypeMap.getSingleton();
String type= mtm.getMimeTypeFromExtension("TXT");
```

Verifica se a biblioteca suporta a extensão

```java
MimeTypeMap mtm= MimeTypeMap.getSingleton();
Boolean hasExt= mtm.hasExtension("TXT");
```

Verifica se a biblioteca suporta o mime-type

```java
MimeTypeMap mtm= MimeTypeMap.getSingleton();
Boolean hasType= mtm.hasMimeType("text/plain");
```


## Histórico de Mudanças

* Veja [HISTORY](HISTORY.ptBR.md)


## Contribuições

* Veja [CONTRIBUTING](CONTRIBUTING.ptBR.md)


## Licenciamento

* Veja [LICENSE](LICENSE)