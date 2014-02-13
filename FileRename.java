package tool;

import java.io.File;

public class FileRename {

	public String rename(String string) {
		int start = string.indexOf("(");
		int end = string.indexOf(")") + 1;
		String front = string.substring(0, start);
		String back = string.substring(end, string.length());
		return front + back;
	}

	public void readFolder(String folderName) {
		File folder = new File(folderName);
		if (!folder.exists()) {
		}
		if (folder.isDirectory()) {
			File[] insideFiles = folder.listFiles();
			for (File file : insideFiles) {
				System.out.println(file.getName());
			}
		} else {
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
