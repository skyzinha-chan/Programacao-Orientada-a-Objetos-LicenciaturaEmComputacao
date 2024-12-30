package excecoes;

public class ExcecoesPersonalizadas extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ExcecoesPersonalizadas (String msg) {
		super(msg);
	}

}