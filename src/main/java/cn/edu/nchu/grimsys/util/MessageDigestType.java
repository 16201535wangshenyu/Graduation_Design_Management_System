package cn.edu.nchu.grimsys.util;

/**
 * 162015班  第11组
 * 毕设信息管理系统--模块
 * @author：
 * date：2019-6-
 * 主要功能说明：
 */
public enum MessageDigestType {
	MD5("MD5"), SHA1("SHA1") , SHA224( "SHA-224" ), SHA256( "SHA-256" ) , SHA384( "SHA-384" ) , SHA512( "SHA-512" );

	private String algorithmName;

	private MessageDigestType(String algorithmName) {
		this.algorithmName = algorithmName;
	}

	public String getAlgorithmName() {
		return algorithmName;
	}

	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
	}

}
