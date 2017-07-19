package br.com.seniocaires.slackbot;

import java.io.IOException;
import java.util.logging.Level;

import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.impl.SlackSessionFactory;

/**
 * @author Senio Caires
 */
public class Main {

	/**
	 * @author Senio Caires
	 * @param args
	 */
	public static void main(String[] args) {

		SlackSession sessao = SlackSessionFactory.createWebSocketSlackSession(Util.TOKEN);
		try {
			sessao.connect();
			for (String canal : Util.CANAIS) {
				SlackChannel channel = sessao.findChannelByName(canal);
				sessao.sendMessage(channel, Util.MENSAGEM);
			}
			sessao.disconnect();
		} catch (IOException ioException) {
			Util.APPLOG.log(Level.SEVERE, ioException.getMessage(), ioException);
		}
	}
}
