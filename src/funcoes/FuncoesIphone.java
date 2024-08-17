package funcoes;

public class FuncoesIphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void ligarAparelho() {
        System.out.println("Iniciando o iPhone...");
		System.out.println("---------------------");
    }

    public void desligarAparelho() {
        System.out.println("Desligando o iPhone...");
    }
    
    public void abrirReprodutorMusical(String musicaAtual) {
		System.out.println("Abrindo Função Reprodutor Musical");
		selecionarMusica(musicaAtual);
		tocar();
		pausar();
		System.out.println("Fechando Função Reprodutor Musical");
		System.out.println();
	}
	
	public void abrirAparelhoTelefonico(String numeroLigacao) {
		System.out.println("Abrindo Função Telefone");
		ligar(numeroLigacao);
		atender();
		iniciarCorreioVoz();
		System.out.println("Fechando Função Telefone");
		System.out.println();
	}
	
	public void abrirNavegadorInternet(String url) {
		System.out.println("Abrindo Função Navegador de Internet");
		exibirPagina(url);
		adicionarNovaAba();
		atualizarPagina();
		System.out.println("Fechando Função Navegador de Internet");
		System.out.println();
	}

    @Override
	public void ligar(String numero) {
		System.out.println("Ligando para o número " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo a chamada");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando o correio de voz");
	}

    @Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página na URL " + url);		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba de navegação");		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a página atual");
	}

    @Override
	public void tocar() {
		System.out.println("Reproduzindo a música");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando a música");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Musica escolhida: " + musica);
	}
}
