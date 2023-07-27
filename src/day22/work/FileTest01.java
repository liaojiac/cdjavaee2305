package day22.work;
import java.io.File;
public class FileTest01 {
public static void main(String[] args) {
	File file = new File("E:\\新建文件夹");
	deleteFile(file);
}
private static void deleteFile(File file) {
    if(file.isDirectory()) {
    	File[] listFiles = file.listFiles();
    	for (File f : listFiles) {
    		deleteFile(f);
		}
    }
        if (file.delete()) {
            System.out.println(file.getName() + " 已删除成功");
        } else {
            System.err.println(file.getName() + " 删除失败");
        }
    
}
}