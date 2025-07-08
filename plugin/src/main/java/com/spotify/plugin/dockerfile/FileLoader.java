package com.spotify.plugin.dockerfile;

import java.io.File;
import java.io.FileReader;

public class FileLoader {

	public String readFile(String path) {
		try {
			File file = new File(path);
			FileReader reader = new FileReader(file);
			int data = reader.read();
			reader.close();

			return String.valueOf((char)data);
		} catch (Exception e) {
			// 모든 예외를 일반적으로 처리함
			System.out.println("파일 읽기 실패: " + e.getMessage());
		}

		return null;
	}
}