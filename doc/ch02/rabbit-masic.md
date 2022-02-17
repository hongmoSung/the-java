## 모자에서 토끼를 꺼내는 마술

아무것도 없는 Moja 에서 "Rabbit" 을 꺼내는 마술

```java
public class Moja {
    public Moja() {
    }

    public String pullOut() {
        return "";
    }
}
```
```java
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(new Moja().pullOut());
    }
}
```
바이트 코드 조작 라이브러리
- ASM: https://asm.ow2.io
- Javassist: https://www.javassist.org
- ByteBuddy: https://bytebuddy.net

예제

```xml

<dependency>
    <groupId>net.bytebuddy</groupId>
    <artifactId>byte-buddy</artifactId>
    <version>1.11.22</version>
</dependency>
```

```java
try {
    new ByteBuddy().redefine(Moja.class)
            .method(named("pullOut")).intercept(FixedValue.value("Rabbit!"))
            .make().saveIn(new File("/Users/hm.sung/study/the-java/target/classes/"));
} catch (IOException e) {
    e.printStackTrace();
}
System.out.println(new Moja().pullOut());
// 출력 결과
// Rabbit!
```