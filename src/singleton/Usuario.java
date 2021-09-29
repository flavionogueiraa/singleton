package singleton;

public class Usuario {
	private static Usuario instanciaUnica;
	private String nome;
	private String cpf;
	
	private Usuario() {
		this.nome = "Joãozinho";
		this.cpf = "123.456.789-10";
	}
	
	public static synchronized Usuario getInstance() {
		if(instanciaUnica == null) {
			instanciaUnica = new Usuario();
		}
		
		return instanciaUnica;
	}
	
	public void visualizarUsuario() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
	}
}
