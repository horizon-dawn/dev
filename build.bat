@echo off
REM 题目ID生成器 - 打包脚本（Windows）

echo === 开始编译和打包 ===

REM 1. 创建输出目录
echo 1. 创建输出目录...
if not exist out\production mkdir out\production
if not exist out\jar mkdir out\jar

REM 2. 编译 Java 文件
echo 2. 编译 Java 文件...
javac -d out\production -encoding UTF-8 QuestionIdGenerator.java

if %errorlevel% neq 0 (
    echo 错误: 编译失败
    exit /b 1
)

REM 3. 创建 MANIFEST.MF 文件
echo 3. 创建 MANIFEST.MF...
(
echo Manifest-Version: 1.0
echo Main-Class: com.zhc.uid.QuestionIdGenerator
echo Created-By: 1.0 ^(zhc^)
echo.
) > out\MANIFEST.MF

REM 4. 打包成 JAR
echo 4. 打包成 JAR...
cd out\production
jar cvfm ..\jar\qid-generator.jar ..\MANIFEST.MF com\zhc\uid\*.class
cd ..\..

if %errorlevel% neq 0 (
    echo 错误: 打包失败
    exit /b 1
)

echo.
echo === 打包成功 ===
echo JAR 文件位置: out\jar\qid-generator.jar
echo.
echo 使用方法:
echo   java -jar out\jar\qid-generator.jar --help
echo   java -jar out\jar\qid-generator.jar -c "你的题目"
echo.

REM 5. 测试 JAR
echo === 测试 JAR ===
java -jar out\jar\qid-generator.jar -c "测试题目：Java是值传递还是引用传递？"

pause
