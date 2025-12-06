# Java IO 流继承体系

## 字节流继承体系

```mermaid
graph TB
    subgraph 字节输入流
        InputStream[InputStream<br/>抽象基类]
        InputStream --> FileInputStream[FileInputStream<br/>文件输入流]
        InputStream --> ByteArrayInputStream[ByteArrayInputStream<br/>字节数组输入流]
        InputStream --> PipedInputStream[PipedInputStream<br/>管道输入流]
        InputStream --> FilterInputStream[FilterInputStream<br/>过滤输入流]
        InputStream --> ObjectInputStream[ObjectInputStream<br/>对象输入流]
        
        FilterInputStream --> BufferedInputStream[BufferedInputStream<br/>缓冲输入流]
        FilterInputStream --> DataInputStream[DataInputStream<br/>数据输入流]
        FilterInputStream --> PushbackInputStream[PushbackInputStream<br/>推回输入流]
    end
    
    style InputStream fill:#ff9999
    style FilterInputStream fill:#ffcc99
```

```mermaid
graph TB
    subgraph 字节输出流
        OutputStream[OutputStream<br/>抽象基类]
        OutputStream --> FileOutputStream[FileOutputStream<br/>文件输出流]
        OutputStream --> ByteArrayOutputStream[ByteArrayOutputStream<br/>字节数组输出流]
        OutputStream --> PipedOutputStream[PipedOutputStream<br/>管道输出流]
        OutputStream --> FilterOutputStream[FilterOutputStream<br/>过滤输出流]
        OutputStream --> ObjectOutputStream[ObjectOutputStream<br/>对象输出流]
        
        FilterOutputStream --> BufferedOutputStream[BufferedOutputStream<br/>缓冲输出流]
        FilterOutputStream --> DataOutputStream[DataOutputStream<br/>数据输出流]
        FilterOutputStream --> PrintStream[PrintStream<br/>打印流]
    end
    
    style OutputStream fill:#99ccff
    style FilterOutputStream fill:#99ffcc
```

## 字符流继承体系

```mermaid
graph TB
    subgraph 字符输入流
        Reader[Reader<br/>抽象基类]
        Reader --> InputStreamReader[InputStreamReader<br/>转换流]
        Reader --> FileReader[FileReader<br/>文件读取流]
        Reader --> CharArrayReader[CharArrayReader<br/>字符数组读取流]
        Reader --> StringReader[StringReader<br/>字符串读取流]
        Reader --> PipedReader[PipedReader<br/>管道读取流]
        Reader --> BufferedReader[BufferedReader<br/>缓冲读取流]
        Reader --> FilterReader[FilterReader<br/>过滤读取流]
        
        InputStreamReader --> FileReader2[FileReader<br/>继承自InputStreamReader]
        BufferedReader --> LineNumberReader[LineNumberReader<br/>行号读取流]
        FilterReader --> PushbackReader[PushbackReader<br/>推回读取流]
    end
    
    style Reader fill:#ffccff
    style InputStreamReader fill:#ccffff
    style BufferedReader fill:#ffffcc
```

```mermaid
graph TB
    subgraph 字符输出流
        Writer[Writer<br/>抽象基类]
        Writer --> OutputStreamWriter[OutputStreamWriter<br/>转换流]
        Writer --> FileWriter[FileWriter<br/>文件写入流]
        Writer --> CharArrayWriter[CharArrayWriter<br/>字符数组写入流]
        Writer --> StringWriter[StringWriter<br/>字符串写入流]
        Writer --> PipedWriter[PipedWriter<br/>管道写入流]
        Writer --> BufferedWriter[BufferedWriter<br/>缓冲写入流]
        Writer --> PrintWriter[PrintWriter<br/>打印写入流]
        Writer --> FilterWriter[FilterWriter<br/>过滤写入流]
        
        OutputStreamWriter --> FileWriter2[FileWriter<br/>继承自OutputStreamWriter]
    end
    
    style Writer fill:#ccffcc
    style OutputStreamWriter fill:#ffcccc
    style BufferedWriter fill:#ccccff
```

## 完整继承关系图

