
---
## 📑 目录

### 一、Java 语言特性
- [1.1 Java 和 C++ 主要有哪些区别？分别有什么优缺点？](#11-java-和-c-主要有哪些区别分别有什么优缺点)
- [1.2 如何理解面向对象和面向过程？](#12-如何理解面向对象和面向过程)
- [1.3 Java 是值传递还是引用传递？](#13-java-是值传递还是引用传递)

### 二、面向对象
- [2.1 为什么 Java 不支持多继承？](#21-为什么-java-不支持多继承)
- [2.2 接口和抽象类的区别，如何选择？](#22-接口和抽象类的区别如何选择)
- [2.3 如何理解 Java 中的多态？](#23-如何理解-java-中的多态)
- [2.4 为什么建议自定义一个无参构造函数？](#24-为什么建议自定义一个无参构造函数)
- [2.5 为什么 Java 中的 main 方法必须是 public static void 的？](#25-为什么-java-中的-main-方法必须是-public-static-void-的)
- [2.6 有了 equals 为什么还需要 hashCode 方法？](#26-有了-equals-为什么还需要-hashcode-方法)
- [2.7 反射与封装是否矛盾？如何解决反射破坏封装的问题？](#27-反射与封装是否矛盾如何解决反射破坏封装的问题)

### 三、基本类型与包装类
- [3.1 Java 中有了基本类型为什么还需要包装类？](#31-java-中有了基本类型为什么还需要包装类)
- [3.2 为什么不能用浮点数表示金额？](#32-为什么不能用浮点数表示金额)
- [3.3 为什么不能用 BigDecimal 的 equals 方法做等值比较？](#33-为什么不能用-bigdecimal-的-equals-方法做等值比较)
- [3.4 BigDecimal(double) 和 BigDecimal(String) 有什么区别？](#34-bigdecimaldouble-和-bigdecimalstring-有什么区别)
- [3.5 为什么对 Java 中的负数取绝对值结果不一定是正数？](#35-为什么对-java-中的负数取绝对值结果不一定是正数)
- [3.6 RPC 接口返回中，使用基本类型还是包装类？](#36-rpc-接口返回中使用基本类型还是包装类)
- [3.7 char 能存储中文吗？](#37-char-能存储中文吗)
- [3.8 Integer a = 1000, Integer b = 1000, a == b 是什么结果？如果是 100 呢？](#38-integer-a--1000-integer-b--1000-a--b-是什么结果如果是-100-呢)

### 四、String 类
- [4.1 String、StringBuilder 和 StringBuffer 的区别？](#41-stringstringbuilder-和-stringbuffer-的区别)
- [4.2 String 为什么设计成不可变的？](#42-string-为什么设计成不可变的)
- [4.3 String str = new String("zhc") 创建了几个对象？](#43-string-str--new-stringzhc-创建了几个对象)
- [4.4 String a = "ab"; String b = "a" + "b"; a == b 吗？](#44-string-a--ab-string-b--a--b-a--b-吗)
- [4.5 String 有长度限制吗？是多少？](#45-string-有长度限制吗是多少)
- [4.6 字符串常量是什么时候进入到字符串常量池的？](#46-字符串常量是什么时候进入到字符串常量池的)
- [4.7 为什么 JDK 9 中把 String 的 char[] 改成了 byte[]？](#47-为什么-jdk-9-中把-string-的-char-改成了-byte)
- [4.8 String 是如何实现不可变的？](#48-string-是如何实现不可变的)
- [4.9 怎么修改一个类中的 private 修饰的 String 参数的值？](#49-怎么修改一个类中的-private-修饰的-string-参数的值)
- [4.10 JDK 9 中对字符串拼接做了什么优化？](#410-jdk-9-中对字符串拼接做了什么优化)

### 五、泛型
- [5.1 什么是泛型？有什么好处？](#51-什么是泛型有什么好处)
- [5.2 什么是类型擦除？](#52-什么是类型擦除)
- [5.3 泛型中 K T V E ? Object 等分别代表什么含义？](#53-泛型中-k-t-v-e--object-等分别代表什么含义)
- [5.4 泛型中上下界限定符 extends 和 super 有什么区别？](#54-泛型中上下界限定符-extends-和-super-有什么区别)

### 六、异常处理
- [6.1 Java 中异常分哪两类？有什么区别？](#61-java-中异常分哪两类有什么区别)
- [6.2 finally 中的代码一定会执行吗？](#62-finally-中的代码一定会执行吗)
- [6.3 try 中 return A，catch 中 return B，finally 中 return C，最终返回值是什么？](#63-try-中-return-acatch-中-return-bfinally-中-return-c最终返回值是什么)
- [6.4 final、finally、finalize 有什么区别？](#64-finalfinallyfinalize-有什么区别)
- [6.5 为什么不建议使用异常控制业务流程？](#65-为什么不建议使用异常控制业务流程)

### 七、注解与反射
- [7.1 Java 注解的作用是什么？](#71-java-注解的作用是什么)
- [7.2 什么是反射机制？为什么反射慢？](#72-什么是反射机制为什么反射慢)

### 八、枚举
- [8.1 Java 中的枚举有什么特点和好处？](#81-java-中的枚举有什么特点和好处)

### 九、编码与字符集
- [9.1 常见的字符编码有哪些？有什么区别？](#91-常见的字符编码有哪些有什么区别)

### 十、语法糖
- [10.1 说几个常见的语法糖？](#101-说几个常见的语法糖)
- [10.2 Lambda 表达式是如何实现的？](#102-lambda-表达式是如何实现的)
- [10.3 while(true) 和 for(;;) 哪个性能好？](#103-whiletrue-和-for-哪个性能好)

### 十一、SPI 机制
- [11.1 什么是 SPI，和 API 有什么区别？](#111-什么是-spi和-api-有什么区别)

### 十二、集合与 Stream
- [12.1 Stream 的并行流一定比串行流更快吗？](#121-stream-的并行流一定比串行流更快吗)

### 十三、日期时间
- [13.1 SimpleDateFormat 是线程安全的吗？使用时应该注意什么？](#131-simpledateformat-是线程安全的吗使用时应该注意什么)

### 十四、类加载与对象创建
- [14.1 ClassNotFoundException 和 NoClassDefFoundError 的区别是什么？](#141-classnotfoundexception-和-noclassdeffounderror-的区别是什么)
- [14.2 Java 中创建对象有哪些种方式？](#142-java-中创建对象有哪些种方式)

### 十五、定时任务
- [15.1 Java 中 Timer 实现定时调度的原理是什么？](#151-java-中-timer-实现定时调度的原理是什么)

### 十六、待补充问题
- [16.1 Java 的动态代理如何实现？](#161-java-的动态代理如何实现)
- [16.2 Java 序列化的原理是什么？](#162-java-序列化的原理是什么)
- [16.3 serialVersionUID 有何用途？如果没定义会有什么问题？](#163-serialversionuid-有何用途如果没定义会有什么问题)
- [16.4 你知道 fastjson 的反序列化漏洞吗？](#164-你知道-fastjson-的反序列化漏洞吗)
- [16.5 什么是 AIO、BIO 和 NIO？](#165-什么是-aiobio-和-nio)
- [16.6 什么是深拷贝和浅拷贝？](#166-什么是深拷贝和浅拷贝)
- [16.7 什么是 UUID，能保证唯一吗？](#167-什么是-uuid能保证唯一吗)
- [16.8 String 中 intern 的原理是什么？](#168-string-中-intern-的原理是什么)
- [16.9 什么是序列化与反序列化？](#169-什么是序列化与反序列化)
- [16.10 为什么建议多用组合少用继承？](#1610-为什么建议多用组合少用继承)
- [16.11 BigDecimal 和 Long 表示金额哪个更合适，怎么选择？](#1611-bigdecimal-和-long-表示金额哪个更合适怎么选择)

---

## 一、Java 语言特性


### 1.1 Java 和 C++ 主要有哪些区别？分别有什么优缺点？


Java 是平台无关的语言，通过 JVM 实现"一次编写，到处运行"；而 C++ 是平台相关的，需要针对不同平台编译。

在内存管理上，Java 通过 GC 实现自动内存管理，C++ 则需要手动使用 new/delete 管理内存。

参数传递方面，Java 只支持值传递，C++ 支持值传递、指针传递和引用传递。

继承方式上，Java 只支持单继承，C++ 既支持单继承又支持多继承。

底层控制能力方面，Java 不能直接操作内存，C++ 可以直接操作内存和硬件。

执行方式上，Java 是解释型语言，通过编译器编译成字节码再由 JVM 解释执行；C++ 是编译型语言，直接编译成机器码。

Java 的优点包括平台无关性强、生态丰富、社区支持完善、垃圾回收器降低内存泄露风险。缺点是：启动速度较慢、内存占用较大、性能不如 C++、底层控制能力弱。

C++ 的优点包括性能高效、能直接操作内存和硬件、图形和音频库支持丰富。缺点是：内存管理复杂、学习曲线陡峭、容易造成内存泄露、跨平台开发困难。

---

### 1.2 如何理解面向对象和面向过程？

面向过程和面向对象是两种不同的编程思维方式。

面向过程更关注"怎么做"，类似流水线式作业。在解决问题时，将问题分解成一系列步骤，按顺序执行这些步骤来完成任务。

面向对象更关注"谁来做"，类似团队协作。在解决问题时，将问题分解成多个对象，每个对象负责特定的职责，通过对象间的协作来解决问题。

---

### 1.3 Java 是值传递还是引用传递？

Java 只有值传递，没有引用传递。这是一个容易混淆的概念，需要分情况理解：

**对于基本数据类型**：传递的是数值的副本。方法内对参数的修改不会影响原变量。比如传入一个 int 类型的变量，方法内修改这个参数，外部的原变量不会改变。

**对于引用数据类型**：传递的是引用地址的副本。这里容易产生误解，看起来像引用传递，但本质上传递的是引用值的拷贝。具体来说：

- 方法接收到的是对象引用的一个副本，这个副本和原引用指向同一个对象
- 通过这个副本可以修改对象的内容，所以外部能看到对象内部状态的变化
- 但如果在方法内给参数重新赋值（指向新对象），不会影响外部的原引用

举个例子：

```java
public void test(StringBuilder sb) {
    sb.append("world");  // 修改对象内容，外部可见
    sb = new StringBuilder("new");  // 重新赋值，外部不可见
}

StringBuilder sb = new StringBuilder("hello");
test(sb);
System.out.println(sb);  // 输出 "helloworld"，不是 "new"
```

这个例子说明：传递的是引用的副本，而不是引用本身。如果是真正的引用传递，重新赋值应该会影响外部变量。

---

## 二、面向对象


### 2.1 为什么 Java 不支持多继承？

Java 不支持多继承主要是为了避免**菱形继承**问题，同时保持**语言的简洁性**。

菱形继承是指：当 B、C 两个类同时继承了 A 类，D 类又同时继承了 B、C 类时，A 类的方法在 D 类中会出现两次。如果 A 类有一个方法，B 和 C 都重写了它，那么 D 继承时应该使用哪个版本？这会导致方法调用的二义性。C++ 支持多继承，为了解决菱形继承问题引入了虚继承，大大提高了语言的复杂度。

不支持多继承的好处包括：保持语言的简洁性、避免方法调用的歧义、降低类之间的耦合、防止子类过于臃肿（继承一些不必要的功能）。

---

### 2.2 接口和抽象类的区别，如何选择？

接口和抽象类的主要区别在于：

接口中的方法默认是 public abstract 的，只能定义常量（public static final），没有构造方法，一个类可以实现多个接口。

抽象类可以有抽象方法和具体方法，可以有实例变量和构造方法，但一个类只能继承一个抽象类。

在选择上，如果需要代码复用、共享状态或者表达"是什么"的 is-a 关系，就用抽象类；如果是为了定义行为规范、需要多继承或者表达"能做什么"的 can-do 关系，就用接口。

抽象类侧重于代码复用，接口侧重于定义规范。实际开发中接口使用更频繁，因为更灵活。

---

### 2.3 如何理解 Java 中的多态？

Java 多态是指同一操作作用于不同的对象，可以有不同的解释，产生不同的结果。

多态发生有三个必要条件：继承或实现接口、重写父类或接口的方法、父类的引用指向子类的对象。

举个例子：

```java
List<Integer> list = new ArrayList<>();
list.add(1);
```

虽然局部变量 list 的引用类型是 List，但实际执行的是 ArrayList 类的 add 方法。

多态提高了代码的扩展性和灵活性，可以用统一的接口操作不同的对象，降低了代码的耦合度。

---

### 2.4 为什么建议自定义一个无参构造函数？

在 Java 中，建议显式定义无参构造函数主要有以下几个原因：

---

**1. 子类构造器的默认行为**

子类的构造器会默认调用父类的无参构造函数。如果父类没有无参构造函数，子类必须显式调用父类的有参构造函数，否则编译报错。

**示例：**

```java
// 父类
public class Parent {
    private String name;
    
    // 只定义了有参构造函数，没有无参构造函数
    public Parent(String name) {
        this.name = name;
    }
}

// 子类
public class Child extends Parent {
    // 编译错误！因为父类没有无参构造函数
    public Child() {
        // 默认会调用 super()，但父类没有无参构造函数
    }
    
    // 正确做法：显式调用父类的有参构造函数
    public Child(String name) {
        super(name);  // 必须显式调用
    }
}
```

**解决方案：**

在父类中提供无参构造函数，子类就可以自由选择：

```java
public class Parent {
    private String name;
    
    // 提供无参构造函数
    public Parent() {
        this.name = "default";
    }
    
    public Parent(String name) {
        this.name = name;
    }
}

public class Child extends Parent {
    // 现在可以正常编译了
    public Child() {
        // 默认调用 super()
    }
}
```

---

**2. 序列化和反序列化的要求**

很多序列化框架（如 Jackson、Gson、Hibernate）在反序列化时，会先通过反射调用无参构造函数创建对象，然后再通过反射设置字段值。

**示例：**

```java
public class User {
    private String name;
    private int age;
    
    // 如果没有无参构造函数，反序列化会失败
    public User() {
    }
    
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // getter 和 setter
}

// 使用 Jackson 反序列化
String json = "{\"name\":\"张三\",\"age\":25}";
ObjectMapper mapper = new ObjectMapper();
User user = mapper.readValue(json, User.class);  // 需要无参构造函数
```

**如果没有无参构造函数：**

```java
public class User {
    private String name;
    private int age;
    
    // 只有有参构造函数
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// 反序列化会报错
// com.fasterxml.jackson.databind.exc.InvalidDefinitionException: 
// Cannot construct instance of `User` (no Creators, like default constructor, exist)
```

---

 **3. JavaBean 规范要求**

JavaBean 规范明确要求：

- 必须有一个公共的无参构造函数
- 属性必须是私有的
- 必须提供 getter 和 setter 方法
- 必须实现 Serializable 接口（可选）

**标准 JavaBean：**

```java
public class Person implements Serializable {
    private String name;
    private int age;
    
    // 必须：公共无参构造函数
    public Person() {
    }
    
    // 可选：有参构造函数
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // 必须：getter 和 setter
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
```

---

 **4. 框架和工具的兼容性**

许多 Java 框架和工具都依赖无参构造函数：

- **Spring**：通过反射创建 Bean 时默认使用无参构造函数
- **Hibernate/JPA**：实体类必须有无参构造函数
- **MyBatis**：结果映射时需要无参构造函数
- **各种 ORM 框架**：都需要通过无参构造函数创建对象

**示例（JPA 实体类）：**

```java
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    
    // JPA 要求必须有无参构造函数
    public User() {
    }
    
    public User(String username) {
        this.username = username;
    }
}
```

---

 **5. 反射操作的便利性**

使用反射创建对象时，如果有无参构造函数会更加方便：

```java
// 有无参构造函数：简单
Class<?> clazz = User.class;
User user = (User) clazz.newInstance();  // 或 clazz.getDeclaredConstructor().newInstance()

// 没有无参构造函数：复杂
Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
User user = (User) constructor.newInstance("张三", 25);
```

---

 **重要提醒**

**Java 的默认行为：**

- 如果类中**没有定义任何构造函数**，编译器会自动生成一个公共的无参构造函数
- 如果类中**定义了有参构造函数**，编译器就**不会**自动生成无参构造函数

**示例：**

```java
// 情况1：没有定义任何构造函数
public class A {
    private String name;
    // 编译器自动生成：public A() {}
}

// 情况2：定义了有参构造函数
public class B {
    private String name;
    
    public B(String name) {  // 定义了有参构造函数
        this.name = name;
    }
    // 编译器不会生成无参构造函数！
}

// 使用
A a = new A();  // 正常
B b = new B();  // 编译错误！没有无参构造函数
```

---

**最佳实践**

1. **总是显式定义无参构造函数**：即使编译器会自动生成，也建议显式定义，提高代码可读性

2. **如果定义了有参构造函数，一定要同时定义无参构造函数**：

```java
public class User {
    private String name;
    private int age;
    
    // 显式定义无参构造函数
    public User() {
    }
    
    // 有参构造函数
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

3. **使用 Lombok 简化**：

```java
@Data
@NoArgsConstructor  // 生成无参构造函数
@AllArgsConstructor  // 生成全参构造函数
public class User {
    private String name;
    private int age;
}
```

---

 **总结**

建议自定义无参构造函数的原因：

1. **继承需要**：子类构造器默认调用父类无参构造函数
2. **序列化需要**：反序列化框架需要通过无参构造函数创建对象
3. **规范要求**：JavaBean 规范明确要求
4. **框架兼容**：Spring、Hibernate 等框架依赖无参构造函数
5. **反射便利**：使用反射创建对象更方便

**记住：一旦定义了有参构造函数，就一定要同时定义无参构造函数！**

---

### 2.5 为什么 Java 中的 main 方法必须是 public static void 的？

Java 的 main 方法必须遵循固定的签名格式：`public static void main(String[] args)`，这是为了满足 JVM 的调用需要。

---

 **为什么是 public？**

**原因：让 JVM 能够从外部访问 main 方法**

- JVM 需要从类的外部调用 main 方法来启动程序
- 如果 main 方法不是 public，JVM 无法访问它，程序无法启动
- public 确保了 JVM 可以在任何地方调用 main 方法，而不受访问权限限制

**错误示例：**

```java
public class Test {
    // 错误：private 或 protected 或 默认访问权限
    private static void main(String[] args) {
        System.out.println("Hello");
    }
}

// 运行时错误：
// Error: Main method not found in class Test
```

---

 **为什么是 static？**

**原因：避免创建对象，直接通过类调用**

- JVM 启动程序时，还没有创建任何对象
- 如果 main 方法不是 static，JVM 需要先创建类的实例才能调用 main 方法
- 但 JVM 不知道如何创建这个实例（需要什么参数？调用哪个构造函数？）
- static 方法属于类本身，可以直接通过类名调用，不需要创建对象

**对比：**

```java
// 正确：static 方法，JVM 可以直接调用
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
// JVM 调用：Test.main(args)

// 错误：非 static 方法
public class Test {
    public void main(String[] args) {
        System.out.println("Hello");
    }
}
// JVM 无法调用，因为需要先创建 Test 对象
// 但 JVM 不知道如何创建：new Test()? new Test(参数)?
```

---

**为什么是 void？**

**原因：JVM 不需要 main 方法的返回值**

- main 方法是程序的入口点，它的返回值对 JVM 没有意义
- 程序的退出状态通过 `System.exit(int status)` 来设置，而不是通过返回值
- void 表示方法不返回任何值，符合 main 方法的语义

**与 C/C++ 的对比：**

```c
// C/C++ 的 main 函数有返回值
int main(int argc, char* argv[]) {
    printf("Hello, World!\n");
    return 0;  // 返回 0 表示成功，非 0 表示错误
}
// 返回值可以被操作系统或调用程序获取
```

```java
// Java 的 main 方法没有返回值
public static void main(String[] args) {
    System.out.println("Hello, World!");
    // 不需要返回值
    // 如果需要设置退出状态，使用 System.exit(0)
}
```

**为什么 Java 不需要返回值？**

1. **Java 程序运行在 JVM 中**：JVM 是一个独立的进程，Java 程序不会被外部程序直接调用
2. **退出状态通过 System.exit() 设置**：
   ```java
   public static void main(String[] args) {
       try {
           // 业务逻辑
           System.exit(0);  // 成功退出
       } catch (Exception e) {
           System.exit(1);  // 异常退出
       }
   }
   ```
3. **C/C++ 需要返回值**：因为 C/C++ 程序可能被 shell 脚本或其他程序调用，需要通过返回值判断执行结果

---

**为什么参数是 String\[] args？**

**原因：接收命令行参数**

- args 是一个字符串数组，用于接收命令行传入的参数
- 参数名可以是任意的（args、arguments、a 等），但习惯上使用 args
- 数组类型必须是 String[]

**示例：**

```java
public class CommandLineDemo {
    public static void main(String[] args) {
        System.out.println("参数个数：" + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("参数 " + i + ": " + args[i]);
        }
    }
}
```

**运行：**

```bash
java CommandLineDemo hello world 123

# 输出：
# 参数个数：3
# 参数 0: hello
# 参数 1: world
# 参数 2: 123
```

---


**可以重载 main 方法吗？**

**可以，但只有标准签名的 main 方法会被 JVM 调用**

```java
public class MainOverload {
    // 标准 main 方法，JVM 会调用这个
    public static void main(String[] args) {
        System.out.println("标准 main 方法");
        main(10);  // 手动调用重载的 main 方法
    }
    
    // 重载的 main 方法，不会被 JVM 自动调用
    public static void main(int num) {
        System.out.println("重载的 main 方法：" + num);
    }
    
    // 另一个重载
    public static void main(String arg) {
        System.out.println("另一个重载：" + arg);
    }
}

// 输出：
// 标准 main 方法
// 重载的 main 方法：10
```

---

 **Java 21+ 的简化（预览特性）**

Java 21 引入了简化的 main 方法（预览特性），用于简单的程序：

```java
// Java 21+ 可以这样写（预览特性）
void main() {
    System.out.println("Hello, World!");
}
// 不需要 public static，不需要 String[] args
// 但这只是语法糖，编译器会自动转换为标准格式
```

---

### 2.6 有了 equals 为什么还需要 hashCode 方法？

这是一个非常重要的面试题，涉及到 Java 对象相等性判断和哈希表的工作原理。

**核心原因：为了保证哈希表（HashMap、HashSet 等）的正确性和性能。**

### 2.7 反射与封装是否矛盾？如何解决反射破坏封装的问题？

反射虽然会打破封装，但并不矛盾，两者是为了不同的目的而设计的。

封装是面向对象的三大特征之一，目的是对内隐藏实现细节、对外暴露安全接口，保护类的内部状态不被随意访问和修改。而反射是 Java 提供的在运行时动态获取类信息、操作类成员的机制，它的设计初衷是为了提供灵活性和扩展性。

虽然反射会导致性能下降，但在某些特定场景下是必需的，比如框架设计（Spring、MyBatis）、序列化和反序列化、JDK 动态代理、注解处理等。这些场景需要在运行时动态操作对象，如果没有反射，很多强大的功能都无法实现。

**如何解决反射带来的安全问题？**

第一，遵循最小化反射原则。只在必须使用反射的地方才使用，能用普通方法调用就不用反射。核心业务逻辑尽量避免使用反射，将反射操作限制在框架层或工具类中。

第二，建立反射白名单机制。明确哪些类、哪些方法允许被反射访问，限定反射的范围。可以通过配置文件或注解来标记允许反射的类和方法，在运行时进行检查。

第三，严格的代码审查。在 Code Review 时对反射代码进行严格审查，确保反射的使用是合理且必要的。检查是否有更好的替代方案，评估反射带来的性能影响和安全风险。

第四，使用安全管理器。在需要高安全性的环境中，可以通过 Java 安全管理器（SecurityManager）限制反射操作，禁止对敏感类和方法的反射访问。

第五，日志和监控。对反射操作进行日志记录，监控反射的使用情况，及时发现异常的反射行为。

总的来说，反射和封装并不矛盾，而是在不同层面服务于不同的目的。合理使用反射，配合必要的安全措施，可以在保证灵活性的同时，最大程度地维护封装性和安全性。

---


---

**Java 的约定（equals 和 hashCode 契约）**

Java 规定了 equals 和 hashCode 之间必须遵守的契约：

1. **如果两个对象 equals 相等，那么它们的 hashCode 必须相同**
2. **如果两个对象 hashCode 相同，它们不一定 equals 相等**（哈希冲突）
3. **如果重写了 equals 方法，就必须重写 hashCode 方法**

**用一句话总结：**
- equals 相等 → hashCode 必须相同
- hashCode 相同 → equals 不一定相等

---

 **为什么需要 hashCode？**

**1. 提高性能**

hashCode 提供了一种快速定位对象的方式。HashMap、HashSet 等集合使用哈希表存储数据，查找过程分两步：

```
第一步：通过 hashCode() 快速定位到桶（bucket）- O(1)
第二步：在桶内通过 equals() 精确比较 - O(k)，k 是桶内元素数量
```

如果没有 hashCode，就需要遍历所有元素用 equals 逐个比较，时间复杂度是 O(n)。

**2. 保证数据准确性**

equals 相等的对象必须有相同的 hashCode，这样才能保证在哈希表中能正确找到对象。

---

 **如果只重写 equals 不重写 hashCode 会怎样？**

**问题示例：**

```java
public class Person {
    private String name;
    private int age;
    
    // 只重写了 equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }
    
    // 没有重写 hashCode，使用 Object 的默认实现（基于内存地址）
}

// 使用
Person p1 = new Person("张三", 25);
Person p2 = new Person("张三", 25);

System.out.println(p1.equals(p2));  // true，equals 判断相等

// 放入 HashMap
HashMap<Person, String> map = new HashMap<>();
map.put(p1, "工程师");
System.out.println(map.get(p2));  // null！无法获取到值
```

**为什么 get 返回 null？**

1. p1 和 p2 虽然 equals 相等，但 hashCode 不同（基于不同的内存地址）
2. put(p1) 时，根据 p1.hashCode() 存储在某个桶中
3. get(p2) 时，根据 p2.hashCode() 去另一个桶中查找
4. 两个桶不同，所以找不到，返回 null

**这违反了 Java 的契约，导致哈希表无法正常工作！**

---

 **正确的做法：同时重写 equals 和 hashCode**

```java
public class Person {
    private String name;
    private int age;
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, age);  // 使用相同的字段计算 hashCode
    }
}

// 使用
Person p1 = new Person("张三", 25);
Person p2 = new Person("张三", 25);

System.out.println(p1.equals(p2));  // true
System.out.println(p1.hashCode() == p2.hashCode());  // true

HashMap<Person, String> map = new HashMap<>();
map.put(p1, "工程师");
System.out.println(map.get(p2));  // "工程师"，正常工作！
```

---

 **hashCode 的设计原则**

1. **一致性**：同一个对象多次调用 hashCode() 必须返回相同的值
2. **相等性**：equals 相等的对象，hashCode 必须相同
3. **高效性**：hashCode 的计算应该快速
4. **分散性**：不同对象的 hashCode 应该尽量分散，减少哈希冲突

**推荐的 hashCode 实现：**

```java
@Override
public int hashCode() {
    // 推荐：使用 Objects.hash() 工具方法
    return Objects.hash(name, age, email);
}

// 或者使用 Lombok
@Data  // 自动生成 equals、hashCode、getter、setter 等
public class Person {
    private String name;
    private int age;
}
```

---

 **总结**

**为什么需要 hashCode？**

1. **性能优化**：提供快速定位能力，O(1) 时间复杂度
2. **契约要求**：equals 相等的对象必须有相同的 hashCode
3. **哈希表正确性**：保证 HashMap、HashSet 等集合正常工作
4. **数据准确性**：确保逻辑上相等的对象在哈希表中能被正确找到

**记住三个原则：**
1. equals 相等 → hashCode 必须相同
2. hashCode 相同 → equals 不一定相等
3. 重写 equals 必须重写 hashCode

**最佳实践：**
- 使用 IDE 或 Lombok 自动生成
- 使用 `Objects.hash()` 工具方法
- equals 和 hashCode 使用相同的字段

## 三、基本类型与包装类


### 3.1 Java 中有了基本类型为什么还需要包装类？

Java 是面向对象的编程语言，更多场景需要使用对象而不是基本类型。

比如集合（List、Map 等）只能存储对象，不能直接存储基本类型，这时候就必须用包装类。同时，包装类还提供了很多实用方法，比如类型转换、获取最大最小值等，并且支持自动装箱和拆箱，使用起来很方便。

总的来说，包装类让基本类型具备了对象的特性，使其能够适应面向对象编程的各种场景。

---

### 3.2 为什么不能用浮点数表示金额？

不能用浮点数表示金额主要是因为浮点数存在精度问题。

浮点数采用 IEEE 754 标准，使用符号位、指数位和尾数位来表示。这种设计可以用有限的内存空间表示更大范围的数值，但代价是存储的是近似值而非精确值。

比如 0.1 + 0.2 在计算机中并不等于 0.3，而是 0.30000000000000004，这种误差在金额计算中会累积放大，导致严重的错误。

因此，在金额这种对精度要求极高的场景下，应该使用 BigDecimal 类来进行精确计算，它采用十进制表示，可以完全避免精度丢失的问题。

---

### 3.3 为什么不能用 BigDecimal 的 equals 方法做等值比较？

主要原因是 equals 方法不仅会比较数值本身，还会比较标度（scale）。

举个例子，new BigDecimal("1.0") 和 new BigDecimal("1.00")，虽然它们的数值相等，但标度不同——前者标度是 1，后者标度是 2，所以用 equals 比较会返回 false，这显然不符合我们的预期。

正确的做法是使用 compareTo 方法，它只比较数值大小，不考虑标度。当 compareTo 返回 0 时，表示两个 BigDecimal 的数值相等。

---

### 3.4 BigDecimal(double) 和 BigDecimal(String) 有什么区别？

这两个构造方法最大的区别在于精度问题。

使用 BigDecimal(double) 构造方法时，传入的 double 值本身就已经存在精度丢失了。比如 new BigDecimal(0.3)，你可能以为得到的是 0.3，但实际上得到的是 0.30000000000000004，这是因为 double 类型遵循 IEEE 754 标准，无法精确表示 0.3。

而使用 BigDecimal(String) 构造方法，比如 new BigDecimal("0.3")，得到的就是精确的 0.3，标度也是符合预期的 1。

所以在实际开发中，特别是涉及金融计算的场景，我们应该始终使用字符串构造方法来创建 BigDecimal 对象，避免精度问题。

---

### 3.5 为什么对 Java 中的负数取绝对值结果不一定是正数？

这个问题的根源在于 Java 整数类型的取值范围是不对称的。

以 byte 类型为例，它的取值范围是 [-128, 127]。你会发现负数可以表示到 -128，但正数只能表示到 127。这是因为在二进制补码表示法中，0 占用了一个正数的位置，导致负数比正数多一个。

所以当我们对 -128 取绝对值时，理论上应该得到 128，但 128 超出了 byte 的最大值 127，就会发生溢出，结果还是 -128。这个问题在所有 Java 整数类型中都存在。

解决方法是在取绝对值之前，先将类型向上转型：

```java
byte b = -128;
int abs = Math.abs((int)b);  // 结果是 128，正确
```

或者更安全的做法是，在业务逻辑中先判断是否是最小值，避免这种边界情况的出现。

---

### 3.6 RPC 接口返回中，使用基本类型还是包装类？

推荐使用包装类，主要有以下几个原因：

第一，避免语义歧义。基本类型都有默认值，比如 int 默认是 0，boolean 默认是 false。当 RPC 接口返回 0 或 false 时，你无法判断这是业务逻辑正常返回的值，还是因为字段未赋值而产生的默认值。

第二，明确表达"无值"状态。包装类可以用 null 来表示"无值"或"未知"的状态，这在很多业务场景下是必要的。比如：用户未填写某个可选字段、数据库中该字段为 NULL、远程调用失败未获取到数据。这些情况用 null 表示比用默认值更清晰、更准确。

---

### 3.7 char 能存储中文吗？

char 可以存储中文，但只能存储大部分常用中文字符。

Java 中的 char 类型使用 2 个字节（16 位）来存储一个字符，采用 UTF-16 编码。这意味着 char 可以表示 Unicode 基本多文种平面（BMP）中的字符，范围是 U+0000 到 U+FFFF，共 65536 个字符。大部分常用的中文汉字都在这个范围内，所以可以正常存储。

举个例子：

```java
char c1 = '中';
char c2 = '文';
System.out.println(c1 + " " + c2);  // 输出：中 文
```

但需要注意的是，一些生僻字、emoji 表情符号等超出了 BMP 范围，它们的 Unicode 码点大于 U+FFFF，需要用两个 char（即一个代理对）来表示，单个 char 无法存储。比如 emoji "😀" 的码点是 U+1F600，超出了 char 的表示范围。

所以准确的说法是：char 可以存储 Unicode BMP 范围内的字符，包括绝大多数常用中文，但无法存储超出这个范围的生僻字和特殊符号。如果需要处理所有 Unicode 字符，应该使用 String 类型。

---

### 3.8  Integer a = 1000, Integer b = 1000, a == b 是什么结果？如果是 100 呢？

当 a、b 的值都是 1000 时，`a == b` 返回 **false**；当 a、b 的值都是 100 时，`a == b` 返回 **true**。

这是因为 Integer 类内部有一个静态内部类 IntegerCache，它会缓存 -128 到 127 之间的 Integer 对象。当我们使用自动装箱创建 Integer 对象时，如果值在这个范围内，会直接返回缓存中的对象；如果超出这个范围，则会创建新的对象。

由于 `==` 比较的是对象的引用地址，而不是对象的值，所以：

- 当值为 100 时，a 和 b 都指向缓存中的同一个对象，`a == b` 返回 true
- 当值为 1000 时，a 和 b 是两个不同的对象，`a == b` 返回 false

**代码示例：**

```java
// 值在缓存范围内（-128 到 127）
Integer a = 100;
Integer b = 100;
System.out.println(a == b);  // true，指向同一个缓存对象

// 值超出缓存范围
Integer c = 1000;
Integer d = 1000;
System.out.println(c == d);  // false，创建了两个不同的对象

// 使用 equals 比较值
System.out.println(c.equals(d));  // true，比较的是值
```

**IntegerCache 的实现：**

```java
private static class IntegerCache {
    static final int low = -128;
    static final int high = 127;
    static final Integer cache[];

    static {
        // 创建缓存数组
        cache = new Integer[(high - low) + 1];
        int j = low;
        for(int k = 0; k < cache.length; k++)
            cache[k] = new Integer(j++);
    }
}

public static Integer valueOf(int i) {
    // 如果在缓存范围内，返回缓存对象
    if (i >= IntegerCache.low && i <= IntegerCache.high)
        return IntegerCache.cache[i + (-IntegerCache.low)];
    // 否则创建新对象
    return new Integer(i);
}
```

**重要提醒：**

1. **比较 Integer 的值应该用 equals**，而不是 `==`，因为 `==` 比较的是引用地址
2. **其他包装类也有类似的缓存机制**：
   - Byte、Short、Integer、Long：缓存 -128 到 127
   - Character：缓存 0 到 127
   - Boolean：缓存 true 和 false
3. **自动装箱会调用 valueOf 方法**，所以会使用缓存
4. **使用 new Integer() 不会使用缓存**，总是创建新对象（但这种方式已被废弃）

**最佳实践：**

```java
// 推荐：使用 equals 比较值
Integer a = 1000;
Integer b = 1000;
if (a.equals(b)) {  // 正确
    System.out.println("值相等");
}

// 不推荐：使用 == 比较包装类
if (a == b) {  // 错误！可能得到意外结果
    System.out.println("引用相等");
}

// 如果需要比较引用，应该明确说明
if (a == b) {
    System.out.println("指向同一个对象");
}
```

---

## 四、String 类

### 4.1 String、StringBuilder 和 StringBuffer 的区别？

主要从三个角度来说：可变性、线程安全性和性能。

首先是可变性。String 是不可变的，一旦创建就不能修改，每次对 String 的操作实际上都会创建新的对象。而 StringBuilder 和 StringBuffer 是可变的，可以在原对象上进行修改，不会产生新对象。

其次是线程安全性。StringBuffer 是线程安全的，它的方法都加了 synchronized 关键字，所以在多线程环境下可以安全使用。而 String 不可变，这种不可变性天然保证了线程安全。StringBuilder 是线程不安全的，它没有同步机制，不适合在多线程环境下使用。

最后是性能。正因为 StringBuffer 的方法都加了同步锁，所以性能相对较低。StringBuilder 没有同步开销，性能最好。String 由于不可变，频繁操作会产生大量临时对象，性能最差。

使用建议：单线程环境下频繁字符串拼接用 StringBuilder，多线程环境下需要字符串拼接用 StringBuffer，字符串内容不变或偶尔拼接用 String 就够了。

---

### 4.2 String 为什么设计成不可变的？

String 设计成不可变主要是出于以下几个方面的考虑：

第一，支持字符串常量池。Java 中有字符串常量池的概念，多个引用可以指向池中的同一个字符串对象。如果 String 是可变的，那么一个引用修改了字符串内容，其他引用指向的内容也会跟着变化，这显然是不可接受的。只有不可变，字符串常量池才有意义，才能实现字符串的复用，节省内存。

第二，保证安全性。String 经常被用作参数传递，比如网络连接、文件路径、数据库连接等敏感操作。如果 String 是可变的，在传递过程中内容可能被篡改，会带来严重的安全隐患。不可变性让我们可以放心地传递和使用字符串。

第三，天然的线程安全。因为 String 对象创建后内容不能改变，所以多个线程同时访问同一个 String 对象时，不需要任何同步机制，天然就是线程安全的。

第四，支持 hashCode 缓存。String 类中有一个 hash 字段用来缓存 hashCode 值。因为内容不可变，所以 hashCode 只需要计算一次就可以缓存起来，后续直接使用。这对于 String 作为 HashMap 的 key 等场景非常重要，能显著提升性能。

第五，整体性能优化。正是因为有了字符串常量池和 hashCode 缓存这些机制，String 类在实际使用中的性能表现非常好。

---

### 4.3 String str = new String("zhc") 创建了几个对象？

分两种情况：

情况一：字符串常量池中已经存在 "zhc"

这种情况下只会创建 1 个对象，就是通过 new 关键字在堆内存中创建的 String 对象。字符串常量池中的 "zhc" 已经存在，不需要再创建。

情况二：字符串常量池中不存在 "zhc"

这种情况下会创建 2 个对象：第一个对象是在字符串常量池中创建字符串字面量 "zhc"，第二个对象是通过 new 关键字在堆内存中创建 String 对象。

需要注意的是，这两个对象是不同的。堆中的 String 对象会引用字符串常量池中的 "zhc"，但它们的内存地址是不同的。

---

### 4.4 String a = "ab"; String b = "a" + "b"; a == b 吗？

答案是 true，a == b。

这里触发了 Java 编译器非常重要的优化——常量折叠（Constant Folding）。

当我们写 String b = "a" + "b" 时，因为 "a" 和 "b" 都是字符串字面量常量，编译器在编译阶段就会将这个表达式优化为 String b = "ab"。也就是说，编译后的字节码中，这两行代码实际上是一样的。

由于都是字符串字面量，它们都会被放入字符串常量池中。根据字符串常量池的机制，相同内容的字符串只会存在一份，所以 a 和 b 实际上指向的是常量池中同一个 "ab" 对象。

因为 == 比较的是对象的引用地址，而 a 和 b 指向同一个对象，所以 a == b 返回 true。

需要注意的对比情况：如果涉及变量拼接，结果就不同了：

```java
String s1 = "a";
String s2 = "b";
String c = s1 + s2;  // 变量拼接，会在堆中创建新对象
String a = "ab";
System.out.println(a == c);  // false，因为 c 指向堆，a 指向常量池
```

这是因为变量拼接在编译期无法确定值，只能在运行时通过 StringBuilder 来完成，会创建新的对象。

---

### 4.5 String 有长度限制吗？是多少？

String 是有长度限制的，而且在编译期和运行期的限制是不一样的。

编译期限制：65534 字符

在编译期，字符串字面量的长度受到 class 文件格式的限制。在 class 文件的常量池中，字符串常量使用 CONSTANT_Utf8_info 结构存储，其中长度字段是 u2 类型，占 2 个字节，所以理论上最大值是 2^16-1 = 65535。如果你在代码中写一个超过这个长度的字符串字面量，编译器会直接报错："constant string too long"。

运行期限制：2^31-1 字符

在运行期，String 的长度限制取决于 String 类的实现。String 内部使用 char 数组（Java 9 之后是 byte 数组）来存储字符，而数组的最大长度是 Integer.MAX_VALUE，也就是 2^31-1 = 2147483647。

所以理论上运行时可以创建一个包含约 21 亿个字符的 String 对象，但实际上会受到 JVM 堆内存大小的限制。

---

### 4.6 字符串常量是什么时候进入到字符串常量池的？

字符串常量进入字符串常量池主要有两种时机：

**第一种：编译期 + 类加载时**

字符串字面量在编译后会进入字节码文件的常量池（Class 文件常量池）。当类被加载时，这些字符串常量会从字节码的常量池复制到运行时常量池（字符串常量池）。

举个例子：

```java
String s1 = "hello";  // "hello" 在编译时进入 class 文件常量池
                      // 类加载时进入字符串常量池
```

**第二种：运行期手动添加**

在运行期，可以通过 `String.intern()` 方法手动将字符串对象添加到字符串常量池。

举个例子：

```java
String s1 = new String("hello");  // 在堆中创建对象
String s2 = s1.intern();  // 手动将 "hello" 添加到字符串常量池
                          // 如果常量池中已存在，则返回常量池中的引用
```

**intern() 方法的行为：**

- 如果字符串常量池中已经存在该字符串，直接返回常量池中的引用
- 如果字符串常量池中不存在该字符串，将其添加到常量池，并返回常量池中的引用

---

### 4.7 为什么 JDK 9 中把 String 的 char\[] 改成了 byte\[]？

主要是为了节省内存空间，提升性能。

在 JDK 9 之前，String 内部使用 char\[] 数组存储字符，每个 char 占用 2 个字节。但实际应用中，大部分字符串都是 Latin-1 字符（如英文、数字、常见符号），这些字符用 1 个字节就能表示，用 2 个字节存储造成了 50% 的内存浪费。

JDK 9 引入了**紧凑字符串（Compact Strings）**的概念，将 String 的内部存储从 char[] 改为 byte\[]，并新增了一个 coder 字段来标识编码方式：

- **coder = LATIN1（0）**：表示字符串中所有字符都是 Latin-1 字符，每个字节存储一个字符，节省一半内存
- **coder = UTF16（1）**：表示字符串包含非 Latin-1 字符（如中文），每两个字节存储一个字符，和之前的 char\[] 效果一样

举个例子：

```java
String s1 = "hello";  // 只需 5 字节，coder = LATIN1
String s2 = "你好";   // 需要 4 字节（2个字符×2字节），coder = UTF16
```

这个改进带来的好处：

1. 内存占用减少：对于纯 ASCII 或 Latin-1 字符串，内存占用减半
2. GC 压力降低：String 对象变小，垃圾回收效率提升
3. 缓存友好：更小的对象意味着更好的 CPU 缓存命中率

根据统计，大部分 Java 应用中的字符串都是 Latin-1 字符，所以这个优化对整体性能提升明显。这是一个典型的空间换时间的优化案例，通过增加一个 coder 字段的开销，换来了大量的内存节省。

---

### 4.8 String 是如何实现不可变的？

String 的不可变性是通过多层防护机制来保证的：

**第一，类被 final 修饰**。String 类被声明为 final，这意味着它不能被继承，防止子类重写方法来破坏不可变性。如果允许继承，子类可能会重写方法来修改内部状态。

**第二，内部数组被 final 修饰**。在 JDK 9 之前，String 内部使用 `private final char[] value` 存储字符；JDK 9 之后改为 `private final byte[] value`。final 关键字保证了数组引用不能被修改，即不能指向其他数组。

**第三，没有提供修改方法**。String 类没有提供任何可以修改内部数组内容的 public 方法，所有看起来"修改"字符串的方法（如 substring、concat、replace）实际上都是创建并返回新的 String 对象，原字符串保持不变。

**第四，内部数组私有且不暴露**。value 数组被声明为 private，外部无法直接访问。即使有返回字符数组的方法（如 toCharArray），也是返回数组的副本，而不是原数组的引用。

举个例子：

```java
String s1 = "hello";
String s2 = s1.concat(" world");  // 创建新对象
System.out.println(s1);  // 输出 "hello"，原字符串未改变
System.out.println(s2);  // 输出 "hello world"
```

需要注意的是，虽然 final 修饰了数组引用，但如果能获取到数组的引用，理论上还是可以修改数组内容的。所以 String 通过 private 访问控制和不提供修改方法，确保了外部无法获取和修改内部数组。

这种多层防护的设计，从类、字段、方法、访问控制等多个维度保证了 String 的不可变性。

---



### 4.9 **怎么修改一个类中的private修饰的String参数的值**

String 类是不可变的，一旦创建字符串就不会改变了，如果改变引用的指向也算修改的话，可以提供setter方法暴露接口来修改，也可以使用反射打破封装来修改。

---

这个问题涉及到 String 的不可变性、封装性和反射机制。

 **重要前提：String 是不可变的**

首先要明确，String 类是不可变的（immutable），一旦创建就不能改变其内容。我们能做的只是改变引用的指向，让它指向一个新的 String 对象。

---

 **方法一：通过 setter 方法修改（推荐）**

这是最常规、最安全的做法，通过提供公共的 setter 方法来修改私有字段。
**说明：**
- 这种方式改变的是引用的指向，而不是 String 对象本身
- 原来的 "张三" 对象仍然存在（如果没有其他引用，会被 GC 回收）
- name 字段现在指向新的 "李四" 对象

 **方法二：使用反射打破封装（不推荐）**

如果类没有提供 setter 方法，可以使用反射强制访问和修改私有字段。

**反射修改的步骤：**
1. 获取 Class 对象
2. 通过 `getDeclaredField()` 获取字段对象
3. 调用 `setAccessible(true)` 打破封装
4. 使用 `set()` 方法修改字段值

---

### 14.10 JDK 9 中对字符串拼接做了什么优化？

JDK 9 引入了一个重要的字符串拼接优化，将拼接策略从编译期固定改为运行期动态选择，这个优化被称为 **Indify String Concatenation**（动态字符串拼接）。

---

 **JDK 8 及之前的做法**

在 JDK 8 及之前，编译器会在编译期将字符串拼接操作直接转换为 StringBuilder 的调用。

**JDK 8 的问题：**

1. **策略固定**：编译器在编译期就决定了使用 StringBuilder，无法根据运行时的实际情况优化
2. **无法适应变化**：如果未来有更好的拼接实现（如 Java 9 的紧凑字符串），需要重新编译代码才能使用
3. **优化空间有限**：编译器无法根据字符串的特点（长度、类型等）选择最优策略

---

 **JDK 9 的优化**

JDK 9 使用 **invokedynamic** 指令和 **StringConcatFactory** 将拼接策略推迟到运行期决定。编译后生成 invokedynamic 指令，运行时由 StringConcatFactory 动态选择拼接策略。


**运行时的策略选择：**

JDK 9 的 `StringConcatFactory` 可以根据字符串的特点动态选择最优的拼接方式：

1. **简单拼接**：直接使用字节数组拷贝，避免创建 StringBuilder 对象
2. **复杂拼接**：使用 StringBuilder 或其他高效方式
3. **常量折叠**：对于编译期可确定的常量，直接合并
4. **紧凑字符串优化**：利用 JDK 9 的紧凑字符串特性（Latin-1 编码）

---

 **优化带来的好处**

**1. 性能提升**

根据字符串特点选择最优策略，避免不必要的对象创建：

```java
// 简单拼接：JDK 9 可以直接使用字节数组拷贝
String s = "Hello" + "World";  // 更快

// 复杂拼接：JDK 9 会选择合适的策略
String s = str1 + str2 + str3 + str4;  // 根据情况优化
```

**2. 更好的适应性**

运行时决策意味着可以利用最新的 JVM 优化，无需重新编译代码：

- 自动利用紧凑字符串（Compact Strings）特性
- 未来的 JVM 优化可以直接生效
- 可以根据硬件特性（CPU、内存）动态调整

**3. 代码更简洁**

字节码更简洁，减少了 class 文件大小：

```java
// JDK 8：生成大量 StringBuilder 相关的字节码
// JDK 9：只生成一个 invokedynamic 指令
```

---

 **技术细节**

**invokedynamic 指令**

JDK 9 使用 invokedynamic 指令实现动态方法调用：

```java
// 源代码
String s = a + b + c;

// JDK 8 字节码（简化）
new StringBuilder
dup
invokespecial StringBuilder.<init>
aload a
invokevirtual StringBuilder.append
aload b
invokevirtual StringBuilder.append
aload c
invokevirtual StringBuilder.append
invokevirtual StringBuilder.toString

// JDK 9 字节码（简化）
aload a
aload b
aload c
invokedynamic makeConcatWithConstants  // 动态调用
```

**StringConcatFactory**

运行时由 `StringConcatFactory` 类负责选择拼接策略：

```java
public final class StringConcatFactory {
    // 根据参数类型和数量选择最优策略
    public static CallSite makeConcatWithConstants(...) {
        // 策略1：简单拼接，直接字节数组操作
        // 策略2：使用 StringBuilder
        // 策略3：使用 MethodHandle
        // ...
    }
}
```

---
## 五、泛型

### 5.1 什么是泛型？有什么好处？

泛型是 JDK 5 引入的类型参数化类型，允许在定义类、接口和方法时使用类型参数，使用时再指定具体类型。

泛型主要有三个好处：

首先是提高代码复用性。比如我想定义一个集合，既可以存字符串，又可以存整数，难道要创建两个集合类吗？用泛型就可以解决：

```java
List<String> stringList = new ArrayList<>();  // 存字符串
List<Integer> intList = new ArrayList<>();    // 存整数
```

其次是增强类型安全。泛型在编译期就会进行类型检查，能在编译阶段发现类型错误，避免运行时出现 ClassCastException：

```java
// 使用泛型，编译期就能发现类型错误
List<String> list = new ArrayList<>();
list.add("hello");
String s = list.get(0);  // 不需要强制转换

// 不使用泛型，运行时才能发现错误
List list2 = new ArrayList();
list2.add("hello");
String s2 = (String) list2.get(0);  // 需要强制转换，容易出错
```

最后是消除强制类型转换。使用泛型后，编译器知道集合里存的是什么类型，取出来时不需要强制转换，代码更简洁。

需要注意的是，泛型是编译期的概念。编译时会进行类型检查，然后进行类型擦除，把泛型类型替换为 Object 或其边界类型。所以运行时 JVM 其实不知道泛型的具体类型信息。

---

### 5.2 什么是类型擦除？

类型擦除是 Java 泛型在编译时把泛型类型参数替换成具体类型的过程。

具体来说，编译器会做这样的转换：

如果泛型类型没有指定上界，就会被替换成 Object 类型：

```java
// 源代码
List<String> list = new ArrayList<>();

// 编译后实际变成
List list = new ArrayList();  // String 被擦除成 Object
```

如果泛型类型指定了上界，就会被替换成上界类型：

```java
// 源代码
class Box<T extends Number> {
    private T value;
}

// 编译后 T 被替换成 Number
class Box {
    private Number value;
}
```

为什么要进行类型擦除？主要是为了保持向后兼容。Java 在 JDK 5 才引入泛型，为了让新代码能在旧的 JVM 上运行，同时让泛型代码和非泛型代码能够互相调用，就采用了类型擦除的方式。

类型擦除带来的影响：

运行时无法获取泛型的具体类型信息，比如无法通过 `instanceof` 判断泛型类型，也无法创建泛型数组。

---

### 5.3 泛型中 K T V E ? Object 等分别代表什么含义？

这些都是泛型中常用的类型参数符号，它们本质上都是占位符，只是按照约定俗成的规范来命名，让代码更易读：

**T (Type)**：表示任意类型，最常用的泛型参数。通常用在类、接口和方法中表示一个通用类型：

```java
class Box<T> {
    private T value;
}
```

**K (Key)** 和 **V (Value)**：表示键值对，通常在 Map 中使用：

```java
Map<K, V> map = new HashMap<>();
Map<String, Integer> map = new HashMap<>();  // K=String, V=Integer
```

**E (Element)**：表示元素，通常在集合类中使用：

```java
List<E> list = new ArrayList<>();
Set<E> set = new HashSet<>();
```

**? (通配符)**：表示不确定的类型，用于泛型的上下界限定：

```java
List<?> list;  // 可以接收任意类型的 List
List<? extends Number> list;  // 只能接收 Number 及其子类
List<? super Integer> list;  // 只能接收 Integer 及其父类
```

**Object**：这不是泛型参数，而是 Java 中所有类的父类。在泛型出现之前，我们用 Object 来实现通用性，但需要手动类型转换：

```java
// 使用 Object，需要强制转换
List list = new ArrayList();
list.add("hello");
String s = (String) list.get(0);

// 使用泛型，不需要转换
List<String> list = new ArrayList<>();
list.add("hello");
String s = list.get(0);
```

---

### 5.4 泛型中上下界限定符 extends 和 super 有什么区别？

extends 和 super 是泛型中用来限定类型范围的关键字，它们的区别主要体现在限定的方向和使用场景上。

**? extends T（上界通配符）**

表示泛型类型的上界，? 必须是 T 类型或 T 的子类。这种方式适合读取数据的场景：

```java
List<? extends Number> list = new ArrayList<Integer>();  // Integer 是 Number 的子类
Number num = list.get(0);  // 可以读取，因为肯定是 Number 或其子类
// list.add(new Integer(1));  // 编译错误！不能写入
```

为什么不能写入？因为编译器不知道 list 里具体是什么类型，可能是 `List<Integer>`，也可能是 `List<Double>`，为了类型安全，干脆禁止写入。

**? super T（下界通配符）**

表示泛型类型的下界，? 必须是 T 类型或 T 的父类。这种方式适合写入数据的场景：

```java
List<? super Integer> list = new ArrayList<Number>();  // Number 是 Integer 的父类
list.add(new Integer(1));  // 可以写入 Integer 或其子类
// Integer num = list.get(0);  // 编译错误！只能用 Object 接收
Object obj = list.get(0);  // 只能用 Object 接收
```

为什么读取时只能用 Object？因为编译器不知道 list 里具体是什么类型，可能是 `List<Integer>`，也可能是 `List<Number>`，甚至是 `List<Object>`，所以只能用它们的共同父类 Object 来接收。

**使用场景总结**

记住一个口诀：**PECS 原则**（Producer Extends, Consumer Super）

- 如果你需要从集合中读取数据（生产者），用 `? extends T`
- 如果你需要往集合中写入数据（消费者），用 `? super T`

举个实际例子：

```java
// 从 src 读取数据，复制到 dest
input type :Number 、 Integer
output type:

public static <T> void copy( List<? extends T> src,List<? super T> dest) {
    for (T item : src) {
        dest.add(item);  // src 用 extends 读取，dest 用 super 写入
    }
}
```

这样设计既保证了类型安全，又提供了足够的灵活性。

---

## 六、异常处理

### 6.1 Java 中异常分哪两类？有什么区别？

Java 的异常分为受检异常（Checked Exception）和非受检异常（Unchecked Exception）两大类。

**受检异常**是指在编译期就必须处理的异常，比如 IOException、SQLException 等。这类异常必须通过 try-catch 捕获或者在方法签名中用 throws 声明抛出，否则代码无法通过编译。受检异常通常表示外部环境导致的可预见问题，比如文件不存在、网络连接失败等，程序应该对这些情况做出合理的处理。

**非受检异常**主要指 RuntimeException 及其子类，以及 Error 类。这类异常在编译期不强制要求处理，可以选择捕获也可以不捕获。RuntimeException 通常是由程序逻辑错误引起的，比如 NullPointerException（空指针）、ArrayIndexOutOfBoundsException（数组越界）、IllegalArgumentException（非法参数）等。如果这类异常没有被捕获，会导致程序中断执行。Error 则表示严重的系统级错误，比如 OutOfMemoryError、StackOverflowError，这类错误通常无法恢复，程序也不应该去捕获。

两者的核心区别在于：受检异常强制要求处理，代表可预见的外部问题；非受检异常不强制处理，通常代表程序 bug，应该通过修复代码来避免。

---

### 6.2 finally 中的代码一定会执行吗？

在正常情况下，只要 try 语句块开始执行了，finally 中的代码就一定会执行，无论是否发生异常，也无论 try 或 catch 中是否有 return 语句。这是 finally 的设计初衷，用来保证资源释放等清理工作一定能够完成。

但在一些极端情况下，finally 中的代码可能不会执行：

第一，JVM 在 finally 执行前就终止了。比如在 try 或 catch 中调用了 `System.exit(0)` 强制退出虚拟机，或者进程被 `kill -9` 强制杀死，这时 JVM 直接终止，finally 来不及执行。

第二，程序所在线程死亡。如果执行 try 的线程被中断或死亡，finally 也无法执行。

第三，计算机断电或系统崩溃等不可抗力因素。

第四，try 语句块中出现了死循环或长时间阻塞，导致程序一直无法执行到 finally。

需要注意的是，即使 try 或 catch 中有 return 语句，finally 依然会在 return 之前执行。而且如果 finally 中也有 return 语句，会覆盖 try 或 catch 中的 return 值，这种写法应该避免，因为会让代码逻辑变得混乱。

总结：在正常的程序流程中，finally 一定会执行；但在 JVM 异常终止等极端情况下，finally 可能不会执行。

---

### 6.3 try 中 return A，catch 中 return B，finally 中 return C，最终返回值是什么？

最终返回值是 **C**。

**原因分析：**

finally 块中的 return 语句会覆盖 try 或 catch 块中的 return 语句。执行顺序如下：

1. 执行 try 块，遇到 return A，先计算 A 的值并暂存
2. 如果有异常，执行 catch 块，遇到 return B，先计算 B 的值并暂存
3. 无论是否有异常，都会执行 finally 块
4. finally 块中遇到 return C，直接返回 C，之前暂存的 A 或 B 被丢弃

**代码示例：**

```java
public static String test() {
    try {
        System.out.println("执行 try");
        return "A";  // 这个返回值会被覆盖
    } catch (Exception e) {
        System.out.println("执行 catch");
        return "B";  // 这个返回值也会被覆盖
    } finally {
        System.out.println("执行 finally");
        return "C";  // 最终返回这个值
    }
}

// 调用结果
String result = test();
System.out.println(result);  // 输出：C
```

**输出：**
```
执行 try
执行 finally
C
```

**重要提示：**

这种在 finally 中使用 return 的写法是**强烈不推荐**的，原因如下：

1. **违反直觉**：会覆盖 try/catch 中的返回值，让代码逻辑变得混乱
2. **隐藏异常**：如果 try/catch 中抛出了异常，finally 中的 return 会导致异常被吞掉
3. **代码可读性差**：维护人员很难理解真正的返回逻辑

**正确的做法：**

```java
public static String test() {
    String result = "A";
    try {
        System.out.println("执行 try");
        result = "A";
    } catch (Exception e) {
        System.out.println("执行 catch");
        result = "B";
    } finally {
        System.out.println("执行 finally");
        // 不要在 finally 中 return
        // 可以在这里做清理工作
    }
    return result;  // 在方法最后统一返回
}
```

**扩展：如果 finally 中没有 return，只修改返回值会怎样？**

```java
public static int test() {
    int result = 1;
    try {
        return result;  // 返回 1，此时 result 的值已经被复制
    } finally {
        result = 2;  // 修改 result，但不影响返回值
    }
}

System.out.println(test());  // 输出：1（不是 2）
```

这是因为 return 语句会先计算返回值并复制一份，finally 中修改的是原变量，不影响已经复制的返回值。

**但是对于引用类型：**

```java
public static StringBuilder test() {
    StringBuilder sb = new StringBuilder("A");
    try {
        return sb;  // 返回 sb 的引用
    } finally {
        sb.append("B");  // 修改 sb 指向的对象
    }
}

System.out.println(test());  // 输出：AB
```

这种情况下，finally 中修改了对象的内容，会影响返回值，因为返回的是引用，指向的是同一个对象。

**总结：**
- finally 中的 return 会覆盖 try/catch 中的 return
- 强烈不推荐在 finally 中使用 return
- finally 中修改基本类型的返回值不会生效
- finally 中修改引用类型指向的对象内容会生效

---

### 6.4 final、finally、finalize 有什么区别？

这三个虽然名字相近，但是完全不同的概念，分别属于不同的领域：

---

 **1. final（关键字 - 修饰符）**

final 是一个修饰符关键字，表示"最终的、不可改变的"，可以修饰类、方法和变量。

**修饰类：**
```java
public final class String {
    // String 类不能被继承
}
```
- 类不能被继承，无法产生子类
- 常见例子：String、Integer 等包装类

**修饰方法：**
```java
public class Parent {
    public final void show() {
        // 方法不能被重写
    }
}
```
- 方法不能被子类重写
- 可以被继承，但不能被覆盖

**修饰变量：**
```java
// 修饰基本类型：值不能改变
final int count = 10;
// count = 20;  // 编译错误

// 修饰引用类型：引用不能改变，但对象内容可以改变
final List<String> list = new ArrayList<>();
list.add("hello");  // 可以，修改对象内容
// list = new ArrayList<>();  // 编译错误，不能改变引用
```

**使用场景：**
- 定义常量：`public static final int MAX_SIZE = 100;`
- 防止继承：确保类的行为不被改变
- 防止重写：确保方法的实现不被改变
- 线程安全：final 变量天然线程安全

---

2. finally（关键字 - 异常处理）**

finally 是异常处理机制的一部分，用于定义无论是否发生异常都要执行的代码块。

**语法：**
```java
try {
    // 可能抛出异常的代码
} catch (Exception e) {
    // 异常处理
} finally {
    // 无论如何都会执行的代码
    // 通常用于资源清理
}
```

**典型用途：**
```java
FileInputStream fis = null;
try {
    fis = new FileInputStream("file.txt");
    // 读取文件
} catch (IOException e) {
    e.printStackTrace();
} finally {
    // 确保资源被释放
    if (fis != null) {
        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

**特点：**
- 只要 try 执行了，finally 就一定会执行（除非 JVM 终止）
- 常用于资源清理：关闭文件、释放连接、解锁等
- 推荐使用 try-with-resources 替代手动 finally

---

3. finalize（方法 - 垃圾回收）**

finalize 是 Object 类的一个方法，在对象被垃圾回收器回收之前调用。

**方法签名：**
```java
protected void finalize() throws Throwable {
    // 对象被回收前的清理工作
}
```

**示例：**
```java
public class Resource {
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("对象被回收，执行清理");
            // 释放资源
        } finally {
            super.finalize();
        }
    }
}
```

**为什么不推荐使用？**

1. **执行时机不确定**：无法预测 GC 何时运行，finalize 可能很晚才执行，甚至不执行
2. **性能开销大**：使用 finalize 的对象需要至少两次 GC 才能回收
3. **可能导致问题**：finalize 中的异常会被忽略，可能导致资源泄露
4. **已被废弃**：Java 9 开始标记为 @Deprecated

**推荐替代方案：**

使用 try-with-resources 或显式的 close() 方法：

```java
// 推荐：try-with-resources
try (FileInputStream fis = new FileInputStream("file.txt")) {
    // 使用资源
} // 自动调用 close()

// 或者实现 AutoCloseable 接口
public class MyResource implements AutoCloseable {
    @Override
    public void close() {
        // 清理资源
    }
}
```


---

**面试加分项**

如果面试官问到这个问题，可以补充说明：

1. **final 的深入理解**：
   - final 修饰的引用类型，引用不可变但对象内容可变
   - final 方法可以被继承但不能被重写
   - final 类的所有方法隐式为 final

2. **finally 的执行时机**：
   - 即使 try/catch 中有 return，finally 也会在 return 之前执行
   - 但不推荐在 finally 中使用 return，会覆盖 try/catch 的返回值

3. **finalize 的替代方案**：
   - Java 9+ 使用 Cleaner 和 PhantomReference
   - 实现 AutoCloseable 接口，使用 try-with-resources
   - 显式提供 close() 或 dispose() 方法

---

## 七、注解与反射

### 7.1 Java 注解的作用是什么？

注解（Annotation）是 Java 提供的一种为代码添加元数据的机制。注解本身不会直接影响代码的执行逻辑，但可以被编译器、开发工具或运行时通过反射读取，从而影响程序的行为。比如，我们可以使用注解标记某些类或方法，然后在运行时通过反射检查这些注解，当满足特定条件时执行相应的操作。常见的应用场景包括：配置信息（如 Spring 的 @Component、@Autowired）、代码生成（如 Lombok 的 @Data）、编译检查（如 @Override）、运行时处理（如 JUnit 的 @Test）。Java 还提供了四个重要的元注解用于定义注解本身：@Target 指定注解的作用范围（类、方法、字段等），@Retention 指定注解的生命周期（源码期、编译期、运行期），@Documented 表示注解是否出现在 JavaDoc 中，@Inherited 表示注解是否可以被子类继承。通过这些元注解的组合，我们可以创建出功能强大且灵活的自定义注解。

---

### 7.2 什么是反射机制？为什么反射慢？

反射（Reflection）是 Java 提供的一种机制，允许程序在运行时动态地获取类的信息并操作类的成员。通过反射可以在运行时获取类的构造方法、字段、方法等信息，还可以动态创建对象、调用方法、访问和修改字段。

**反射的主要功能**

- 获取类的信息：包名、类名、父类、实现的接口等
- 获取类的成员：构造方法、字段、方法
- 动态操作：创建对象、调用方法、访问和修改字段（包括私有成员）

**为什么反射慢？**

反射的性能开销主要来自以下几个方面：

第一，无法进行编译器优化。正常的方法调用在编译期就确定了，编译器和 JIT（即时编译器）可以进行内联、逃逸分析等优化。而反射调用在编译期无法确定，这些优化都无法应用，只能在运行时动态解析。

第二，类型检查和参数装箱。使用反射调用方法时，参数需要被包装成 Object 数组传递，基本类型会发生自动装箱。方法执行时又要将 Object 数组转换回真正的参数类型，这个过程会产生大量临时对象。对象多了就容易触发 GC，而 GC 会导致程序停顿，影响性能。

第三，安全检查开销。反射可以访问私有成员，每次反射操作都需要进行安全性检查和访问权限验证，这些检查都需要时间。

第四，方法查找开销。反射需要从类的方法数组中查找目标方法，这是一个线性查找过程，比直接调用慢得多。

**如何优化反射性能？**

虽然反射慢，但在某些场景下不可避免。可以通过以下方式优化：

- 缓存反射对象：将 Class、Method、Field 等对象缓存起来，避免重复获取
- 使用 `setAccessible(true)`：跳过安全检查，提升性能
- 减少反射使用频率：只在必要时使用反射，核心逻辑尽量用普通调用

总的来说，反射提供了强大的动态能力，但牺牲了性能。在框架开发、插件系统等场景下很有用，但在性能敏感的代码中应该谨慎使用。

---

### 7.3 为什么不建议使用异常控制业务流程？

使用异常来控制业务流程是一种不好的编程实践，主要有以下几个原因：

---

 **1. 性能开销大**

异常处理机制的性能开销远大于普通的条件判断。

**异常的开销来源：**

- **创建异常对象**：需要分配内存
- **填充异常栈**：需要捕获当前的调用栈信息，这是一个昂贵的操作
- **异常传播**：异常需要沿着调用链向上传播，直到被捕获
- **栈展开（Stack Unwinding）**：JVM 需要逐层退出方法调用栈

**性能对比示例：**

```java
// 错误做法：使用异常控制流程
public int parseIntBad(String str) {
    try {
        return Integer.parseInt(str);
    } catch (NumberFormatException e) {
        return 0;  // 使用异常处理非数字情况
    }
}

// 正确做法：使用条件判断
public int parseIntGood(String str) {
    if (str == null || !str.matches("\\d+")) {
        return 0;  // 提前判断
    }
    return Integer.parseInt(str);
}
```

**性能测试结果：**
- 条件判断：纳秒级
- 异常处理：微秒级（慢 100-1000 倍）

---

2. **违反异常的设计初衷**

异常的设计目的是处理**异常情况**（exceptional conditions），而不是处理**正常的业务逻辑**。

**异常应该用于：**
- 文件不存在
- 网络连接失败
- 数组越界
- 空指针引用
- 其他不可预期的错误情况

**异常不应该用于：**
- 用户输入验证
- 业务规则判断
- 流程控制
- 循环终止条件

**错误示例：**

```java
// 错误：使用异常控制循环
public void processItems(List<String> items) {
    int index = 0;
    try {
        while (true) {
            String item = items.get(index++);
            process(item);
        }
    } catch (IndexOutOfBoundsException e) {
        // 使用异常作为循环终止条件
    }
}

// 正确：使用正常的循环控制
public void processItems(List<String> items) {
    for (String item : items) {
        process(item);
    }
}
```

---

 **3. 降低代码可读性和可维护性**

使用异常控制业务流程会让代码逻辑变得晦涩难懂。

**错误示例：**

```java
// 错误：使用异常控制业务流程
public void withdraw(Account account, double amount) {
    try {
        if (account.getBalance() < amount) {
            throw new InsufficientFundsException("余额不足");
        }
        account.deduct(amount);
    } catch (InsufficientFundsException e) {
        // 处理余额不足的情况
        notifyUser(e.getMessage());
    }
}

// 正确：使用条件判断
public void withdraw(Account account, double amount) {
    if (account.getBalance() < amount) {
        notifyUser("余额不足");
        return;
    }
    account.deduct(amount);
}
```

**为什么第二种更好？**
- 逻辑清晰：一眼就能看出是在检查余额
- 意图明确：这是正常的业务判断，不是异常情况
- 易于维护：不需要理解异常的传播路径

---

**4. 破坏代码的正常流程**

异常会打断正常的代码执行流程，使得程序的控制流变得复杂。

**错误示例：**

```java
// 错误：使用异常控制多分支逻辑
public String getUserLevel(int score) {
    try {
        if (score >= 90) {
            throw new ExcellentException();
        } else if (score >= 60) {
            throw new PassException();
        } else {
            throw new FailException();
        }
    } catch (ExcellentException e) {
        return "优秀";
    } catch (PassException e) {
        return "及格";
    } catch (FailException e) {
        return "不及格";
    }
}

// 正确：使用 if-else
public String getUserLevel(int score) {
    if (score >= 90) {
        return "优秀";
    } else if (score >= 60) {
        return "及格";
    } else {
        return "不及格";
    }
}
```

---

 **5. 调试困难**

使用异常控制流程会产生大量的异常栈信息，增加调试难度。

**问题：**
- 日志中充斥着大量的异常栈信息
- 难以区分真正的异常和用于流程控制的异常
- 影响问题排查效率

---

 **6. 可能掩盖真正的异常**

如果用异常控制业务流程，可能会不小心捕获并掩盖真正的异常。

**错误示例：**

```java
// 危险：可能掩盖真正的异常
public void processData(String data) {
    try {
        // 业务逻辑
        if (data.isEmpty()) {
            throw new IllegalArgumentException("数据为空");
        }
        // 更多处理...
        someMethod(data);  // 这里可能抛出其他异常
    } catch (Exception e) {
        // 本意是捕获 IllegalArgumentException
        // 但也会捕获 someMethod 中的其他异常
        handleEmptyData();
    }
}
```

---

 **正确的做法**

**1. 使用返回值表示结果：**

```java
// 使用 Optional
public Optional<User> findUser(String id) {
    User user = database.query(id);
    return Optional.ofNullable(user);
}

// 使用
Optional<User> userOpt = findUser("123");
if (userOpt.isPresent()) {
    User user = userOpt.get();
    // 处理用户
} else {
    // 用户不存在
}
```

**2. 使用状态码或结果对象：**

```java
public class Result<T> {
    private boolean success;
    private T data;
    private String message;
    
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.success = true;
        result.data = data;
        return result;
    }
    
    public static <T> Result<T> fail(String message) {
        Result<T> result = new Result<>();
        result.success = false;
        result.message = message;
        return result;
    }
}

// 使用
public Result<User> createUser(String name) {
    if (name == null || name.isEmpty()) {
        return Result.fail("用户名不能为空");
    }
    User user = new User(name);
    return Result.success(user);
}
```

**3. 使用条件判断：**

```java
public void processOrder(Order order) {
    // 使用条件判断，而不是异常
    if (order == null) {
        log.warn("订单为空");
        return;
    }
    
    if (order.getAmount() <= 0) {
        log.warn("订单金额无效");
        return;
    }
    
    // 正常处理订单
    processValidOrder(order);
}
```

---

 **什么时候应该使用异常？**

异常应该用于处理真正的异常情况：

1. **外部资源问题**：文件不存在、网络连接失败、数据库连接失败
2. **系统错误**：内存不足、栈溢出
3. **编程错误**：空指针、数组越界、类型转换错误
4. **不可预期的情况**：无法通过正常逻辑处理的情况

**正确使用异常的示例：**

```java
public User loadUser(String filename) throws IOException {
    // 文件操作可能失败，这是真正的异常情况
    try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
        String json = reader.readLine();
        return parseUser(json);
    }
    // IOException 会向上传播，由调用者处理
}
```

---

 **总结**

不建议使用异常控制业务流程的原因：

1. **性能开销大**：异常处理比条件判断慢 100-1000 倍
2. **违反设计初衷**：异常是为了处理异常情况，不是业务逻辑
3. **降低可读性**：代码逻辑变得晦涩难懂
4. **破坏正常流程**：打断代码的正常执行流
5. **调试困难**：产生大量异常栈信息
6. **可能掩盖真正的异常**：不小心捕获了不该捕获的异常

**记住：异常是用来处理异常的，不是用来控制流程的！**

**最佳实践：**
- 使用条件判断处理可预期的情况
- 使用返回值（Optional、Result）表示操作结果
- 只在真正的异常情况下使用异常
- 让异常向上传播，由合适的层级处理

---


## 八、枚举

### 8.1 Java 中的枚举有什么特点和好处？

Java 枚举（Enum）是一种特殊的类，用于定义一组固定的常量。它有以下几个重要特点和好处：

第一，类型安全。枚举提供了编译期的类型检查，只能使用预定义的枚举值，不能传入其他值。相比使用 int 或 String 常量，枚举可以避免传入非法值的问题。比如定义一个表示星期的枚举，方法参数只能接收 MONDAY、TUESDAY 等预定义的值，而不会出现传入 8 或 "星期八" 这种错误。

第二，可扩展性强。枚举不仅可以定义常量，还可以有自己的属性、构造方法和普通方法。比如可以给每个枚举值关联一个描述信息或编码，还可以定义业务方法。这让枚举不只是简单的常量，而是功能完整的对象。

第三，天然的单例模式。每个枚举值在 JVM 中只会存在一个实例，由 JVM 保证线程安全和单例特性。这使得枚举成为实现单例模式最简单、最安全的方式，不需要考虑线程同步、序列化、反射等问题。

第四，可以用于 switch 语句。枚举可以直接在 switch 中使用，代码更清晰易读。

第五，提供了实用方法。枚举自动继承 java.lang.Enum 类，提供了 values()、valueOf()、name()、ordinal() 等方法，方便进行枚举值的遍历和转换。

总的来说，枚举让代码更安全、更易读、更易维护，是定义固定常量集合的最佳选择。

---

## 九、编码与字符集

### 9.1 常见的字符编码有哪些？有什么区别？

常见的字符编码主要有 ASCII、Unicode、UTF-8、GBK 等，它们各有特点：

ASCII 编码：最早的字符编码，使用 1 个字节（7 位）编码，只能表示 128 个字符，主要是英文字母、数字和一些符号。它是其他编码的基础。

Unicode 编码：这是一个字符集标准，不是具体的编码实现。它为世界上几乎所有的字符都分配了一个唯一的编号（码点），解决了不同编码之间的兼容问题。但 Unicode 只是定义了字符和编号的对应关系，具体如何存储需要由 UTF-8、UTF-16 等编码方式来实现。

UTF-8 编码：Unicode 的一种变长编码实现，使用 1 到 4 个字节来编码字符。ASCII 字符占 1 个字节，常用汉字占 3 个字节，生僻字或 emoji 占 4 个字节。UTF-8 的优点是兼容 ASCII，节省存储空间，是目前互联网上使用最广泛的编码方式。

UTF-16 编码：Unicode 的另一种编码实现，使用 2 个或 4 个字节。Java 内部就是使用 UTF-16 来存储字符的。它的优点是大部分常用字符都是 2 个字节，访问效率高，但不兼容 ASCII。

GBK 编码：专门为中文设计的编码，使用 2 个字节编码一个汉字。相比 UTF-8 的 3 个字节，GBK 存储中文更节省空间。但它只支持中文和少量其他字符，不如 UTF-8 通用。

---

## 十、语法糖

### 10.1 说几个常见的语法糖？

1. 自动装箱和拆箱（Autoboxing/Unboxing）

基本类型和包装类之间可以自动转换，编译器会自动调用 valueOf() 和 xxxValue() 方法：

```java
Integer i = 10;  // 自动装箱，等价于 Integer.valueOf(10)
int j = i;       // 自动拆箱，等价于 i.intValue()
```

2. try-with-resources

自动资源管理，只要资源实现了 AutoCloseable 或 Closeable 接口，try 执行完毕后会自动调用 close() 方法释放资源，不需要手动关闭：

```java
try (FileInputStream fis = new FileInputStream("file.txt")) {
    // 使用资源
} // 自动调用 fis.close()
```

3. 增强 for 循环（for-each）

简化了集合和数组的遍历，编译器会将其转换为迭代器或普通 for 循环：

```java
for (String item : list) {
    System.out.println(item);
}
```

4. 泛型

编译时提供类型检查，运行时会进行类型擦除：

```java
List<String> list = new ArrayList<>();  // 编译后泛型信息会被擦除
```

5. 可变参数（Varargs）

方法可以接收不定数量的参数，编译器会将其转换为数组：

```java
public void method(String... args) {}  // 实际是 String[] args
```

6. Lambda 表达式

简化了匿名内部类的写法，编译器会将其转换为函数式接口的实现：

```java
list.forEach(item -> System.out.println(item));
```

7. switch 支持 String 和枚举

早期 switch 只支持整型，现在支持 String 和枚举，编译器会转换为 if-else 或整型 switch。

8. 枚举类型

看起来是特殊的类型，实际上编译后会生成继承自 Enum 的类。

---

### 10.2 Lambda 表达式是如何实现的？

Lambda 表达式的实现比较复杂，它并不是简单的语法糖，而是通过 invokedynamic 指令和方法句柄来实现的。

实现机制：

第一步：编译时转换

编译器在编译 Lambda 表达式时，会做两件事：将 Lambda 表达式的代码体生成为一个私有静态方法（或实例方法），在 Lambda 表达式的位置生成一个 invokedynamic 指令。

举个例子：

```java
List<String> list = Arrays.asList("a", "b", "c");
list.forEach(s -> System.out.println(s));
```

编译后，Lambda 体会被转换成类似这样的私有方法：

```java
private static void lambda$main$0(String s) {
    System.out.println(s);
}
```

第二步：运行时动态链接

当程序第一次执行到 Lambda 表达式时，invokedynamic 指令会调用 Java 提供的 LambdaMetafactory 工厂类，动态生成一个实现了函数式接口的内部类，这个内部类会调用前面生成的私有方法。

为什么不用匿名内部类？

使用匿名内部类有明显的缺点：每个 Lambda 都会生成一个 class 文件，增加类加载开销；性能较差，启动速度慢。

使用 invokedynamic 的优势：延迟绑定，只在第一次使用时才生成实现类；可以进行更多的运行时优化；减少了 class 文件的数量。

---

### 10.3 while(true) 和 for(;;) 哪个性能好？

它们的性能一样好，因为底层实现是相同的，都是使用 goto 指令实现的，反编译的字节码完全相同。

这是一个常见的误区，很多人认为 for(;;) 性能更好，但实际上编译器会将它们优化成相同的字节码。所以在实际开发中，选择哪个完全取决于个人习惯和代码可读性，不需要考虑性能差异。

---

## 十一、SPI 机制

### 11.1 什么是 SPI，和 API 有什么区别？

SPI（Service Provider Interface）是服务提供者接口，API（Application Programming Interface）是应用程序编程接口。它们最大的区别在于调用方向和使用场景不同。

**API 的特点**

API 是实现方提供接口并完成实现，调用方直接使用。调用流程是：调用方 → API 接口 → API 实现。

举个例子，我们使用 JDBC 连接数据库：

```java
// 我们调用 API
Connection conn = DriverManager.getConnection(url);
Statement stmt = conn.createStatement();
```

这里我们是调用方，直接使用 JDBC 提供的 API。

**SPI 的特点**

SPI 是接口提供方定义接口规范，由第三方来实现，然后接口提供方通过某种机制来发现和加载这些实现。调用流程是：接口定义方 → SPI 接口 ← 第三方实现。

还是 JDBC 的例子，但从另一个角度看：

```java
// Java 定义了 Driver 接口（SPI）
public interface Driver {
    Connection connect(String url, Properties info);
}

// MySQL 实现这个接口
public class MySQLDriver implements Driver {
    // 具体实现
}

// Oracle 实现这个接口
public class OracleDriver implements Driver {
    // 具体实现
}
```

Java 只定义了 Driver 接口规范，具体实现由各个数据库厂商提供。Java 通过 SPI 机制自动发现和加载这些实现。

**核心区别**

调用方向不同：
- API：我们调用别人提供的功能
- SPI：别人实现我们定义的规范

使用场景不同：
- API：提供具体功能给别人用
- SPI：定义扩展点，让别人来扩展

**SPI 的实现机制**

Java 的 SPI 机制通过 `ServiceLoader` 来实现。具体步骤：

1. 在 `META-INF/services/` 目录下创建以接口全限定名命名的文件
2. 文件内容是实现类的全限定名
3. 使用 `ServiceLoader` 加载实现类

```java
// 加载所有 Driver 的实现
ServiceLoader<Driver> loader = ServiceLoader.load(Driver.class);
for (Driver driver : loader) {
    // 使用具体的实现
}
```

**常见的 SPI 应用**

- JDBC 驱动加载
- Spring Boot 的自动配置
- Dubbo 的扩展机制
- SLF4J 日志框架

总结：API 是给别人用的，SPI 是让别人扩展的。API 关注功能实现，SPI 关注扩展性和插件化。

---

## 十二、其他常见问题

### 12.1 SimpleDateFormat 是线程安全的吗？使用时应该注意什么？

SimpleDateFormat 不是线程安全的。这是因为它内部使用了 Calendar 对象来存储中间状态，多个线程同时使用同一个 SimpleDateFormat 实例时，会相互干扰，导致解析或格式化结果错误，甚至抛出异常。

**使用时的注意事项和解决方案：**

第一，避免共享实例。不要用 static 修饰 SimpleDateFormat，也不要将其作为类的成员变量在多线程间共享。最简单的做法是每次使用时都创建新的实例，用完即丢弃。虽然会有一些性能开销，但保证了线程安全。

第二，使用 ThreadLocal。如果频繁创建 SimpleDateFormat 对象影响性能，可以使用 ThreadLocal 为每个线程维护一个独立的实例：

```java
private static ThreadLocal<SimpleDateFormat> threadLocal = 
    ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));
```

第三，加锁同步。如果必须共享同一个实例，可以使用 synchronized 加锁，但这会降低并发性能，不推荐。

第四，使用替代方案。推荐使用 Java 8 引入的 DateTimeFormatter，它是线程安全的，性能也更好：

```java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
String date = LocalDate.now().format(formatter);
```

或者使用 Apache Commons Lang 的 FastDateFormat，它也是线程安全的。

总结：SimpleDateFormat 不是线程安全的，在多线程环境下应该避免共享实例，优先使用 DateTimeFormatter 等线程安全的替代方案。

---

### 12.2 ClassNotFoundException 和 NoClassDefFoundError 的区别是什么？

这两者有本质区别，一个是异常（Exception），一个是错误（Error）。

**ClassNotFoundException**

这是一个受检异常，继承自 Exception。它发生在程序运行时尝试通过反射动态加载类，但找不到对应的类文件时。比如：

- 使用 `Class.forName("com.example.MyClass")` 加载类时，类名写错或类不存在
- 使用 `ClassLoader.loadClass()` 加载类时找不到类文件
- 加载 JDBC 驱动时类路径配置错误

因为是受检异常，所以必须显式捕获或声明抛出，可以通过 try-catch 处理：

```java
try {
    Class.forName("com.mysql.jdbc.Driver");
} catch (ClassNotFoundException e) {
    // 处理异常
}
```

**NoClassDefFoundError**

这是一个错误，继承自 Error。它发生在编译时类存在，但运行时 JVM 在类路径中找不到类定义时。常见原因包括：

- 类文件在编译后被删除或移动
- JAR 包缺失或版本不匹配
- 类的静态初始化块抛出异常导致类加载失败
- 类路径配置错误

因为是 Error，通常不应该捕获，它表示严重的系统级问题。

**核心区别总结**

1. 类型不同：ClassNotFoundException 是异常，NoClassDefFoundError 是错误
2. 发生时机不同：前者发生在动态加载类时，后者发生在类已经编译但运行时找不到
3. 处理方式不同：前者可以捕获处理，后者通常不应该捕获
4. 原因不同：前者通常是类名错误或类不存在，后者通常是类路径问题或依赖缺失

简单记忆：ClassNotFoundException 是"找不到类"，NoClassDefFoundError 是"类定义找不到"。

---

### 12.3 Java 中创建对象有哪些种方式？

Java 中创建对象主要有以下几种方式：

1. **new 关键字**：最常用的方式，直接调用类的构造方法创建对象
2. **反射**：通过 Class.newInstance() 或 Constructor.newInstance() 动态创建对象
3. **clone() 方法**：通过复制现有对象创建新对象，需要实现 Cloneable 接口
4. **序列化**：通过反序列化从字节流中恢复对象
5. **Unsafe**：通过 Unsafe 类的 allocateInstance() 方法直接分配内存创建对象，不调用构造方法，这种方式不安全，一般不推荐使用

---

### 12.4 Java 中 Timer 实现定时调度的原理是什么？

Timer 是 Java 提供的一个简单的定时任务调度工具，它的实现原理主要依赖两个核心组件：

**核心组件：**

1. **任务队列（TaskQueue）**：一个基于最小堆实现的优先级队列，用来存储所有的定时任务（TimerTask）。队列始终保证执行时间最早的任务排在队首，这样可以快速获取下一个需要执行的任务。

2. **后台线程（TimerThread）**：一个守护线程，不断地扫描任务队列的队首，检查任务的执行时间是否到达。

**工作流程：**

1. 用户通过 `timer.schedule()` 方法提交定时任务，任务被添加到优先级队列中
2. 后台线程持续监控队首任务的执行时间
3. 当队首任务的执行时间到达时，后台线程将其从队列中取出
4. 调用任务的 `run()` 方法执行任务
5. 如果是周期性任务，重新计算下次执行时间，再次加入队列
6. 继续监控下一个队首任务

**示例代码：**

```java
Timer timer = new Timer();

// 延迟 1 秒后执行
timer.schedule(new TimerTask() {
    @Override
    public void run() {
        System.out.println("任务执行");
    }
}, 1000);

// 延迟 1 秒后执行，之后每隔 2 秒执行一次
timer.schedule(new TimerTask() {
    @Override
    public void run() {
        System.out.println("周期性任务");
    }
}, 1000, 2000);
```

**Timer 的优缺点：**

**优点：**
- 使用简单，API 清晰
- 适合简单的定时任务场景

**缺点：**
- 单线程执行：所有任务都在同一个线程中串行执行，如果某个任务执行时间过长，会影响其他任务
- 异常处理差：如果某个任务抛出未捕获的异常，整个 Timer 线程会终止，后续任务都无法执行
- 不支持并发：无法并行执行多个任务

**推荐替代方案：**

对于生产环境，推荐使用 `ScheduledExecutorService`，它解决了 Timer 的所有缺点：

```java
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

**总结：**
Timer 通过优先级队列（最小堆）+ 单后台线程实现定时调度，适合简单场景。生产环境推荐使用 ScheduledExecutorService，它提供了更强大和可靠的定时调度能力。

---


### 12.5 Stream 的并行流一定比串行流更快吗？

不一定，并行流并不总是比串行流快，在某些场景下甚至会更慢。

**并行流的开销**

并行流虽然可以利用多核 CPU 并行处理数据，但它也带来了额外的开销：

1. **线程创建和销毁**：需要创建和管理工作线程
2. **任务分解和合并**：需要将数据拆分成多个子任务，最后再合并结果
3. **线程上下文切换**：多线程之间的切换有开销
4. **线程同步**：需要协调多个线程的执行
5. **环境准备**：Fork/Join 框架的初始化

这些开销在数据量小的时候可能会超过并行带来的性能提升，导致并行流反而比串行流慢。

**什么时候并行流更快？**

并行流适合以下场景：

1. **数据量大**：通常至少需要几千到几万条数据，才能抵消并行的开销
2. **计算密集型任务**：每个元素的处理逻辑比较复杂，耗时较长
3. **无状态操作**：操作之间相互独立，没有依赖关系
4. **易于拆分的数据源**：ArrayList、数组等可以高效拆分，LinkedList 则不适合

**什么时候串行流更快？**

串行流适合以下场景：

1. **数据量小**：几百条以内的数据，串行流通常更快
2. **IO 密集型任务**：大量时间花在等待 IO 上，并行意义不大
3. **有状态操作**：如 sorted()、distinct() 等需要全局状态的操作
4. **顺序敏感**：需要保证处理顺序的场景

**性能对比示例：**

```java
// 数据量小的情况（1000 条）
List<Integer> smallList = IntStream.range(0, 1000)
    .boxed()
    .collect(Collectors.toList());

// 串行流：约 1ms
long start = System.currentTimeMillis();
long sum1 = smallList.stream()
    .mapToInt(i -> i * 2)
    .sum();
System.out.println("串行流耗时：" + (System.currentTimeMillis() - start) + "ms");

// 并行流：约 5ms（更慢！）
start = System.currentTimeMillis();
long sum2 = smallList.parallelStream()
    .mapToInt(i -> i * 2)
    .sum();
System.out.println("并行流耗时：" + (System.currentTimeMillis() - start) + "ms");

// 数据量大的情况（1000万条）
List<Integer> largeList = IntStream.range(0, 10_000_000)
    .boxed()
    .collect(Collectors.toList());

// 串行流：约 200ms
start = System.currentTimeMillis();
sum1 = largeList.stream()
    .mapToInt(i -> i * 2)
    .sum();
System.out.println("串行流耗时：" + (System.currentTimeMillis() - start) + "ms");

// 并行流：约 50ms（更快！）
start = System.currentTimeMillis();
sum2 = largeList.parallelStream()
    .mapToInt(i -> i * 2)
    .sum();
System.out.println("并行流耗时：" + (System.currentTimeMillis() - start) + "ms");
```

**使用建议**

1. **不要盲目使用并行流**：默认使用串行流，只在确实需要时才使用并行流
2. **先测试再决定**：通过性能测试对比串行和并行的实际效果
3. **注意线程安全**：并行流中的操作必须是线程安全的
4. **避免有状态操作**：尽量使用无状态的操作，如 map、filter
5. **合理设置并行度**：可以通过系统属性调整 Fork/Join 线程池的大小

**常见误区**

```java
// 误区1：认为并行流总是更快
list.parallelStream()  // 不一定！需要根据场景判断

// 误区2：在并行流中使用非线程安全的操作
List<Integer> result = new ArrayList<>();  // ArrayList 不是线程安全的
list.parallelStream()
    .forEach(i -> result.add(i));  // 错误！可能丢失数据

// 正确做法：使用线程安全的收集器
List<Integer> result = list.parallelStream()
    .collect(Collectors.toList());  // 正确
```

**总结**

并行流不是银弹，它在数据量大、计算密集的场景下能显著提升性能，但在数据量小或 IO 密集的场景下反而会因为额外开销而变慢。使用时需要根据实际情况进行性能测试，选择最合适的方案。

---


## 十三、待补充问题

以下问题待补充详细答案：

### 13.1 Java 的动态代理如何实现？

（待补充）

---

### 13.2 Java 序列化的原理是什么？

（待补充）

---

### 13.3 serialVersionUID 有何用途？如果没定义会有什么问题？

（待补充）

---

### 13.4 你知道 fastjson 的反序列化漏洞吗？

（待补充）

---

### 13.5 什么是 AIO、BIO 和 NIO？

（待补充）

---

### 13.6 什么是深拷贝和浅拷贝？

（待补充）

---

### 13.7 什么是 UUID，能保证唯一吗？

（待补充）

---

### **13.8 String中intern的原理是什么？**

（待补充）

---

### 13.9 什么是序列化与反序列化

（待补充）

---

### 13.10 **为什么建议多用组合少用继承？**
待补充）

---

### **13.11 BigDecimal和Long表示金额哪个更合适，怎么选择？**

（待补充）

---
