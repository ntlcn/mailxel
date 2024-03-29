package ch.heftix.mailxel.server;

import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

/**
 * DummyTrustManager - NOT SECURE
 */
public class DummyTrustManager implements X509TrustManager {

	public void checkClientTrusted(X509Certificate[] cert, String authType) {
		// everything is trusted
	}

	public void checkServerTrusted(X509Certificate[] cert, String authType) {
		// everything is trusted
	}

	public X509Certificate[] getAcceptedIssuers() {
		return new X509Certificate[0];
	}
}
