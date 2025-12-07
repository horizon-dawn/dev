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
     * 测试方法
     */
    public static void main(String[] args) {
        // 测试题目列表
        String[] questions = {
            "Java 和 C++ 主要有哪些区别？分别有什么优缺点？",
            "如何理解面向对象和面向过程？",
            "Java 是值传递还是引用传递？",
            "为什么 Java 不支持多继承？",
            "接口和抽象类的区别，如何选择？",
            "如何理解 Java 中的多态？",
            "为什么建议自定义一个无参构造函数？",
            "为什么 Java 中的 main 方法必须是 public static void 的？",
            "有了 equals 为什么还需要 hashCode 方法？",
            "反射与封装是否矛盾？如何解决反射破坏封装的问题？"
        };

        System.out.println("=== 短格式ID（16进制，8位）===");
        for (String question : questions) {
            System.out.println(generateShortId(question) + " - " + question);
        }

        System.out.println("\n=== Base64格式ID（12位）===");
        for (String question : questions) {
            System.out.println(generateBase64Id(question) + " - " + question);
        }

        System.out.println("\n=== 数字格式ID（10位）===");
        for (String question : questions) {
            System.out.println(generateNumericId(question) + " - " + question);
        }

        System.out.println("\n=== 带前缀格式ID ===");
        for (String question : questions) {
            System.out.println(generatePrefixedId(question) + " - " + question);
        }

        // 验证一致性
        System.out.println("\n=== 验证一致性 ===");
        String testTitle = "Java 和 C++ 主要有哪些区别？分别有什么优缺点？";
        System.out.println("第一次生成: " + generateShortId(testTitle));
        System.out.println("第二次生成: " + generateShortId(testTitle));
        System.out.println("第三次生成: " + generateShortId(testTitle));
        System.out.println("结果一致: " + 
            generateShortId(testTitle).equals(generateShortId(testTitle)));
    }
}
