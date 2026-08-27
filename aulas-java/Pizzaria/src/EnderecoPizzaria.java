

public class EnderecoPizzaria {
	private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public EnderecoPizzaria(String rua, String bairro, String cidade, String estado, String cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    @Override
    public String construirFrase() {
        return rua + ", " + bairro + ", " + cidade + " - " + estado + " (" + cep + ")";
    }
}
