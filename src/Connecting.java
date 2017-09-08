
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

import javax.security.auth.login.LoginException;


public class Connecting {

	public static void main (String[] args) {	
		
	JDA discord = null;
		
	try {
		discord = new JDABuilder(AccountType.BOT).setToken(TodorokisToken.Hero).buildBlocking();
	} catch (LoginException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RateLimitedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	discord.addEventListener(new TodorokisResponses());
	}
}