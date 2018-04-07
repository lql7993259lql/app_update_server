package com.jiaxianghudong.weile;

public class BsDiff {

	/**
	 * 差分
	 * 
	 * @param oldfile
	 * @param newfile
	 * @param patchfile
	 */
	public native static void diff(String oldfile, String newfile, String patchfile);

	static{
		System.loadLibrary("Bsdiff2");
	}
}
