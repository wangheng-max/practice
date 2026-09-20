package demo1;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) {
        File dir = new File("D:/");
        try {
            searchFile(dir, "QQ.exe");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void searchFile(File dir, String filename) throws IOException {
        if (dir == null || !dir.exists() || dir.isFile()) {
            return;
        }
        File[] files = dir.listFiles();
        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isFile()) {
                    // 精确匹配文件名
                    if (file.getName().contains(filename)) {
                        System.out.println(file.getAbsolutePath());
                        Runtime r=Runtime.getRuntime();
                        r.exec(file.getAbsolutePath());
                    }
                } else if (file.isDirectory()) {
                    // 递归进入子目录
                    searchFile(file, filename);
                }
            }
        }
    }
}