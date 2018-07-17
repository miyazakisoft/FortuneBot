# コード
### RandomSelectorクラス
リストの中身からランダムに1つの要素を取り出すクラス。

### main関数
RandomSelectorを使用しておみくじを10回ひき、結果を表示する処理が書いてある。


# Kotlin + Gradleプロジェクトの作り方。
### 1. gradleプロジェクトを用意したいディレクトリに移動

### 2. gradleプロジェクトの作成
`$ gradle init`
を実行する。

### 3. buildファイルの修正
`build.gradle`を書き換える。

http://etc9.hatenablog.com/entry/2017/08/03/190506 を参照。

```build.gradle
plugins {
    id "org.jetbrains.kotlin.jvm" version "1.1.3-2"
}

apply plugin: 'application'

mainClassName = 'code.example.HelloWorldKt'

repositories {
    jcenter()
}

dependencies {
    compile "org.jetbrains.kotlin:kotlin-stdlib-jre8"
}
```

### 4
`{gradleプロジェクトがあるディレクトリ}/src/main/kotlin/`にkotlinのソースを置く。

### 5
`$ gradle run`
で実行。
