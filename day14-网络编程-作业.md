### 网络编程作业题

#### 一、选择题

1、下列属于 C/S 结构的应用程序是？
A. 谷歌浏览器访问网页
B. QQ 聊天软件
C. 用火狐浏览器查看在线视频
D. 通过浏览器登录在线邮箱

A

2、关于 TCP 和 UDP 协议的特点，下列说法正确的是？
A. TCP 是面向无连接的协议，传输速度快
B. UDP 是面向连接的协议，数据传输可靠
C. TCP 需要三次握手建立连接，数据传输可靠
D. UDP 每次发送的数据大小没有限制 (64K)

C

3、网络编程三要素不包括以下哪项？
A. 协议
B. IP 地址
C. 端口号
D. 硬件设备型号
D


4、Java 中，创建客户端套接字并连接到指定服务端的正确构造方法是？
A. new ServerSocket(int port)
B. new Socket(String host, int port)
C. new Socket(InputStream in)
D. new ServerSocket(String host, int port)

B

5、ServerSocket 类的 accept () 方法的特点是？
A. 立即返回一个 Socket 对象，无需等待
B. 用于向客户端发送数据
C. 会阻塞当前线程，直到有客户端连接
D. 可以同时处理多个客户端连接

C

#### 二、问答题

1、简述 TCP 协议建立连接时的 “三次握手” 过程。

| **步骤**    | **发起方**                       | **接收方**                                                                 | **目的**                                                                  |
| --------- | ----------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| **第一次握手** | **客户端** $\rightarrow$ **服务端** | 发送 **SYN** 报文段携带随机生成的初始序列号 $Seq=X$。                                     | 客户端询问：“你在线吗？我要同步我的初始序列号 $X$。” 确认**客户端具备发送能力**。                          |
| **第二次握手** | **服务端** $\rightarrow$ **客户端** | 发送 **SYN** 和 **ACK** 报文段。**ACK** 确认号 $Ack=X+1$；同时携带服务端自己的初始序列号 $Seq=Y$。 | 服务端回应：“我在线，我收到了你的 $X$，并将确认号设为 $X+1$；这是我的初始序列号 $Y$。” 确认**服务端具备发送和接收能力**。 |
| **第三次握手** | **客户端** $\rightarrow$ **服务端** | 发送 **ACK** 报文段，携带确认号 $Ack=Y+1$。                                         | 客户端回应：“我收到了你的序列号 $Y$。” **确认客户端具备接收能力**。                                 |

2、简述 TCP 通信中，客户端和服务端的基本交互步骤（从服务端启动到通信结束）。

### **A. 服务器端准备 (Server)**

1. **创建 `ServerSocket` (开门迎客):** 服务器启动，创建一个 `ServerSocket` 对象，并**绑定**到一个特定的 IP 地址和**端口号**（例如 80 或 443），用于监听客户端的连接请求。
    
2. **进入监听状态 (`listen`):** `ServerSocket` 进入监听状态，等待来自客户端的连接请求，此时服务器处于**阻塞**状态。
    

### **B. 客户端请求连接 (Client)**

3. **创建 `Socket` (找地址):** 客户端创建一个 `Socket` 对象，指定要连接的**服务器 IP 地址**和**端口号**。
    
4. **发起连接 (`connect`):** 客户端向服务器发送 **SYN** 报文段，触发**三次握手**过程。
    

### **C. 建立连接与数据传输**

5. **接受连接 (`accept`):** 服务器端从监听队列中取出客户端的连接请求，通过**三次握手**建立连接。`ServerSocket` 返回一个新的 **`Socket`** 对象（称为**连接 Socket**）用于后续通信。
    
6. **数据传输:** 客户端和服务器都通过这个**连接 Socket** 获得**输入流** (`InputStream`) 和**输出流** (`OutputStream`)，开始互相发送和接收数据。
    

### **D. 断开连接 (四次挥手)**

7. **断开请求 (`close`):** 当数据传输完毕，通信的任意一方（通常是客户端）发起断开连接的请求，发送 **FIN** 报文段（终止连接），触发**四次挥手**过程。
    
8. **关闭连接:** 经过四次报文确认，确保双方所有数据都已发送和接收完毕后，**连接 Socket** 被安全关闭。

#### 三、编程题

1、使用 TCP 协议实现字符串数据传输：
要求：
- 客户端向服务端发送字符串 “Hello TCP!”
- 服务端接收字符串后，向客户端回写 “已收到：Hello TCP!”
- 通信结束后关闭所有资源

**服务器：**

