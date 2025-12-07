import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * 题目ID生成器
 * 根据题目标题生成唯一且一致的ID
 */
public class QuestionIdGenerator {

    /**
     * 生成题目ID（短格式，8位字符）
     * 
     * @param title 题目标题
     * @return 8位唯一ID
     */
    public static String generateShortId(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("题目标题不能为空");
        }
        
        try {
            // 使用 SHA-256 哈希算法
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(title.trim().getBytes(StandardCharsets.UTF_8));
            
            // 取前8个字节转换为16进制字符串
            StringBuilder hexString = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            
            return hexString.toString().toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-256 算法不可用", e);
        }
    }

    /**
     * 生成题目ID（Base64格式，12位字符）
     * 
     * @param title 题目标题
     * @return 12位唯一ID
     */
    public static String generateBase64Id(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("题目标题不能为空");
        }
        
        try {
            // 使用 SHA-256 哈希算法
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(title.trim().getBytes(StandardCharsets.UTF_8));
            
            // 取前9个字节进行 Base64 编码（9字节 = 12个Base64字符）
            byte[] shortHash = new byte[9];
            System.arraycopy(hash, 0, shortHash, 0, 9);
            
            // Base64 编码并移除填充字符
            return Base64.getUrlEncoder()
                    .withoutPadding()
                    .encodeToString(shortHash);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-256 算法不可用", e);
        }
    }

    /**
     * 生成题目ID（数字格式，10位数字）
     * 
     * @param title 题目标题
     * @return 10位数字ID
     */
    public static String generateNumericId(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("题目标题不能为空");
        }
        
        try {
            // 使用 SHA-256 哈希算法
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(title.trim().getBytes(StandardCharsets.UTF_8));
            
            // 将前8个字节转换为long，然后取绝对值并限制在10位数字内
            long value = 0;
            for (int i = 0; i < 8; i++) {
                value = (value << 8) | (hash[i] & 0xFF);
            }
            
            // 取绝对值并限制在10位数字范围内
            long id = Math.abs(value) % 10000000000L;
            
            // 格式化为10位数字（不足补0）
            return String.format("%010d", id);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-256 算法不可用", e);
        }
    }

    /**
     * 生成题目ID（混合格式，带前缀，如 Q-A1B2C3D4）
     * 
     * @param title 题目标题
     * @return 带前缀的唯一ID
     */
    public static String generatePrefixedId(String title) {
        return "Q-" + generateShortId(title);
    }

    /**
     * 打印使用帮助
     */
    private static void printHelp() {
        System.out.println("题目ID生成器 - 使用说明");
        System.out.println("=".repeat(60));
        System.out.println("\n用法:");
        System.out.println("  1. 单个题目生成:");
        System.out.println("     java QuestionIdGenerator --content=\"题目内容\"");
        System.out.println("     java QuestionIdGenerator -c \"题目内容\"");
        System.out.println();
        System.out.println("  2. 多个题目生成:");
        System.out.println("     java QuestionIdGenerator --content=\"题目1\" --content=\"题目2\"");
        System.out.println("     java QuestionIdGenerator -c \"题目1\" -c \"题目2\" -c \"题目3\"");
        System.out.println();
        System.out.println("  3. 指定ID格式:");
        System.out.println("     --format=short    (默认，8位16进制)");
        System.out.println("     --format=base64   (12位Base64)");
        System.out.println("     --format=numeric  (10位数字)");
        System.out.println("     --format=prefixed (带Q-前缀)");
        System.out.println("     --format=all      (显示所有格式)");
        System.out.println();
        System.out.println("  4. 从文件读取:");
        System.out.println("     java QuestionIdGenerator --file=questions.txt");
        System.out.println("     java QuestionIdGenerator -f questions.txt");
        System.out.println();
        System.out.println("  5. 交互模式:");
        System.out.println("     java QuestionIdGenerator --interactive");
        System.out.println("     java QuestionIdGenerator -i");
        System.out.println();
        System.out.println("  6. 显示帮助:");
        System.out.println("     java QuestionIdGenerator --help");
        System.out.println("     java QuestionIdGenerator -h");
        System.out.println();
        System.out.println("示例:");
        System.out.println("  java QuestionIdGenerator -c \"Java是值传递还是引用传递？\"");
        System.out.println("  java QuestionIdGenerator --format=all -c \"什么是多态？\"");
        System.out.println("  java QuestionIdGenerator -c \"题目1\" -c \"题目2\" --format=numeric");
        System.out.println();
    }

    /**
     * 生成并打印ID
     */
    private static void generateAndPrint(String title, String format) {
        if (title == null || title.trim().isEmpty()) {
            System.err.println("错误: 题目内容不能为空");
            return;
        }

        System.out.println("\n题目: " + title);
        System.out.println("-".repeat(60));

        switch (format.toLowerCase()) {
            case "short":
                System.out.println("ID (Short):    " + generateShortId(title));
                break;
            case "base64":
                System.out.println("ID (Base64):   " + generateBase64Id(title));
                break;
            case "numeric":
                System.out.println("ID (Numeric):  " + generateNumericId(title));
                break;
            case "prefixed":
                System.out.println("ID (Prefixed): " + generatePrefixedId(title));
                break;
            case "all":
                System.out.println("ID (Short):    " + generateShortId(title));
                System.out.println("ID (Base64):   " + generateBase64Id(title));
                System.out.println("ID (Numeric):  " + generateNumericId(title));
                System.out.println("ID (Prefixed): " + generatePrefixedId(title));
                break;
            default:
                System.err.println("错误: 未知的格式 '" + format + "'");
                System.out.println("ID (Short):    " + generateShortId(title));
        }
    }

    /**
     * 交互模式
     */
    private static void interactiveMode(String format) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("\n=== 交互模式 ===");
        System.out.println("输入题目内容，按回车生成ID");
        System.out.println("输入 'quit' 或 'exit' 退出");
        System.out.println("当前格式: " + format);
        System.out.println("=".repeat(60));

        while (true) {
            System.out.print("\n请输入题目 > ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("exit")) {
                System.out.println("退出交互模式");
                break;
            }

            if (input.isEmpty()) {
                System.out.println("题目内容不能为空，请重新输入");
                continue;
            }

            generateAndPrint(input, format);
        }
    }

    /**
     * 从文件读取题目
     */
    private static void readFromFile(String filename, String format) {
        try {
            java.nio.file.Path path = java.nio.file.Paths.get(filename);
            java.util.List<String> lines = java.nio.file.Files.readAllLines(path, StandardCharsets.UTF_8);
            
            System.out.println("\n从文件读取: " + filename);
            System.out.println("共 " + lines.size() + " 个题目");
            System.out.println("=".repeat(60));

            int count = 0;
            for (String line : lines) {
                line = line.trim();
                if (!line.isEmpty() && !line.startsWith("#")) {
                    count++;
                    System.out.println("\n[" + count + "]");
                    generateAndPrint(line, format);
                }
            }
        } catch (java.io.IOException e) {
            System.err.println("错误: 无法读取文件 '" + filename + "'");
            System.err.println("原因: " + e.getMessage());
        }
    }

    /**
     * 主方法
     */
    public static void main(String[] args) {
        // 如果没有参数，显示帮助
        if (args.length == 0) {
            printHelp();
            return;
        }

        java.util.List<String> contents = new java.util.ArrayList<>();
        String format = "short";
        String filename = null;
        boolean interactive = false;

        // 解析命令行参数
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

            if (arg.equals("--help") || arg.equals("-h")) {
                printHelp();
                return;
            } else if (arg.equals("--interactive") || arg.equals("-i")) {
                interactive = true;
            } else if (arg.startsWith("--content=")) {
                contents.add(arg.substring("--content=".length()));
            } else if (arg.equals("--content") || arg.equals("-c")) {
                if (i + 1 < args.length) {
                    contents.add(args[++i]);
                } else {
                    System.err.println("错误: --content 需要指定内容");
                    return;
                }
            } else if (arg.startsWith("--format=")) {
                format = arg.substring("--format=".length());
            } else if (arg.equals("--format") || arg.equals("-fmt")) {
                if (i + 1 < args.length) {
                    format = args[++i];
                } else {
                    System.err.println("错误: --format 需要指定格式");
                    return;
                }
            } else if (arg.startsWith("--file=")) {
                filename = arg.substring("--file=".length());
            } else if (arg.equals("--file") || arg.equals("-f")) {
                if (i + 1 < args.length) {
                    filename = args[++i];
                } else {
                    System.err.println("错误: --file 需要指定文件名");
                    return;
                }
            } else {
                System.err.println("错误: 未知参数 '" + arg + "'");
                System.err.println("使用 --help 查看帮助");
                return;
            }
        }

        // 执行相应的操作
        if (interactive) {
            interactiveMode(format);
        } else if (filename != null) {
            readFromFile(filename, format);
        } else if (!contents.isEmpty()) {
            System.out.println("\n=== 题目ID生成结果 ===");
            System.out.println("格式: " + format);
            System.out.println("题目数量: " + contents.size());
            System.out.println("=".repeat(60));

            for (int i = 0; i < contents.size(); i++) {
                System.out.println("\n[" + (i + 1) + "]");
                generateAndPrint(contents.get(i), format);
            }
        } else {
            System.err.println("错误: 请指定题目内容、文件或使用交互模式");
            System.err.println("使用 --help 查看帮助");
        }
    }
}
