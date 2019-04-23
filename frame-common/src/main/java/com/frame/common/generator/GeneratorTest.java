package com.frame.common.generator;

import java.util.HashMap;
import java.util.Map;

/**
 * 代码生成
 *
 * @author ly
 */
@SuppressWarnings("unchecked")
public class GeneratorTest extends BaseBizGenerator {
    /**
     * 测试 run 执行 注意：不生成service接口 注意：不生成service接口 注意：不生成service接口
     * <p>
     * 配置方法查看
     * </p>
     */
    public static void main(String[] args) {
        GeneratorTest generator = new GeneratorTest();
        String outputDir = "D:\\frame-gao\\frame-common\\frame-common-log\\src\\main\\java";
        String[] tableArray = new String[]{
                "TBL_SYS_LOG", "TBL_SYS_LOG_DETAIL"
        };
        String packageDir = "com.frame.common";
        String xmlDir = "D:\\frame-gao\\frame-common\\frame-common-log\\src\\main\\resources\\mapper\\modules\\frame\\log\\";

        Map customConfig = new HashMap(6);
        customConfig.put("logModel", "FrameModelConstant.SYS");
        generator.autoGenerator(outputDir, false, tableArray, packageDir, xmlDir, "sys", customConfig);

    }
}
