# 题目ID生成器 - 打包说明

## 📦 方式一：使用脚本一键打包（推荐）

### macOS/Linux
```bash
# 给脚本添加执行权限
chmod +x build.sh

# 执行打包脚本
./build.sh
```

### Windows
```cmd
# 直接运行批处理文件
build.bat
```

打包完成后，JAR 文件位于：`out/jar/qid-generator.jar`

---

## 📦 方式二：手动使用 JDK 命令打包

### 步骤 1：编译 Java 文件

```bash
# 创建输出目录
mkdir -p out/production

# 编译（注意包路径）
javac -d out/production -encoding UTF-8 QuestionIdGenerator.java
```

### 步骤 2：创建 MANIFEST.MF 文件

创建文件 `MANIFEST.MF`，内容如下：
```
Manifest-Version: 1.0
Main-Class: com.zhc.uid.QuestionIdGenerator

```
**注意：** 最后一行必须是空行！

### 步骤 3：打包成 JAR

```bash
# 进入编译输出目录
cd out/production

# 打包
jar cvfm qid-generator.jar ../../MANIFEST.MF com/zhc/uid/*.class

# 移动 JAR 到指定位置
mv qid-generator.jar ../jar/
```

### 步骤 4：测试 JAR

```bash
java -jar out/jar/qid-generator.jar --help
java -jar out/jar/qid-generator.jar -c "测试题目"
```

---

## 📦 方式三：使用 IDEA 打包

### 方法 A：使用 IDEA 的 Artifacts（推荐）

1. **打开项目结构**
   - 菜单：`File` → `Project Structure` (或按 `Cmd+;` / `Ctrl+Alt+Shift+S`)

2. **添加 Artifact**
   - 左侧选择 `Artifacts`
   - 点击 `+` → `JAR` → `From modules with dependencies...`

3. **配置 JAR**
   - `Main Class`: 点击文件夹图标，选择 `com.zhc.uid.QuestionIdGenerator`
   - `JAR files from libraries`: 选择 `extract to the target JAR`
   - `Directory for META-INF/MANIFEST.MF`: 保持默认
   - 点击 `OK`

4. **设置输出路径**
   - `Output directory`: 可以改为 `out/jar`
   - `Name`: 改为 `qid-generator`

5. **构建 JAR**
   - 菜单：`Build` → `Build Artifacts...`
   - 选择 `qid-generator` → `Build`

6. **查找生成的 JAR**
   - 位置：`out/jar/qid-generator.jar`

### 方法 B：使用 IDEA 的快捷方式

1. **右键点击 `QuestionIdGenerator.java`**
2. 选择 `Open Module Settings`
3. 左侧选择 `Artifacts`
4. 按照方法 A 的步骤 2-6 操作

### 方法 C：使用 IDEA 的 Terminal

1. **打开 IDEA 底部的 Terminal**
2. **运行打包脚本**
   ```bash
   # macOS/Linux
   ./build.sh
   
   # Windows
   build.bat
   ```

---

## 🚀 使用打包后的 JAR

### 基本用法

```bash
# 显示帮助
java -jar qid-generator.jar --help

# 生成单个题目ID
java -jar qid-generator.jar -c "Java是值传递还是引用传递？"

# 生成多个题目ID
java -jar qid-generator.jar -c "题目1" -c "题目2" -c "题目3"

# 指定格式
java -jar qid-generator.jar -c "题目" --format=all

# 从文件读取
java -jar qid-generator.jar -f questions.txt

# 交互模式
java -jar qid-generator.jar -i
```

### 创建命令别名（可选）

#### macOS/Linux
在 `~/.bashrc` 或 `~/.zshrc` 中添加：
```bash
alias qid='java -jar /path/to/qid-generator.jar'
```

然后就可以直接使用：
```bash
qid -c "你的题目"
```

#### Windows
创建批处理文件 `qid.bat`：
```batch
@echo off
java -jar "C:\path\to\qid-generator.jar" %*
```

将 `qid.bat` 所在目录添加到系统 PATH，然后就可以：
```cmd
qid -c "你的题目"
```

---

## 🔧 故障排除

### 问题 1：找不到 javac 命令
**解决方案：** 确保已安装 JDK 并配置了环境变量
```bash
# 检查 Java 版本
java -version
javac -version

# 如果没有 javac，需要安装 JDK（不是 JRE）
```

### 问题 2：找不到 jar 命令
**解决方案：** jar 命令包含在 JDK 中，确保使用的是 JDK 而不是 JRE

### 问题 3：运行 JAR 时报错 "no main manifest attribute"
**解决方案：** MANIFEST.MF 文件格式不正确
- 确保 `Main-Class` 后面有冒号和空格
- 确保文件最后有一个空行
- 确保类的完整路径正确：`com.zhc.uid.QuestionIdGenerator`

### 问题 4：运行 JAR 时报错 "找不到或无法加载主类"
**解决方案：** 
- 检查包名是否正确（应该是 `com.zhc.uid`）
- 检查编译时是否使用了 `-d` 参数
- 检查 class 文件是否在正确的目录结构中

### 问题 5：中文乱码
**解决方案：** 
- 编译时添加 `-encoding UTF-8` 参数
- 运行时添加 `-Dfile.encoding=UTF-8` 参数：
  ```bash
  java -Dfile.encoding=UTF-8 -jar qid-generator.jar -c "中文题目"
  ```

---

## 📝 目录结构

打包后的目录结构：
```
.
├── QuestionIdGenerator.java    # 源代码
├── build.sh                     # Linux/macOS 打包脚本
├── build.bat                    # Windows 打包脚本
├── README_BUILD.md              # 本文档
└── out/
    ├── production/              # 编译输出
    │   └── com/zhc/uid/
    │       └── QuestionIdGenerator.class
    ├── jar/                     # JAR 输出
    │   └── qid-generator.jar   # 最终的 JAR 文件
    └── MANIFEST.MF              # 清单文件
```

---

## ✅ 验证打包是否成功

运行以下命令测试：
```bash
# 测试帮助信息
java -jar out/jar/qid-generator.jar --help

# 测试生成ID
java -jar out/jar/qid-generator.jar -c "Java是值传递还是引用传递？" --format=all

# 应该看到类似输出：
# 题目: Java是值传递还是引用传递？
# ------------------------------------------------------------
# ID (Short):    XXXXXXXX
# ID (Base64):   XXXXXXXXXXXX
# ID (Numeric):  XXXXXXXXXX
# ID (Prefixed): Q-XXXXXXXX
```

如果看到以上输出，说明打包成功！🎉
