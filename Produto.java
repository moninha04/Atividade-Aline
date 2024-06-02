public class Produto{
     
        private int id;
        private String nome;
        private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Nome: " + nome + ", Preco: " + preco;
    };

}


public class Livro{

    public String titulo;
    public String autor;
    public int paginas;
    public int lancamento;
    public String editora;

public Livro(String titulo, String autor, int paginas, int lancamento, String editora) {
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = paginas;
    this.lancamento = lancamento;
    this.editora = editora;
}

public String getTitulo(){
    return titulo;
}

public void setTitulo(String titulo){
    this.titulo = titulo;
}

public String getAutor(){
    return autor;
}

public void setAutor(String autor){
    this.autor = autor;
}

public int getPaginas(){
    return paginas;
}

public void setPaginas(int paginas){
    this.paginas = paginas;
}

public int getLancamento(){
    return lancamento;
}

public void setLancamento(int lancamento){
    this.lancamento = lancamento;
}

public String getEditora(){
    return editora;
}

public void setEditora(String editora){
    this.editora = editora;
}

@Override
public String toString(){
    return "Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + paginas + ", Lancamento: " + lancamento + ", Editora: " + editora;
}
}


public class Ebook{

    public String formato;
    public String arquivo;
    public int disponibilidade;
    public double download;
    public String url;

public Ebook(String formato, String arquivo, int disponibilidade, double download,  String url) {
    this.formato = formato;
    this.arquivo = arquivo;
    this.disponibilidade = disponibilidade;
    this.download = download;
    this.url = url;
}

public string getFormato(){
    return formato;
}

public void setFormato(String formato){
    this.formato = formato;
}

public String getArquivo(){
    return arquivo;
}

public void setArquivo(String arquivo){
    this.arquivo = arquivo;
}

public int getDisponibilidade(){
    return disponibilidade;
}

public void setDisponibilidade(int disponibilidade){
    this.disponibilidade = disponibilidade;
}

public double getDownload(){
    return download;
}

public void setDownload(double download){
    this.download = download;
}

public String getUrl(){
    return url;
}

public void setUrl(String url){
    this.url = url;
}

@Override
public String toString(){
    return "Formato: " + formato + ", Arquivo: " + arquivo + ", Disponibilidade: " + disponibilidade + ", Download " + download + ", Url: " + url;
}
}


public class Cliente {
    
    public String nome;
    public  int idade;
    public  String genero;
    public  String endereco;
    public  String telefone;

    public Cliente(String nome, int idade, String genero, String endereco, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override 
    public String toString(){
        return "Nome:" + nome +",Idade:" + idade +",Genero:" + genero +",Endereco:" + endereco +",Telefone:" + telefone;
    }
}


public class Pedido{

    public int idCliente;
    public int idPedido;
    public String localizacao;
    public boolean infoEnvio;
    public boolean infoEntrega;
    public String detalhesPagamento;
    public String[] produtosSolicitados;

public Pedido(int idCliente, int idPedido, String localizacao, boolean infoEnvio, boolean infoEntrega, String detalhesPagamento, String[] produtosSolicitados) {
    this.idCliente = idCliente;
    this.idPedido = idPedido;
    this.localizacao = localizacao;
    this.infoEnvio = infoEnvio;
    this.infoEntrega = infoEntrega;
    this.detalhesPagamento = detalhesPagamento;
    this.produtosSolicitados = produtosSolicitados;
}

public int getidCliente(){
    return idCliente;
}

public void setidCliente(int idCliente){
    this.idCliente = idCliente;
}

public int getidPedido(){
    return idPedido;
}

public  void setidPedido(int idPedido){
    this.idPedido = idPedido;
}

public String getLocalizacao(){
    return localizacao;
}

public void setLocalizacao(String localizacao){
    this.localizacao = localizacao;
}

public Boolean getinfoEnvio(){
    return infoEnvio;
}

public  void setinfoEnvio(boolean infoEnvio){
    this.infoEnvio = infoEnvio;
}

public Boolean getinfoEntrega(){
    return infoEntrega;
}

public void setinfoEntrega(boolean infoEntrega){
    this.infoEntrega = infoEntrega;
}

public String getDetalhesPagamento(){
    return detalhesPagamento;
}

public void setDetalhesPagamento(String detalhesPagamento){
    this.detalhesPagamento = detalhesPagamento;
}

public String[] getProdutosSolicitados(){
    return produtosSolicitados;
}

public void setProdutosSolicitados(String[] produtosSolicitados){
    this.produtosSolicitados = produtosSolicitados;
}

@Override
public String toString(){
    return "idCliente: " + idCliente + ", idPedido: " + idPedido + ", Localizacao: " + localizacao + ", infoEnvio: " + infoEnvio + ", infoEntrega: " + infoEntrega + ", detalhesPagamento: " + detalhesPagamento + ", produtosSolicitados: " + produtosSolicitados;
}
}


