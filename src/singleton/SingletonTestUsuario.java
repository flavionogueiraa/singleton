package singleton;

public class SingletonTestUsuario {
	public static void main(String[] args) {
		Usuario usuario = Usuario.getInstance();
		Usuario novo_usuario = Usuario.getInstance();
		Usuario novo_usuario_de_fato = Usuario.getInstance();
		
		usuario.visualizarUsuario();
		novo_usuario.visualizarUsuario();
		novo_usuario_de_fato.visualizarUsuario();
	}
}
