package modelagemDiagramacao;

public class TesteIphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Iphone meuIphone = new Iphone();

        meuIphone.selecionarMusica("Bohemian Rhapsody");
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.ligar("1199999-9999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
	}
}
