
## 📑 <a id="table-of-contents">目录</a>

### 一、 Java 语言概论

- [1.1 Java 和 C++ 主要有哪些区别？分别有什么优缺点？](#11-java-和-c++-主要有哪些区别？分别有什么优缺点？)
    
- [1.2 如何理解面向对象和面向过程？](#12-如何理解面向对象和面向过程？)
    
- [1.3 Java 是值传递还是引用传递？](#13-java-是值传递还是引用传递？)
    

### 二、 基本数据类型与编码

- [2.1 Java 中有了基本类型为什么还需要包装类？](#21-java-中有了基本类型为什么还需要包装类？)
    
- [2.2 RPC 接口返回中，使用基本类型还是包装类？](#22-rpc-接口返回中，使用基本类型还是包装类？)
    
- [2.3 为什么不能用浮点数表示金额？](#23-为什么不能用浮点数表示金额？)
    
- [2.4 BigDecimal 和 Long 表示金额哪个更合适，怎么选择？(待补充)](#24-bigdecimal-和-long-表示金额哪个更合适，怎么选择？(待补充))
    
- [2.5 为什么不能用 BigDecimal 的 equals 方法做等值比较？](#25-为什么不能用-bigdecimal-的-equals-方法做等值比较？)
    
- [2.6 BigDecimal(double) 和 BigDecimal(String) 有什么区别？](#26-bigdecimal(double)-和-bigdecimal(string)-有什么区别？)
    
- [2.7 为什么对 Java 中的负数取绝对值结果不一定是正数？](#27-为什么对-java-中的负数取绝对值结果不一定是正数？)
    
- [2.8 Integer a = 1000, a == b 是什么结果？如果是 100 呢？](#28-integer-a-=-1000,-a-==-b-是什么结果？如果是-100-呢？)
    
- [2.9 Java 中的枚举有什么特点和好处？](#29-java-中的枚举有什么特点和好处？)
    
- [2.10 char 能存储中文吗？](#210-char-能存储中文吗？)
    
- [2.11 常见的字符编码有哪些？有什么区别？](#211-常见的字符编码有哪些？有什么区别？)
    

### 三、 字符串体系 (String)

- [3.1 String、StringBuilder 和 StringBuffer 的区别？](#31-string、stringbuilder-和-stringbuffer-的区别？)
    
- [3.2 String 为什么设计成不可变的？](#32-string-为什么设计成不可变的？)
    
- [3.3 String 是如何实现不可变的？](#33-string-是如何实现不可变的？)
    
- [3.4 String str = new String("zhc") 创建了几个对象？](#34-string-str-=-new-string("zhc")-创建了几个对象？)
    
- [3.5 String a = "ab"; String b = "a" + "b"; a == b 吗？](#35-string-a-=-"ab";-string-b-=-"a"-+-"b";-a-==-b-吗？)
    
- [3.6 字符串常量是什么时候进入到字符串常量池的？](#36-字符串常量是什么时候进入到字符串常量池的？)
    
- [3.7 String 中 intern 的原理是什么？(待补充)](#37-string-中-intern-的原理是什么？(待补充))
    
- [3.8 String 有长度限制吗？是多少？](#38-string-有长度限制吗？是多少？)
    
- [3.9 为什么 JDK 9 中把 String 的 char[] 改成了 byte[]？](#39-为什么-jdk-9-中把-string-的-char[]-改成了-byte[]？)
    
- [3.10 JDK 9 中对字符串拼接做了什么优化？](#310-jdk-9-中对字符串拼接做了什么优化？)
    
- [3.11 怎么修改一个类中的 private 修饰的 String 参数的值？](#311-怎么修改一个类中的-private-修饰的-string-参数的值？)
    

### 四、 面向对象核心 (OOP)

- [4.1 为什么 Java 不支持多继承？](#41-为什么-java-不支持多继承？)
    
- [4.2 接口和抽象类的区别，如何选择？](#42-接口和抽象类的区别，如何选择？)
    
- [4.3 如何理解 Java 中的多态？](#43-如何理解-java-中的多态？)
    
- [4.4 为什么建议自定义一个无参构造函数？](#44-为什么建议自定义一个无参构造函数？)
    
- [4.5 为什么 Java 中的 main 方法必须是 public static void 的？](#45-为什么-java-中的-main-方法必须是-public-static-void-的？)
    
- [4.6 有了 equals 为什么还需要 hashCode 方法？](#46-有了-equals-为什么还需要-hashcode-方法？)
    
- [4.7 为什么建议多用组合少用继承？(待补充)](#47-为什么建议多用组合少用继承？(待补充))
    
- [4.8 什么是深拷贝和浅拷贝？(待补充)](#48-什么是深拷贝和浅拷贝？(待补充))
    

### 五、 核心机制 (泛型/注解/反射/异常)

- [5.1 什么是泛型？有什么好处？](#51-什么是泛型？有什么好处？)
    
- [5.2 什么是类型擦除？](#52-什么是类型擦除？)
    
- [5.3 泛型中 K T V E ? Object 等分别代表什么含义？](#53-泛型中-k-t-v-e-?-object-等分别代表什么含义？)
    
- [5.4 泛型中上下界限定符 extends 和 super 有什么区别？](#54-泛型中上下界限定符-extends-和-super-有什么区别？)
    
- [5.5 Java 中异常分哪两类？有什么区别？](#55-java-中异常分哪两类？有什么区别？)
    
- [5.6 finally 中的代码一定会执行吗？](#56-finally-中的代码一定会执行吗？)
    
- [5.7 try return A, finally return C，最终返回值是什么？](#57-try-return-a,-finally-return-c，最终返回值是什么？)
    
- [5.8 final、finally、finalize 有什么区别？](#58-final、finally、finalize-有什么区别？)
    
- [5.9 为什么不建议使用异常控制业务流程？](#59-为什么不建议使用异常控制业务流程？)
    
- [5.10 Java 注解的作用是什么？](#510-java-注解的作用是什么？)
    
- [5.11 什么是反射机制？为什么反射慢？](#511-什么是反射机制？为什么反射慢？)
    
- [5.12 反射与封装是否矛盾？如何解决反射破坏封装的问题？](#512-反射与封装是否矛盾？如何解决反射破坏封装的问题？)
    
- [5.13 Java 的动态代理如何实现？(待补充)](#513-java-的动态代理如何实现？(待补充))
    

### 六、 高级特性 (SPI/语法糖)

- [6.1 什么是 SPI，和 API 有什么区别？](#61-什么是-spi，和-api-有什么区别？)
    
- [6.2 说几个常见的语法糖？](#62-说几个常见的语法糖？)
    
- [6.3 Lambda 表达式是如何实现的？](#63-lambda-表达式是如何实现的？)
    
- [6.4 while(true) 和 for(;;) 哪个性能好？](#64-while(true)-和-for(;;)-哪个性能好？)
    

### 七、 容器、时间与并发基础

- [7.1 Stream 的并行流一定比串行流更快吗？](#71-stream-的并行流一定比串行流更快吗？)
    
- [7.2 SimpleDateFormat 是线程安全的吗？使用时应该注意什么？](#72-simpledateformat-是线程安全的吗？使用时应该注意什么？)
    
- [7.3 Java 中 Timer 实现定时调度的原理是什么？](#73-java-中-timer-实现定时调度的原理是什么？)
    

### 八、 系统底层与 JVM

- [8.1 ClassNotFoundException 和 NoClassDefFoundError 的区别是什么？](#81-classnotfoundexception-和-noclassdeffounderror-的区别是什么？)
    
- [8.2 Java 中创建对象有哪些种方式？](#82-java-中创建对象有哪些种方式？)
    
- [8.3 什么是 AIO、BIO 和 NIO？(待补充)](#83-什么是-aio、bio-和-nio？(待补充))
    
- [8.4 什么是序列化与反序列化？(待补充)](#84-什么是序列化与反序列化？(待补充))
    
- [8.5 Java 序列化的原理是什么？(待补充)](#85-java-序列化的原理是什么？(待补充))
    
- [8.6 serialVersionUID 有何用途？如果没定义会有什么问题？(待补充)](#86-serialversionuid-有何用途？如果没定义会有什么问题？(待补充))
    
- [8.7 你知道 fastjson 的反序列化漏洞吗？(待补充)](#87-你知道-fastjson-的反序列化漏洞吗？(待补充))
    
- [8.8 什么是 UUID，能保证唯一吗？(待补充)](#88-什么是-uuid，能保证唯一吗？(待补充))
    

---

## 一、 Java 语言概论

### 1.1 Java 和 C++ 主要有哪些区别？分别有什么优缺点？

Java 是平台无关的语言，通过 JVM 实现"一次编写，到处运行"；而 C++ 是平台相关的，需要针对不同平台编译。

在内存管理上，Java 通过 GC 实现自动内存管理，C++ 则需要手动使用 new/delete 管理内存。

参数传递方面，Java 只支持值传递，C++ 支持值传递、指针传递和引用传递。

继承方式上，Java 只支持单继承，C++ 既支持单继承又支持多继承。

底层控制能力方面，Java 不能直接操作内存，C++ 可以直接操作内存和硬件。

执行方式上，Java 是解释型语言，通过编译器编译成字节码再由 JVM 解释执行；C++ 是编译型语言，直接编译成机器码。

Java 的优点包括平台无关性强、生态丰富、社区支持完善、垃圾回收器降低内存泄露风险。缺点是：启动速度较慢、内存占用较大、性能不如 C++、底层控制能力弱。

C++ 的优点包括性能高效、能直接操作内存和硬件、图形和音频库支持丰富。缺点是：内存管理复杂、学习曲线陡峭、容易造成内存泄露、跨平台开发困难。

[↑ 返回目录](#table-of-contents)

### 1.2 如何理解面向对象和面向过程？

面向过程和面向对象是两种不同的编程思维方式。

**面向过程**更关注"怎么做"，类似流水线式作业。在解决问题时，将问题分解成一系列步骤，按顺序执行这些步骤来完成任务。

**面向对象**更关注"谁来做"，类似团队协作。在解决问题时，将问题分解成多个对象，每个对象负责特定的职责，通过对象间的协作来解决问题。

[↑ 返回目录](#table-of-contents)

### 1.3 Java 是值传递还是引用传递？

**Java 只有值传递，没有引用传递。**这是一个容易混淆的概念，需要分情况理解：

**对于基本数据类型**：传递的是数值的副本。方法内对参数的修改不会影响原变量。

**对于引用数据类型**：传递的是**引用地址的副本**。这里容易产生误解，看起来像引用传递，但本质上传递的是引用值的拷贝。具体来说：

- 方法接收到的是对象引用的一个副本，这个副本和原引用指向同一个对象
    
- 通过这个副本可以修改对象的内容，所以外部能看到对象内部状态的变化
    
- 但如果在方法内给参数重新赋值（指向新对象），**不会影响外部的原引用**
    

举个例子：

```java
public void test(StringBuilder sb) {
    sb.append("world");  // 修改对象内容，外部可见
    sb = new StringBuilder("new");  // 重新赋值，外部不可见
}

StringBuilder sb = new StringBuilder("hello");
test(sb);
System.out.println(sb);  // 输出 "helloworld"，证明是值传递（传递了引用的副本，重新赋值失效）
````

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

---

## 二、 基本数据类型与编码

### 2.1 Java 中有了基本类型为什么还需要包装类？

Java 是面向对象的编程语言，更多场景需要使用对象而不是基本类型。

1. **用于集合**：Java 集合（List、Map 等）只能存储对象，不能直接存储基本类型，这时候就必须用包装类。
    
2. **泛型支持**：泛型的类型参数必须是类类型（比如 `List<Integer>`），不能是基本类型（不能是 `List<int>`）。
    
3. **提供实用方法**：包装类提供了类型转换、获取最大最小值等实用方法。
    
4. **可空性**：包装类可以存储 `null`，这在处理数据库字段（如金额、数量等可能为空的字段）时非常有用，而基本类型不能为 `null`。
    

同时，包装类支持**自动装箱**和**拆箱**，使用起来很方便。

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 2.2 RPC 接口返回中，使用基本类型还是包装类？

推荐使用**包装类**，主要有以下几个原因：

1. **避免语义歧义**：基本类型都有默认值（如 `int` 默认是 `0`，`boolean` 默认是 `false`）。当 RPC 接口返回 `0` 或 `false` 时，无法区分是**查询结果本身就是 0/false**，还是**查询失败/数据不存在**。使用包装类，如果返回 `null`，则明确表示数据不存在或异常。
    
2. **可空性**：业务数据很多时候是可选的，包装类的 `null` 值可以自然地表达数据缺失。
    

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 2.3 为什么不能用浮点数表示金额？

因为浮点数（`float` 和 `double`）采用 **IEEE 754 标准**，是以**二进制科学记数法**来表示小数的。这种表示方法只能精确表示能用 2 的负数次幂的和来表示的小数（如 0.5、0.25），而像 `0.1` 这样的十进制小数，转换成二进制是无限循环的。

在计算机中存储时，会进行**舍入**，这就会导致**精度丢失**。例如：

Java

```
System.out.println(1.0 - 0.9); // 输出 0.09999999999999998
```

在金融和交易场景中，任何精度丢失都是不能接受的。

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 2.4 BigDecimal 和 Long 表示金额哪个更合适，怎么选择？(待补充)

（待补充）

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 2.5 为什么不能用 BigDecimal 的 equals 方法做等值比较？

`BigDecimal` 的 `equals()` 方法不仅比较数值的**大小（Value）**，还会比较数值的**精度（Scale）**。

例如：

Java

```
BigDecimal a = new BigDecimal("1.0");
BigDecimal b = new BigDecimal("1.00");
System.out.println(a.equals(b)); // 输出 false
```

因为 `a` 的精度（Scale）是 1，`b` 的精度是 2，所以 `equals` 返回 `false`。

**正确的比较方式**应该使用 `compareTo()` 方法，它只比较数值大小：

Java

```
System.out.println(a.compareTo(b) == 0); // 输出 true
```

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 2.6 BigDecimal(double) 和 BigDecimal(String) 有什么区别？

- **`BigDecimal(double)`**：**不推荐**使用。构造函数内部会先将 `double` 转换为其精确的二进制表示，由于浮点数的精度问题，可能得到意料之外的结果。例如 `new BigDecimal(0.1)` 得到的是 `0.1000000000000000055511151231257827021181583404541015625`。
    
- **`BigDecimal(String)`**：**推荐**使用。它会精确地按照字符串中的值来构造 `BigDecimal`，不会有任何精度问题。例如 `new BigDecimal("0.1")` 得到的就是 `0.1`。
    

**注意：** 如果必须从 `double` 构造，正确的姿势是先将 `double` 转换为 `String`，即 `new BigDecimal(String.valueOf(0.1))` 或使用静态方法 `BigDecimal.valueOf(0.1)`（它的内部实现也是先转 `String`）。

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 2.7 为什么对 Java 中的负数取绝对值结果不一定是正数？

这是因为 Java 的整型（如 `int`）采用**补码**表示，且有固定的表示范围。

对于 32 位 int 类型，其范围是 [-2^31, 2^31 - 1]，即 [-2147483648, 2147483647]。

最小负数 Integer.MIN_VALUE 的绝对值是 2147483648，它超出了正数的最大表示范围 2147483647。

因此，对 `Integer.MIN_VALUE` 取绝对值时：

Java

```
Math.abs(Integer.MIN_VALUE); // 结果仍然是 Integer.MIN_VALUE (-2147483648)
```

这是一个**整数溢出**的特殊情况。

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 2.8 Integer a = 1000, a == b 是什么结果？如果是 100 呢？

这个问题涉及**整型常量池（Integer Cache）和自动装箱**。

1. **`Integer a = 1000, b = 1000; a == b`**：结果是 **`false`**。
    
    - 1000 超出了整型常量池的范围（默认是 **-128 到 127**）。
        
    - 自动装箱时会创建两个新的 `Integer` 对象，`a` 和 `b` 指向堆上的不同对象，因此 `==` 比较地址，返回 `false`。
        
2. **`Integer a = 100, b = 100; a == b`**：结果是 **`true`**。
    
    - 100 在整型常量池范围内（-128 到 127）。
        
    - 自动装箱时，JVM 会从常量池中获取相同的 `Integer` 对象，`a` 和 `b` 指向同一个对象，因此 `==` 返回 `true`。
        

**总结：** 建议所有包装类对象的比较都使用 `equals()` 方法，以避免这种 `==` 比较带来的混淆。

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 2.9 Java 中的枚举有什么特点和好处？

**特点：**

1. **本质是类**：Java 中的枚举（`enum`）本质上是继承自 `java.lang.Enum` 的类。
    
2. **常量集合**：枚举的每一个实例都是该枚举类的**静态**、**最终（final）**、**公开（public）**的实例。
    
3. **单例**：枚举实例在 JVM 中是单例的，且创建过程是线程安全的。
    

**好处：**

1. **类型安全**：避免使用魔术数字或字符串。编译器会检查，你不能传入一个非枚举类型的值。
    
2. **代码简洁**：相比于定义一堆静态常量，枚举更简洁、可读性更好。
    
3. **可扩展性**：枚举可以有自己的构造函数、方法和字段，可以实现接口，使其拥有更强大的业务能力。
    
4. **实现单例的推荐方式之一**：枚举天然是单例且能防止反射、序列化破坏单例。
    

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 2.10 char 能存储中文吗？

**能。**

Java 中的 `char` 类型占两个字节（16 位），它使用的是 **Unicode 字符集**。Unicode 旨在包含世界上所有字符，包括汉字。

- **`char` 变量**：可以存储一个 Unicode 字符，即一个汉字。
    
- **`String` 变量**：由 `char` 数组构成，因此可以存储任意长度的中文字符串。
    

**注意：** 现代 Unicode 字符集（如表情符号或某些生僻字）可能需要两个 `char`（即 4 个字节，使用 UTF-16 编码的代理对 Surrogate Pair）来表示，但对于常用的汉字，一个 `char` 是足够的。

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 2.11 常见的字符编码有哪些？有什么区别？

常见的字符编码包括 **ASCII、ISO-8859-1、GBK/GB2312、Unicode（UTF-8/UTF-16）**。

|**编码名称**|**特点**|**字节数**|**适用范围**|
|---|---|---|---|
|**ASCII**|最基础，只包含英文字母、数字和符号。|1 字节|仅限于英文|
|**ISO-8859-1**|又称 Latin-1，在 ASCII 基础上扩展。|1 字节|仅限于西欧语言|
|**GBK/GB2312**|中国国家标准，包含简体中文。|1-2 字节|仅限于中文|
|**UTF-16**|Unicode 的编码实现，Java `char` 的底层。|2 或 4 字节|全世界所有字符|
|**UTF-8**|**目前最流行**，是变长编码。|1-4 字节|全世界所有字符|

**核心区别：**

- **UTF-8** 兼容 ASCII（英文只占 1 字节），且根据字符不同长度可变（中文通常占 3 字节），因此在网络传输中效率高，是 Web 的标准编码。
    
- **UTF-16**（Java `char` 内部使用）所有字符或大部分常用字符都用 2 个字节表示，方便内存操作和计算。
    

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

---

## 三、 字符串体系 (String)

### 3.1 String、StringBuilder 和 StringBuffer 的区别？

|**特性**|**String**|**StringBuffer**|**StringBuilder**|
|---|---|---|---|
|**可变性**|**不可变**|可变|可变|
|**线程安全**|线程安全（本质上是不可变）|**线程安全**（方法带 `synchronized`）|**非线程安全**|
|**性能**|性能最差（每次操作都创建新对象）|性能较差（有同步开销）|**性能最好**（无同步开销）|
|**适用场景**|字符串常量、方法参数、Map Key|多线程环境下的字符串拼接和操作|单线程环境下的字符串拼接和操作（**最常用**）|

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 3.2 String 为什么设计成不可变的？

主要原因是为了**安全、效率和线程安全**。

1. **线程安全**：不可变对象天生就是线程安全的，不需要额外的同步机制。
    
2. **字符串常量池（String Pool）**：不可变性允许字符串常量池存在，不同的字符串变量可以共享同一个对象，节省内存。
    
3. **安全性**：
    
    - 作为 **Map 的 Key**：`String` 常用作 `HashMap` 的键。如果 `String` 可变，在作为 Key 后其值被修改，会导致 `hashCode` 改变，后续就无法在 `Map` 中找到该键值对。
        
    - **加载配置**：许多 Java 核心类（如类加载器、网络连接等）会用 `String` 作为参数。如果 `String` 可变，会带来严重的安全漏洞。
        

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 3.3 String 是如何实现不可变的？

`String` 的不可变性是通过以下几个机制实现的：

1. **`final` 修饰的类**：`String` 类本身被 `final` 修饰，保证了它不能被继承，防止子类破坏其行为。
    
2. **`final` 修饰的内部存储数组**：在 JDK 8 及以前，`String` 内部存储字符的 `char[]` 数组被 `final` 修饰。在 JDK 9 以后，是 `byte[]` 数组被 `final` 修饰。`final` 保证了引用本身不能变（不能指向新的数组）。
    
3. **没有提供修改内部状态的方法**：`String` 没有提供公共方法来修改其内部 `char[]` 或 `byte[]` 数组的内容。所有看似修改字符串的操作（如 `concat`、`substring`、`replace`）都会返回一个新的 `String` 对象。
    
4. **数组是私有的**：内部数组是 `private` 的，防止外部直接访问和修改。
    

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 3.4 String str = new String("zhc") 创建了几个对象？

创建了 **2 个** 对象。

1. **字面量对象**：`"zhc"` 这个字面量对象，它会被放在**字符串常量池（String Pool）**中。
    
2. **堆上的对象**：`new String()` 会在**堆**上创建一个新的 `String` 对象。
    

`str` 变量指向的是堆上创建的那个新对象。

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 3.5 String a = "ab"; String b = "a" + "b"; a == b 吗？

结果是 **`true`**。

- `String a = "ab";`：在常量池中创建 `"ab"` 对象。
    
- `String b = "a" + "b";`：由于 `+` 连接的两个操作数都是**字符串字面量（String Literal）**，这是一种**编译期优化**。编译器会直接将 `"a" + "b"` 优化成 `"ab"`，因此 `b` 也是指向常量池中的 `"ab"` 对象。
    

所以，`a` 和 `b` 指向同一个常量池对象，`a == b` 返回 `true`。

**如果换成变量：**

Java

```
String s1 = "a";
String s2 = "b";
String s3 = s1 + s2; // s1 和 s2 是变量，运行期才能确定值
String s4 = "ab"; 
System.out.println(s3 == s4); // 结果是 false
```

此时 `s3` 是在堆上通过 `StringBuilder` 拼接创建的新对象，它与常量池中的 `s4` 是两个不同对象。

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 3.6 字符串常量是什么时候进入到字符串常量池的？

取决于 Java 版本：

- **JDK 1.7 及以后**：字符串常量池从永久代（PermGen）迁移到了**堆（Heap）**中。
    
    - **字面量（如 `"abc"`）**：在**编译期**就会被加载到常量池中。
        
    - **运行时调用 `intern()`**：字符串对象在**运行期**调用 `intern()` 方法时，如果常量池中没有该字符串，则会把堆上的对象引用复制到常量池中（JDK 7+ 的行为）。
        
- **JDK 1.6 及以前**：常量池在永久代（PermGen）。
    
    - **字面量**：在**编译期**就会被加载到常量池中。
        
    - **运行时调用 `intern()`**：会在永久代中创建并存储一个新对象（如果不存在）。
        

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 3.7 String 中 intern 的原理是什么？(待补充)

（待补充）

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 3.8 String 有长度限制吗？是多少？

**String 对象本身没有理论上的长度限制**，它最多可以存储 JVM 能够提供的最大内存。

但从实际实现上，有两个限制：

1. **数组长度限制（JVM 规范）**：`String` 内部是使用 `char[]` 或 `byte[]` 存储的。Java 数组的最大长度是 `Integer.MAX_VALUE - 5` 或 `Integer.MAX_VALUE - 8`（大约 **21 亿**）。这是 JVM 对数组长度的限制。
    
2. **编译期限制（Class 文件规范）**：Java Class 文件中，**常量池**中存储的字符串字面量（即代码中双引号直接定义的字符串）的长度不能超过 `65535` 个字节（对应于 **UTF-8 编码**的最大长度）。
    

总结来说：在代码中直接定义的字符串长度不能超过 `65535` 字节；通过运行时拼接等方式创建的 `String` 对象，理论上最大长度是 21 亿左右。

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 3.9 为什么 JDK 9 中把 String 的 char[] 改成了 byte[]？

在 JDK 9 之前，`String` 使用 `char[]` 存储，每个字符占用 2 字节。

**原因：** 为了**节省内存**。

Java 的字符串大部分是拉丁语系的（如英文），这些字符只需要一个字节就能表示（ISO-8859-1 或 ASCII 字符）。如果都用 2 个字节的 `char` 存储，会浪费一半的内存。

- **JDK 9 以后**：`String` 内部使用 `byte[]` 存储，并增加一个 `coder` 字段来标记编码方式。
    
    - 如果字符串全是单字节字符（如英文），使用 **Latin-1** 编码，`byte[]` 数组中 1 字节存 1 个字符，**节省 50% 内存**。
        
    - 如果字符串包含多字节字符（如中文），使用 **UTF-16** 编码，`byte[]` 数组中 2 字节存 1 个字符。
        

这被称为 **Compact Strings**（紧凑字符串）优化。

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 3.10 JDK 9 中对字符串拼接做了什么优化？

在 JDK 8 及以前，字符串拼接（如 `str1 + str2`）通常是通过 **`StringBuilder`** 实现的。

在 **JDK 9/11 以后**，引入了 **`invokedynamic`** 指令，通过 **`StringConcatFactory`** 实现更高级的字符串连接。

**核心变化：**

- 运行时不再固定使用 `StringBuilder`，而是使用 **Concatenation Strategy**（连接策略）。
    
- 这种新策略可以利用 **JIT 编译器**进行更深层次的优化，比如生成更高效的字节码，有时比手动使用 `StringBuilder` 性能更好。
    

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 3.11 怎么修改一个类中的 private 修饰的 String 参数的值？

可以通过 **反射机制** 来修改。

`String` 的不可变性是通过其内部的 `final` 修饰的 `char[]` 或 `byte[]` 实现的。反射可以绕过 `final` 关键字和封装性：

1. 获取 `String` 对象的 `value` 字段（在 JDK 8 是 `char[] value`，JDK 9+ 是 `byte[] value`）。
    
2. 设置 `value` 字段的 `accessible` 为 `true`，绕过 `private` 限制。
    
3. 获取到内部数组后，通过数组的 `set` 方法修改数组中的内容。
    

**代码示例（JDK 8 以前）：**

Java

```
// String s = "不可变";
Field valueField = String.class.getDeclaredField("value");
valueField.setAccessible(true);
char[] value = (char[]) valueField.get(s);
value[0] = '可';
// 此时 s 的值就被修改了
```

**注意：** 这种操作**极不推荐**，因为它破坏了 `String` 的不可变性，可能导致严重的线程安全和不可预测的问题。

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

---

## 四、 面向对象核心 (OOP)

### 4.1 为什么 Java 不支持多继承？

Java 在设计时选择了**单继承**（一个类只能有一个父类），但支持**多实现**（一个类可以实现多个接口），主要是为了解决**多继承带来的复杂性和著名的“菱形继承问题”（Diamond Problem）**。

- **菱形问题**：假设 B 和 C 都继承自 A，D 同时继承 B 和 C。如果 A 中有一个方法 `method()`，B 和 C 都重写了它，那么 D 继承的 `method()` 应该来自 B 还是 C？这将产生歧义和冲突。
    
- **解决方式**：
    
    - Java 类只允许单继承，完美避免了菱形问题。
        
    - 通过**接口**（Interface）实现多重行为，接口只定义规范，不包含字段和具体实现（JDK 8 以前），因此不会有状态和实现上的冲突。
        

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 4.2 接口和抽象类的区别，如何选择？

|**区别点**|**抽象类 (Abstract Class)**|**接口 (Interface)**|
|---|---|---|
|**关键字**|`abstract class`|`interface`|
|**继承关系**|单继承（`extends`）|多实现（`implements`）|
|**构造方法**|可以有构造方法（但不能直接实例化）|不能有构造方法|
|**成员变量**|可以有各种修饰符的变量|只能有 `public static final` 变量|
|**普通方法**|可以有具体实现的方法|仅能有抽象方法（JDK 8 以后可有 `default` 和 `static` 方法）|
|**设计理念**|**"is-a" 关系**，侧重于对同一类事物的抽象，是模板式设计。|**"can-do" 关系**，侧重于功能的定义，是行为式设计。|

**如何选择：**

- 如果是 **"is-a"** 关系，需要对一系列紧密相关的类进行抽象，且可能需要共享一些公共代码（有方法体），选择**抽象类**。
    
- 如果是 **"can-do"** 关系，只需要定义一组行为规范，且希望一个类能拥有多种不相关的能力，选择**接口**。
    

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 4.3 如何理解 Java 中的多态？

**多态（Polymorphism）是指一个对象在不同情况下表现出不同形态的能力。在 Java 中，多态的实现依赖于继承/实现、方法重写（Override）和父类引用指向子类对象**。

**实现多态的三个必要条件：**

1. **继承或实现**：必须有继承关系或接口实现关系。
    
2. **方法重写**：子类必须重写父类的方法。
    
3. **父类引用子类对象**：`Parent p = new Child();`
    

**多态的本质：** 当父类引用调用被重写的方法时，JVM 会根据**引用所指向的实际对象类型**（即子类对象）来决定调用哪个方法。这就是著名的**动态绑定（或运行时绑定）**。

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 4.4 为什么建议自定义一个无参构造函数？

主要原因是为了**兼容性**和**框架需求**。

1. **JavaBean 规范**：许多 Java 框架（如 Spring、Hibernate、Jackson 等）以及 Java 的序列化机制，在创建对象时需要通过反射调用类的**无参构造函数**来实例化对象。
    
2. **默认构造函数消失**：如果你在一个类中定义了**任何**带有参数的构造函数，编译器就不会再为你自动生成**默认的无参构造函数**。
    
3. **易用性**：提供一个无参构造函数能让代码更容易被其他部分（尤其是反射机制）使用，提高了类的灵活性。
    

因此，即使类中的所有字段都需要参数初始化，也建议手动添加一个无参构造函数。

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 4.5 为什么 Java 中的 main 方法必须是 public static void 的？

- **`public`**：为了让 JVM 可以在任何位置访问到这个方法，因为 `main` 方法是程序的入口。
    
- **`static`**：`main` 方法是程序的入口，必须在创建任何对象之前被调用。`static` 使得 `main` 方法属于类本身，可以直接通过类名调用，不需要先实例化对象。
    
- **`void`**：表示 `main` 方法不需要返回任何值给调用者（即操作系统或 JVM）。
    
- **`main`**：这是 JVM 识别程序入口点的固定名称。
    
- **`String[] args`**：用于接收命令行传入的字符串参数。
    

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 4.6 有了 equals 为什么还需要 hashCode 方法？

equals() 用于判断两个对象在逻辑上是否相等。

hashCode() 用于获取对象的哈希码，主要配合哈希表（如 HashMap、HashSet）使用。

**它们的关系必须遵循 Java 规范：**

1. **如果两个对象调用 `equals()` 方法返回 `true`，那么它们的 `hashCode()` 必须返回相同的值。**（核心原则）
    
2. 如果两个对象调用 `equals()` 方法返回 `false`，它们的 `hashCode()` 可以相等也可以不等。
    

**为什么需要 `hashCode`？**

在 `HashMap` 中查找一个 Key 时，会先调用 `hashCode()` 快速定位到数组的**桶（Bucket）**位置。

- 如果不遵守上述原则 1，两个逻辑上相等的对象会定位到不同的桶，导致 `get()` 失败。
    
- 如果只用 `equals`：每次查找都需要遍历所有元素进行 `equals` 比较，效率极低（O(n)）。
    
- 有了 `hashCode`：先通过哈希码快速定位桶（O(1)），再在桶中用 `equals` 精确定位（O(1) 或 O(n/桶大小)）。
    

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 4.7 为什么建议多用组合少用继承？(待补充)

（待补充）

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 4.8 什么是深拷贝和浅拷贝？(待补充)

（待补充）

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

---

## 五、 核心机制 (泛型/注解/反射/异常)

### 5.1 什么是泛型？有什么好处？

**泛型（Generics）是 JDK 5 引入的特性，它允许在定义类、接口和方法时使用类型参数**（Type Parameters），这些类型参数在实际使用时才被确定。

**好处：**

1. **类型安全**：在编译期就能检查出类型错误，而不是等到运行期才抛出 `ClassCastException`。
    
2. **消除强制类型转换**：在使用泛型集合时，取出的元素类型是确定的，无需进行显式的强制类型转换，使代码更简洁。
    
3. **提高代码复用性**：通过类型参数，可以编写出适用于多种数据类型的通用代码，例如一个 `List<T>` 可以存储任何类型的数据。
    

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 5.2 什么是类型擦除？

**类型擦除（Type Erasure）**是 Java 泛型实现的一种机制。

由于 Java 要保证**向后兼容性**（即兼容 JDK 5 以前没有泛型的代码），Java 编译器在编译期会将所有泛型信息**擦除**掉，即把所有类型参数替换为它们的**上界**（通常是 `Object`）。

**例如：**

Java

```
List<String> list1 = new ArrayList<>();
List<Integer> list2 = new ArrayList<>();
// 编译后，它们都变成了：
// List list1 = new ArrayList();
// List list2 = new ArrayList();
```

**影响：**

1. 运行时无法获取泛型的真实类型信息（如 `instanceof T` 是非法的）。
    
2. 无法创建泛型数组（如 `new T[]`）。
    
3. 静态方法不能使用类的泛型参数，因为静态成员属于类，而泛型参数在对象实例化时才确定。
    

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 5.3 泛型中 K T V E ? Object 等分别代表什么含义？

这些是泛型中常用的**类型参数的占位符（惯例）**：

- **`T` (Type)**：最常用的类型占位符，表示**一个**具体的类。
    
- **`K` (Key)**：表示键（用于 Map）。
    
- **`V` (Value)**：表示值（用于 Map）。
    
- **`E` (Element)**：表示集合中的元素类型（用于 Collection）。
    
- **`N` (Number)**：表示数字类型。
    
- **`?` (Wildcard)**：**通配符**，代表**未知类型**。它不是类型参数，不能用于定义类或方法，只用于泛型方法调用或泛型变量的声明。
    

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 5.4 泛型中上下界限定符 extends 和 super 有什么区别？

Java 泛型中的上下界限定符（Wildcard Bound）用于限制通配符 `?` 的范围，遵循 **PECS 原则（Producer Extends, Consumer Super）**。

|**限定符**|**含义**|**用途（行为）**|**PECS 原则**|
|---|---|---|---|
|**`? extends T`**|**上界**：表示类型必须是 `T` 或 `T` 的**子类**。|**只能读/取**（作为生产者 Producer）。只能取出 `T` 类型或其父类对象（因为取出的元素至少是 `T`）。**不能写入**（除了 `null`）。|**Producer Extends**|
|**`? super T`**|**下界**：表示类型必须是 `T` 或 `T` 的**父类**。|**只能写/存**（作为消费者 Consumer）。可以存入 `T` 类型及其子类对象。**取出的对象只能是 `Object` 类型**。|**Consumer Super**|

**核心记忆：**

- **`extends`**：限制了**上限**，可以安全地**取出**（当作 T 来用）。
    
- **`super`**：限制了**下限**，可以安全地**存入**（当作 T 的父类来用）。
    

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 5.5 Java 中异常分哪两类？有什么区别？

Java 异常分为两大类：**检查型异常（Checked Exception）和非检查型异常（Unchecked Exception）**。

|**类别**|**检查型异常 (Checked)**|**非检查型异常 (Unchecked)**|
|---|---|---|
|**继承关系**|继承自 `Exception`（不包括 `RuntimeException`）。|继承自 `RuntimeException` 或 `Error`。|
|**强制处理**|**强制**要求捕获（`try-catch`）或声明抛出（`throws`）。|**不需要**强制处理。|
|**常见例子**|`IOException`、`SQLException`、`ClassNotFoundException`。|`NullPointerException`、`ArrayIndexOutOfBoundsException`、`ClassCastException`。|
|**设计用途**|**可恢复的异常**：通常是外部因素造成的，应该提醒调用者处理（如文件找不到、网络中断）。|**程序逻辑错误**：通常是代码本身的缺陷，应该在开发阶段避免。|

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 5.6 finally 中的代码一定会执行吗？

**不一定，但在绝大多数情况下会执行。**

`finally` 块中的代码**不会执行**的两种极端情况：

1. **JVM 退出**：在 `try` 块或 `catch` 块中调用了 `System.exit(0)`，导致 JVM 彻底停止运行。
    
2. **守护线程终止**：`finally` 块所在的线程是一个守护线程（Daemon Thread），并且在 `try` 块或 `catch` 块执行时，所有非守护线程都已退出，JVM 终止了所有守护线程。
    
3. **OS 级错误**：程序在 `try` 块执行时遇到如硬件故障、栈溢出等致命错误（`Error`），且 JVM 来不及执行 `finally` 就崩溃了。
    

除了上述情况，即使 `try` 块中发生异常、`return`、`break` 或 `continue`，`finally` 块的代码都会在这些操作发生前执行。

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 5.7 try return A, finally return C，最终返回值是什么？

最终返回值是 **`C`**。

当 `try` 块中执行到 `return` 语句时，它会先将返回值 `A` **暂存**起来，然后去执行 `finally` 块。

如果在 `finally` 块中也有 `return` 语句，`finally` 块的 `return` 会**覆盖**掉 `try` 块中暂存的值，并直接结束方法。

**最佳实践：** 应该**避免**在 `finally` 块中使用 `return`，因为它可能会掩盖 `try` 块中抛出的异常或破坏方法的正常逻辑。

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 5.8 final、finally、finalize 有什么区别？

- **`final`**：**关键字**，用于修饰**类、方法和变量**。
    
    - 修饰类：类不能被继承。
        
    - 修饰方法：方法不能被重写（Override）。
        
    - 修饰变量：变量只能被赋值一次（常量）。
        
- **`finally`**：**异常处理块**，用于 `try-catch` 结构中。无论 `try` 块是否发生异常，`finally` 块中的代码总会在方法返回之前被执行（除非 JVM 退出等极端情况）。常用于释放资源。
    
- **`finalize`**：**方法名**，是 `Object` 类的一个**保护方法**。在垃圾回收器（GC）准备释放一个对象所占用的内存之前，会先调用该对象的 `finalize()` 方法。
    
    - **不推荐使用**：该方法的执行时机不确定、性能低，且可能导致对象复活，已被 **`Cleaner`** 机制取代。
        

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 5.9 为什么不建议使用异常控制业务流程？

异常处理（`try-catch`）的性能开销很大，因为在抛出异常时，JVM 需要做一些额外的操作：

1. **捕获当前栈轨迹（Stack Trace）**：这是异常处理中开销最大的部分，需要遍历整个线程栈。
    
2. **创建异常对象**：创建新的异常对象。
    

- **性能开销大**：如果使用异常来控制正常的业务流程，会频繁地触发栈轨迹捕获，导致程序性能急剧下降。
    
- **可读性差**：异常应该用于处理不经常发生的、程序无法控制的错误情况（如文件不存在），而不是作为正常的控制流（如 `if-else`）。使用异常控制流程会使代码难以阅读和维护。
    

**正确做法：** 对于正常的业务判断和流程控制，应使用返回值或布尔值（如 `if (isValid())`）。

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 5.10 Java 注解的作用是什么？

**注解（Annotation）**是 Java 5 引入的元数据（Metadata）机制，它提供了一种为程序元素（类、方法、字段等）添加补充信息的方式，这些信息可以被编译器、JVM 或运行时工具读取和处理。

**作用：**

1. **编译期检查**：例如 `@Override`，它指示编译器检查方法是否正确地重写了父类方法。
    
2. **生成文档**：例如 `@Deprecated`，指示工具生成文档时应包含该元素已过时的信息。
    
3. **运行时处理**：例如 Spring 框架中的 `@Autowired`、`@Controller` 等，程序在运行时通过**反射**读取这些注解，并根据注解配置 Bean、实现依赖注入等功能。
    

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 5.11 什么是反射机制？为什么反射慢？

**反射（Reflection）**是 Java 语言在运行时动态地获取一个类的信息，以及动态地操作类或对象的能力。

**核心能力：**

- 在运行时判断任意一个对象所属的类。
    
- 在运行时构造任意一个类的对象。
    
- 在运行时获取任意一个类所具有的成员变量和方法。
    
- 在运行时调用任意一个对象的方法。
    

**反射慢的原因：**

1. **安全检查**：反射调用方法时，需要进行安全权限检查（例如检查 `setAccessible(true)` 是否成功），这个校验过程耗时。
    
2. **方法查找**：反射涉及到动态查找方法和字段，比直接调用方法要多出查找的步骤。
    
3. **方法调用（JIT 优化障碍）**：JVM 的 JIT 编译器在优化直接调用时，会进行**内联（Inlining）**等操作。但反射调用是动态的，JIT 难以优化，并且每次调用都需要解析，导致无法进行高效的内联优化。
    

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 5.12 反射与封装是否矛盾？如何解决反射破坏封装的问题？

- **矛盾**：是的，反射与封装是矛盾的。封装要求类内部的私有（`private`）成员和方法只能在类内部访问，而反射的 `setAccessible(true)` 可以绕过这种限制，直接操作私有成员，**破坏了封装性**。
    
- **解决**：这个问题通常没有完美的“解决”方案，因为反射是 Java 的核心机制。但是，可以通过以下方式**限制**或**缓解**反射带来的风险：
    
    1. **安全管理器（Security Manager）**：在部署环境中使用 Java 安全管理器（虽然 JDK 17 以后被标记为废弃，但在企业级应用中仍有应用），可以限制代码对反射的使用。
        
    2. **谨慎使用 `setAccessible(true)`**：这是反射破坏封装的直接原因。在代码审查中应严格限制其使用范围。
        
    3. **类设计（防御性拷贝）**：如果你的类需要防止被外部代码通过反射修改内部状态，可以在返回内部对象时使用**防御性拷贝**。
        

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 5.13 Java 的动态代理如何实现？(待补充)

（待补充）

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

---

## 六、 高级特性 (SPI/语法糖)

### 6.1 什么是 SPI，和 API 有什么区别？

- **API（Application Programming Interface，应用编程接口）**：是**调用者**调用**实现者**的规范。是自上而下的。例如，Java 开发者调用 `List` 接口。
    
- **SPI（Service Provider Interface，服务提供者接口）**：是**实现者**提供给**调用者**的规范。是自下而上的。例如，数据库驱动提供者实现 `Driver` 接口。
    

**核心区别：**

|**特性**|**API**|**SPI**|
|---|---|---|
|**角色**|调用方（应用开发者）|实现方（框架或库的开发者）|
|**依赖关系**|应用依赖于 API|API/框架依赖于 SPI 的实现类|
|**设计思想**|应用程序调用接口|框架调用实现类|

**典型应用：**

- **API**：`java.util.List`
    
- **SPI**：`java.sql.Driver`（JDBC 驱动）、`java.util.ServiceLoader`、各种日志框架（如 SLF4J）
    

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 6.2 说几个常见的语法糖？

**语法糖（Syntactic Sugar）**是指在计算机语言中添加的、不影响功能，但能方便程序员使用，提高代码可读性的语法结构。它们最终会被编译器还原（解语法糖）成底层代码。

常见语法糖包括：

1. **自动装箱/拆箱**：`Integer i = 1;` 编译器自动解糖为 `Integer i = Integer.valueOf(1);`
    
2. **`for-each` 循环**：编译器自动解糖为 `Iterator` 迭代器或数组下标遍历。
    
3. **`switch` 支持 String 和 Enum**：编译器自动解糖为 `hashCode` 和 `equals` 配合的 `switch`。
    
4. **可变参数（Varargs）**：`public void test(String... args)` 编译器自动解糖为 `String[] args` 数组。
    
5. **资源自动关闭（try-with-resources）**：编译器自动生成 `finally` 块来关闭资源。
    

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 6.3 Lambda 表达式是如何实现的？

Lambda 表达式（JDK 8 引入）是通过 **`invokedynamic`** 字节码指令实现的，而不是匿名内部类。

1. **匿名内部类的问题**：如果用匿名内部类实现，会为每个 Lambda 表达式生成一个 `.class` 文件，导致类文件爆炸，加载慢。
    
2. **`invokedynamic`**：这是 JDK 7 引入的动态语言支持指令。编译器不会直接生成匿名类，而是将 Lambda 表达式编译成 `invokedynamic` 指令。
    
3. **`LambdaMetafactory`**：JVM 运行时，首次执行 `invokedynamic` 时，会调用 `LambdaMetafactory`。该工厂类会生成一个实现了函数式接口的**内部类**（被称为 **Metafactory Class**），这个内部类将 Lambda 表达式的逻辑委托给一个私有的静态方法或实例方法来执行。
    

**核心：** 延迟到运行时才生成实现函数式接口的类，且可以共享相同的实现类，效率更高。

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 6.4 while(true) 和 for(;;) 哪个性能好？

从 **JVM 字节码**角度看，两者**性能没有区别**。

- `while(true)` 编译后生成的字节码是 `goto` 指令跳转。
    
- `for(;;)` 编译后生成的字节码也是 `goto` 指令跳转。
    

现代 JVM 编译器（如 HotSpot）会把两者优化成完全一样的代码。

**建议：** 在实践中，推荐使用 **`for(;;)`**，因为它是一个被广泛接受的习惯用法，并且被认为更简洁地表达了“无限循环”的意图。

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

---

## 七、 容器、时间与并发基础

### 7.1 Stream 的并行流一定比串行流更快吗？

**不一定。**

Stream 的并行流（`parallelStream()`）是将任务分解成多个子任务，由 **`ForkJoinPool`** 中的多个线程并发执行，从而提高效率。

**并行流可能更慢的情况：**

1. **数据量小**：并行执行的拆分、合并、线程切换等开销，可能会超过串行执行节省的时间。
    
2. **数据结构不适合拆分**：例如 `ArrayList` 适合拆分，但 `LinkedList` 或 `Stream.generate` 生成的流拆分成本高。
    
3. **操作是耗时的 I/O 操作**：并行流主要用于 CPU 密集型任务。如果是 I/O 密集型任务，线程会阻塞等待，并行优势不明显。
    
4. **任务之间有依赖**：如果子任务之间需要同步或共享状态，会引入额外的同步开销。
    

**总结：** 只有在**数据量大**、**CPU 密集型**、**任务之间没有依赖**且**数据结构易于分解**时，并行流才可能更快。

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 7.2 SimpleDateFormat 是线程安全的吗？使用时应该注意什么？

**`SimpleDateFormat` 是线程不安全的。**

它的内部使用了一个 `Calendar` 对象（一个私有成员变量）来进行日期和时间的操作。当多个线程同时调用 `SimpleDateFormat` 的 `format()` 或 `parse()` 方法时，会对同一个 `Calendar` 实例进行修改，导致日期/时间结果被错误覆盖，引发数据竞争。

**使用时应该注意：**

1. **局部变量**：在每个方法内部创建新的 `SimpleDateFormat` 实例（推荐）。
    
2. **`ThreadLocal`**：使用 `ThreadLocal` 包装 `SimpleDateFormat`，确保每个线程都有自己的独立副本。
    
3. **同步**：使用 `synchronized` 关键字包裹 `format()` 或 `parse()` 调用（性能差）。
    
4. **使用新 API**：推荐使用 JDK 8 引入的线程安全的日期时间 API，如 **`DateTimeFormatter`**、`LocalDate`、`LocalDateTime` 等。
    

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 7.3 Java 中 Timer 实现定时调度的原理是什么？

`java.util.Timer` 配合 `TimerTask` 可以实现定时调度。

**原理：**

1. **单后台线程**：`Timer` 内部使用一个**单线程**（`TimerThread`）作为后台线程来执行所有 `TimerTask`。
    
2. **任务队列**：`Timer` 使用一个**最小堆（PriorityQueue）来存储待执行的 `TimerTask`，堆中的任务按照下次执行时间**进行排序。
    
3. **调度**：`TimerThread` 线程会不断地从队列头部取出最早要执行的任务。
    
    - 如果任务未到执行时间，线程就休眠到那个时间点。
        
    - 如果任务已到或已过执行时间，线程立即执行该任务。
        

**缺点（不推荐用于生产环境）：**

1. **单线程执行**：如果某个任务执行时间过长，会阻塞后续所有任务的执行。
    
2. **任务异常会终止线程**：如果 `TimerTask` 抛出未捕获的异常，`TimerThread` 就会终止，导致整个 `Timer` 停止工作，后续所有任务都无法执行。
    

**替代方案：** 生产环境应该使用功能更强大、更健壮的 **`ScheduledExecutorService`**，它解决了 Timer 的所有缺点：

Java

```
ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);

// 延迟 1 秒后执行
executor.schedule(() -> {
    System.out.println("任务执行");
}, 1, TimeUnit.SECONDS);

// 延迟 1 秒后执行，之后每隔 2 秒执行一次
executor.scheduleAtFixedRate(() -> {
    System.out.println("周期性任务");
}, 1, 2, TimeUnit.SECONDS);
```

**ScheduledExecutorService 的优势：**

- 多线程执行：可以并发执行多个任务
    
- 异常隔离：某个任务异常不会影响其他任务
    
- 更灵活的调度策略：支持固定延迟和固定频率两种模式
    
- 更好的资源管理：基于线程池，可以复用线程
    

总结：

Timer 通过优先级队列（最小堆）+ 单后台线程实现定时调度，适合简单场景。生产环境推荐使用 ScheduledExecutorService，它提供了更强大和可靠的定时调度能力。

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

---

## 八、 系统底层与 JVM

### 8.1 ClassNotFoundException 和 NoClassDefFoundError 的区别是什么？

- **`ClassNotFoundException`**：
    
    - **类型**：**检查型异常（Checked Exception）**。
        
    - **发生时机**：当程序试图通过反射（如 `Class.forName()`、`ClassLoader.loadClass()`）**动态加载**一个类，但根据类路径找不到对应的 `.class` 文件时抛出。
        
    - **处理**：应该捕获并处理。通常是程序逻辑错误（类名写错）或配置错误。
        
- **`NoClassDefFoundError`**：
    
    - **类型**：**错误（Error）**。
        
    - **发生时机**：**编译时**该类是存在的，但程序在**运行时**在类路径中找不到该类的定义时抛出。
        
    - **常见原因**：类文件在编译后被删除或移动、JAR 包缺失或版本不匹配、类的静态初始化块（Static Initializer）在加载时抛出异常导致类加载失败。
        
    - **处理**：因为是 `Error`，通常不应该捕获，它表示严重的系统级问题，应检查环境配置或依赖。
        

**核心区别总结**

1. 类型不同：`ClassNotFoundException` 是异常，`NoClassDefFoundError` 是错误。
    
2. 发生时机不同：前者发生在**动态加载**时，后者发生在**类已经编译但运行时找不到定义**时。
    
3. 处理方式不同：前者可以捕获处理，后者通常不应该捕获。
    

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 8.2 Java 中创建对象有哪些种方式？

Java 中创建对象主要有以下几种方式：

1. **`new` 关键字**：最常用的方式，直接调用类的构造方法创建对象。
    
2. **反射**：通过 `Class.forName().newInstance()` 或 `Constructor.newInstance()` 动态创建对象。
    
3. **`clone()` 方法**：通过复制现有对象创建新对象，需要实现 `Cloneable` 接口。
    
4. **序列化**：通过反序列化从字节流中恢复对象（对象创建过程中不会调用构造方法）。
    
5. **Unsafe**：通过 `sun.misc.Unsafe` 类的 `allocateInstance()` 方法直接分配内存创建对象，**不调用构造方法**（主要用于底层库或框架）。
    

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 8.3 什么是 AIO、BIO 和 NIO？(待补充)

（待补充）

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 8.4 什么是序列化与反序列化？(待补充)

（待补充）

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 8.5 Java 序列化的原理是什么？(待补充)

（待补充）

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 8.6 serialVersionUID 有何用途？如果没定义会有什么问题？(待补充)

（待补充）

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 8.7 你知道 fastjson 的反序列化漏洞吗？(待补充)

（待补充）

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

### 8.8 什么是 UUID，能保证唯一吗？(待补充)

（待补充）

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

---

## 十六、待补充问题

以下问题待补充详细答案：

### 16.1 Java 的动态代理如何实现？

（待补充）

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

---

### 16.2 Java 序列化的原理是什么？

（待补充）

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

---

### 16.3 serialVersionUID 有何用途？如果没定义会有什么问题？

（待补充）

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

---

### 16.4 你知道 fastjson 的反序列化漏洞吗？

（待补充）

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)

---

### 16.5 什么是 AIO、BIO 和 NIO？

（待补充）

[↑ 返回目录](https://www.google.com/search?q=%23table-of-contents)