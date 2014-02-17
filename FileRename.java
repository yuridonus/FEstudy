package tool;

import java.io.File;

public class FileRename {

	public String rename(String string) {
		int start = string.indexOf("(");
		int end = string.indexOf(")") + 1;
		// 見つからない場合なにもしない
		if (start == -1 || end == 0) {
			return string;
		}
		String front = string.substring(0, start);
		String back = string.substring(end, string.length());
		return front + back;
	}

	public void readFolder(String folderName) {
		File folder = new File(folderName);
		if (folder.exists()) {
			if (folder.isDirectory()) {
				File[] insideFiles = folder.listFiles();
				for (File file : insideFiles) {
					String fileName = file.getAbsolutePath();
					File newNameFile = new File(rename(fileName));
					System.out.println(newNameFile.getAbsolutePath());
					// リネーム
					file.renameTo(newNameFile);
				}
			} else {
				System.out.println(folder.getName());
			}
		} else {
			System.out.println("ないです");
		}
	}

	public void createNewFolder(String folderName) {
		File emptyDirectry = new File(folderName, "sample");
		// すでにある場合は作らず終了
		if (!emptyDirectry.exists()) {
			emptyDirectry.mkdir();
		}
	}
}
