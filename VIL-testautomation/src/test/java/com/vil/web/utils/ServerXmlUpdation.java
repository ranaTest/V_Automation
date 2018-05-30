package com.vil.web.utils;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.apache.commons.io.IOUtils;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import com.vil.web.library.GenericLib;

/**
 *
 * This is a sample application that demonstrates how to use the Jakarta
 * HttpClient API.
 *
 * This application sends an XML document to a remote web server using HTTP POST
 *
 * @author Srinivas Hippargi
 */
public class ServerXmlUpdation {
	public static void uploadXmlToServer(String localXmlFilePath) {
		// Remember use the required imports (the library as well) using :

		/// then in our function
		try {
			JSch ssh = new JSch();
			// String privateKey = "C:/Users/rp003786/Desktop/Privatekey.ppk";

			// ssh.addIdentity(privateKey);
			String sConfig = GenericLib.sDirPath + "/propertyfiles/siebelserverconfig.properties";
			String username = GenericLib.getProprtyValue(sConfig, "USERNAME");
			String host = GenericLib.getProprtyValue(sConfig, "HOST");
			String port = GenericLib.getProprtyValue(sConfig, "PORT");
			int portNumber = Integer.parseInt(port);
			String password = GenericLib.getProprtyValue(sConfig, "PASSWORD");
			String destXmlFile = GenericLib.getProprtyValue(sConfig, "SERVERCAFXML");

			System.out.println("identity added ");
			Session session = ssh.getSession(username, host, portNumber);
			// Remember that this is just for testing and we need a quick
			// access, you can add an identity and known_hosts file to prevent
			// Man In the Middle attacks
			java.util.Properties config = new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			session.setConfig(config);
			session.setPassword(password);

			session.connect();
			Channel channel = session.openChannel("sftp");
			channel.connect();

			ChannelSftp sftp = (ChannelSftp) channel;

			sftp.put(localXmlFilePath, destXmlFile);

			Boolean success = true;

			if (success) {
				System.out.println("Uploaded");
			}
			channel.disconnect();
			session.disconnect();
		} catch (JSchException e) {
			System.out.println(e.getMessage().toString());
			e.printStackTrace();
		} catch (SftpException e) {
			System.out.println(e.getMessage().toString());
			e.printStackTrace();
		}

	}

	public static void readXmlFromServer() throws IOException, SftpException {
		try {
			JSch ssh = new JSch();
			// String privateKey = "C:/Users/rp003786/Desktop/Privatekey.ppk";

			// ssh.addIdentity(privateKey);
			String sConfig = GenericLib.sDirPath + "/propertyfiles/siebelserverconfig.properties";
			String username = GenericLib.getProprtyValue(sConfig, "USERNAME");
			String host = GenericLib.getProprtyValue(sConfig, "HOST");
			String port = GenericLib.getProprtyValue(sConfig, "PORT");
			int portNumber = Integer.parseInt(port);
			String password = GenericLib.getProprtyValue(sConfig, "PASSWORD");
			String srcXmlFile = GenericLib.getProprtyValue(sConfig, "LOCALCAFXML");
			String destXmlFile = GenericLib.getProprtyValue(sConfig, "SERVERCAFXML");

			System.out.println("identity added ");
			Session session = ssh.getSession(username, host, portNumber);
			// Remember that this is just for testing and we need a quick
			// access, you can add an identity and known_hosts file to prevent
			// Man In the Middle attacks
			java.util.Properties config = new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			session.setConfig(config);
			session.setPassword(password);

			session.connect();
			Channel channel = session.openChannel("sftp");
			channel.connect();

			ChannelSftp sftp = (ChannelSftp) channel;
			InputStream in = sftp.get("/siebelfs/int_log/CAF.xml");
			BufferedInputStream bis = new BufferedInputStream(in);
			ByteArrayOutputStream buf = new ByteArrayOutputStream();
			int result = bis.read();
			while (result != -1) {
				buf.write((byte) result);
				result = bis.read();
			}
			System.out.println(buf.toString("UTF-8"));
			sftp.exit();
			channel.disconnect();
			session.disconnect();
		} catch (JSchException e) {
			System.out.println(e.getMessage().toString());
			e.printStackTrace();
		}

	}
}