```mermaid
graph TB
    subgraph 字节流体系
        InputStream[InputStream]
        OutputStream[OutputStream]
    end
    
    subgraph 字符流体系
        Reader[Reader]
        Writer[Writer]
    end
    
    subgraph 转换桥梁
        InputStreamReader[InputStreamReader]
        OutputStreamWriter[OutputStreamWriter]
    end
    
    InputStream -.字节转字符.-> InputStreamReader
    InputStreamReader --> Reader
    
    Writer --> OutputStreamWriter
    OutputStreamWriter -.字符转字节.-> OutputStream
    
    style InputStream fill:#ff9999
    style OutputStream fill:#99ccff
    style Reader fill:#ffccff
    style Writer fill:#ccffcc
    style InputStreamReader fill:#ffff99
    style OutputStreamWriter fill:#99ffff
```

## 流的分类说明

### 按数据单位分类

1. **字节流**：以字节（8位）为单位进行数据传输
   - InputStream / OutputStream
   - 适合处理二进制数据（图片、音频、视频等）

2. **字符流**：以字符（16位）为单位进行数据传输
   - Reader / Writer
   - 适合处理文本数据，自动处理字符编码

### 按流向分类

1. **输入流**：从数据源读取数据到程序
   - InputStream / Reader

2. **输出流**：从程序写入数据到目的地
   - OutputStream / Writer

### 按功能分类

1. **节点流**：直接与数据源或目的地连接
   - FileInputStream、FileOutputStream
   - FileReader、FileWriter

2. **处理流**：对其他流进行包装，提供额外功能
   - BufferedInputStream、BufferedOutputStream
   - BufferedReader、BufferedWriter
   - DataInputStream、DataOutputStream
   - ObjectInputStream、ObjectOutputStream

## 常用流的使用场景

| 流类型 | 使用场景 | 特点 |
|--------|----------|------|
| FileInputStream/FileOutputStream | 读写文件的字节数据 | 适合二进制文件 |
| FileReader/FileWriter | 读写文件的字符数据 | 适合文本文件 |
| BufferedInputStream/BufferedOutputStream | 提高字节流读写效率 | 内部缓冲区 |
| BufferedReader/BufferedWriter | 提高字符流读写效率 | 内部缓冲区，支持按行读写 |
| InputStreamReader/OutputStreamWriter | 字节流与字符流转换 | 桥接流，可指定字符编码 |
| DataInputStream/DataOutputStream | 读写基本数据类型 | 保持数据类型 |
| ObjectInputStream/ObjectOutputStream | 读写对象（序列化） | 对象持久化 |
| PrintStream/PrintWriter | 格式化输出 | 提供print、println方法 |

## 使用示例

### 字节流读写文件

```java
// 使用 FileInputStream 和 FileOutputStream
try (FileInputStream fis = new FileInputStream("input.txt");
     FileOutputStream fos = new FileOutputStream("output.txt")) {
    byte[] buffer = new byte[1024];
    int len;
    while ((len = fis.read(buffer)) != -1) {
        fos.write(buffer, 0, len);
    }
}
```

### 字符流读写文件（带缓冲）

```java
// 使用 BufferedReader 和 BufferedWriter
try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
     BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
    String line;
    while ((line = br.readLine()) != null) {
        bw.write(line);
        bw.newLine();
    }
}
```

### 字节流转字符流

```java
// 使用 InputStreamReader 指定编码
try (InputStreamReader isr = new InputStreamReader(
        new FileInputStream("input.txt"), "UTF-8");
     BufferedReader br = new BufferedReader(isr)) {
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
}
```

### 对象序列化

```java
// 写入对象
try (ObjectOutputStream oos = new ObjectOutputStream(
        new FileOutputStream("object.dat"))) {
    oos.writeObject(myObject);
}

// 读取对象
try (ObjectInputStream ois = new ObjectInputStream(
        new FileInputStream("object.dat"))) {
    MyClass obj = (MyClass) ois.readObject();
}
```

## 注意事项

1. **及时关闭流**：使用 try-with-resources 自动关闭流，避免资源泄露
2. **使用缓冲流**：BufferedInputStream/BufferedReader 可以显著提高性能
3. **字符编码**：使用字符流时注意指定正确的字符编码
4. **异常处理**：IO 操作需要处理 IOException
5. **装饰器模式**：处理流采用装饰器模式，可以灵活组合功能
