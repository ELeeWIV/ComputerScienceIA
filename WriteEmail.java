package Main;

import java.util.Properties;
import javax.mail.*;

public class WriteEmail {
	final String username, password;
	private Properties properties;
	private Session session;
	private GUI gui;
	private String subject, date, room, teacher;
	private Multipart emailcontent;

	public WriteEmail() {
		username = "sendmailchem@gmail.com";
		password = "MNBvcxz123#";
		properties = new Properties();
		properties.put("mail.smpt.auth", "true");
		properties.put("mail.smpt.starttls.enable", "true");
		properties.put("mail.smpt.host", "smtp.gamil.com");
		properties.put("mail.smpt.port", "587")
		session = new Session();
		subject = gui.getDate + gui.getRoom + gui.getTeacher;
		emailcontent = new MimeBodyPart();
	}
	public void theEmail () {
		try{
			session.getInstance(properties, new javax.mail.Authenticator) {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			}
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(username));
			message.setSubject(subjcet);
			MimeBodyPart txtFile = new MimeBodyPart();
			txtFile.attachFIle("");
			message.setContent(emailcontent);
		}
		catch(MessageExeption e) {e.printStackTrace;}
		catch(IOException e) {e.printStackTrace;}

	}

}
