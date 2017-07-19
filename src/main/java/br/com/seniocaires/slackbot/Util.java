package br.com.seniocaires.slackbot;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Senio Caires
 */
public class Util {

	/**
	 * @author Senio Caires
	 */
	public static final String MENSAGEM = System.getenv("MENSAGEM");

	/**
	 * @author Senio Caires
	 */
	public static final String[] CANAIS = System.getenv("CANAIS").split(",");

	/**
	 * @author Senio Caires
	 */
	public static final String TOKEN = System.getenv("TOKEN");

	public static final Logger APPLOG = Logger.getGlobal();

	static {
		Handler systemOut = new ConsoleHandler();
		systemOut.setLevel(Level.INFO);
		APPLOG.addHandler(systemOut);
		APPLOG.setLevel(Level.INFO);
		APPLOG.setUseParentHandlers(false);
	}

	/**
	 * @author Senio Caires
	 */
	private Util() {
		// classe utilitária
	}
}