```java
package com.zhc;  
  
import java.io.BufferedInputStream;  
import java.io.IOException;  
import java.io.InputStream;  
import java.io.OutputStream;  
import java.net.ServerSocket;  
import java.net.Socket;  
import java.nio.charset.StandardCharsets;  
  
public class TcpServer {  
  
    public static void main(String[] args) throws IOException {  
        ServerSocket ss = new ServerSocket(1290);  
  
        Socket accept = ss.accept();  
        InputStream in = accept.getInputStream();  
        OutputStream out = accept.getOutputStream();  
        byte[] content = new byte[8192];  
        int count;  
        while ((count = in.read(content)) != -1) {  
            out.write("已收到：".getBytes(StandardCharsets.UTF_8));  
            out.write(content, 0, count);  
            accept.shutdownOutput();  
        }  
        // release resource  
        out.close();  
        in.close();  
        ss.close();  
    }  
}
```

**客户端：**

```java
package com.zhc;  
  
import java.io.IOException;  
import java.io.InputStream;  
import java.io.OutputStream;  
import java.net.Socket;  
import java.nio.charset.StandardCharsets;  
  
/*  
    1、使用 TCP 协议实现字符串数据传输：  
    要求：  
    - 客户端向服务端发送字符串 “Hello TCP!”    - 服务端接收字符串后，向客户端回写 “已收到：Hello TCP!”  
    - 通信结束后关闭所有资源  
 */public class TcpClient {  
    public static void main(String[] args) throws IOException {  
        Socket socket = new Socket("127.0.0.1", 1290);  
        OutputStream out = socket.getOutputStream();  
        out.write("Hello TCP!".getBytes(StandardCharsets.UTF_8));  
        socket.shutdownOutput();  
        InputStream in = socket.getInputStream();  
        System.out.println("服务器处理后的数据:" + new String(in.readAllBytes()));  
  
        // release resource  
        in.close();  
        out.close();  
        socket.close();  
    }  
}
```

2、使用 TCP 协议实现简单文件下载功能：
要求：

- 服务端存在文件 “serverFile.txt”（假设文件存在），客户端请求下载该文件
- 服务端读取文件内容并发送给客户端
- 客户端接收文件内容后，保存为 “clientFile.txt”
- 客户端接收完成后，直接提示 “文件下载成功”
- 通信结束后关闭所有资源

**客户端：**
```java
package com.zhc.installfile;  
  
import cn.hutool.core.io.FileUtil;  
  
import java.io.IOException;  
import java.io.InputStream;  
import java.io.OutputStream;  
import java.net.Socket;  
import java.nio.charset.StandardCharsets;  
import java.util.ArrayList;  
import java.util.List;  
  
public class FileClient {  
  
  
    public static void main(String[] args) throws IOException {  
        String path = "/Users/zhc/project/hutool/serverFile.txt";  
  
        Socket socket = new Socket("127.0.0.1", 1290);  
        OutputStream out = socket.getOutputStream();  
        InputStream in = socket.getInputStream();  
        out.write(path.getBytes(StandardCharsets.UTF_8));  
        socket.shutdownOutput();  
  
        int count;  
        byte[] content = new byte[8192];  
        List<Byte> list = new ArrayList<>();  
        while ((count = in.read(content)) != -1) {  
            for(int i = 0; i< count;++i) {  
                list.add(content[i]);  
            }  
        }  
  
        byte[] bytes = new byte[list.size()];  
        for(int i = 0; i< list.size();++i) {  
            bytes[i] = list.get(i);  
        }  
  
        FileUtil.writeBytes(bytes,"/Users/zhc/project/hutool/src/main/resources/serverFile.txt");  
        out.close();  
        in.close();  
        socket.close();  
    }  
}
```

**服务器：**

```java
package com.zhc.installfile;  
  
import cn.hutool.core.io.FileUtil;  
import com.zhc.communication.Server;  
  
import java.io.*;  
import java.net.ServerSocket;  
import java.net.Socket;  
import java.nio.charset.StandardCharsets;  
import java.util.ArrayList;  
import java.util.List;  
  
public class FileServer {  
    public static void main(String[] args) throws IOException {  
        ServerSocket ss = new ServerSocket(1290);  
        Socket clientSocket = ss.accept();  
        InputStream in = clientSocket.getInputStream();  
        OutputStream out = clientSocket.getOutputStream();  
  
  
        int count;  
        byte[] content = new byte[8192];  
        List<Byte> list = new ArrayList<>();  
        while ((count = in.read(content)) != -1) {  
            for(int i = 0; i< count;++i) {  
                list.add(content[i]);  
            }  
        }  
  
        byte[] bytes = new byte[list.size()];  
        for(int i = 0; i< list.size();++i) {  
            bytes[i] = list.get(i);  
        }  
  
        String path = new String(bytes, StandardCharsets.UTF_8);  
        // 将文件发送给客户端  
        byte[] fileContent = FileUtil.readBytes(path);  
        out.write(fileContent);  
        clientSocket.shutdownOutput();  
  
        out.close();  
        in.close();  
        clientSocket.close();  
        ss.close();  
    }  
}
```

