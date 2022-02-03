package Projeto;

public class Cliente implements Pessoa{

	String usuario;
	String senha;
	int s;
	
	
	@Override
	public String inserirNome(String nome)
	{
		return nome;
	}
	@Override
	public String inserirEndereco(String endereco)
	{
		return endereco;
	}
	@Override
	public String inserirPagamento(String pagamento)
	{
		return pagamento;
	}
	@Override
	public String inserirContato(String contato)
	{
		return contato;
	}
	@Override
	public String inserirEmail(String email)
	{
		return email;
	}
	@Override
	public int inserirSoma(int n1, int n2)
	{
		return s=n1+n2;
	}
	@Override
	public int inserirSoma(int x, int y, int z) 
	{
		return s=x+y+z;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
