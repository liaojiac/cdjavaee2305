package day22.test;

import java.io.File;

public class FileTest {
public static void main(String[] args) {
	File file = new File("E:\\1");
	deleteFile(file);
}
private static void deleteFile(File file) {
    if (file.isDirectory()) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                deleteFile(f);
            }
        }
    }
    if (file.isFile()) {
        if (file.delete()) {
            System.out.println(file.getName() + " 已删除成功");
        } else {
            System.err.println(file.getName() + " 删除失败");
        }
    } else {
        File[] files = file.listFiles();
        if (files == null || files.length == 0) {
            if (file.delete()) {
                System.out.println(file.getName() + " 已删除成功");
            } else {
                System.err.println(file.getName() + " 删除失败");
            }
        }
    }
}
}
