package tool;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileRenameTest {

	FileRename fileRename;

	@Test
	public void test() {
		fileRename = new FileRename();
		String hoge = "[hoge](fuga)<piyo>";
		hoge = fileRename.rename(hoge);
		System.out.println("replaceする\n" + hoge);
	}

	@Test
	public void readFolderTest() {
		fileRename = new FileRename();
		fileRename.readFolder("D:\\temp");
	}

	@Test
	public void createNewFolderTest() {
		fileRename = new FileRename();
		String path = "d:\\temp";
		String createdPath = "d:\\temp/sample";
		try {
			assertThat(new File(createdPath).exists(), is(false));
			fileRename.createNewFolder(path);
			assertThat(new File(createdPath).exists(), is(true));
		} finally {
			File deleteFile = new File(createdPath);
			deleteFile.delete();
		}

	}
}
