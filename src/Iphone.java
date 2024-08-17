import funcoes.FuncoesIphone;

public class Iphone {
    public static void main(String[] args) {
        String musicaAtual = "Aquarela do Brasil";
		String numeroLigacao = "(99) 88888-7777";
		String urlPagina = "https://www.dio.me/";

        FuncoesIphone iphone = new FuncoesIphone();
		
		// Iniciando o aparelho
        iphone.ligarAparelho();
		
		// Executando Funções do iPhone
        iphone.abrirReprodutorMusical(musicaAtual);
        iphone.abrirAparelhoTelefonico(numeroLigacao);
        iphone.abrirNavegadorInternet(urlPagina);
		
		// Desligando o aparelho
		iphone.desligarAparelho();
    }
}
