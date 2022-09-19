package models;

public class AssosiacoesModel {

    private int cnpj;
    private String razaoSocial;
    private String presidente;
    private String vicePresidente;
    private String secretario;
    private Colaborador colaborador;
    private String parceiros;
    private Endereco endereco;

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getVicePresidente() {
        return vicePresidente;
    }

    public void setVicePresidente(String vicePresidente) {
        this.vicePresidente = vicePresidente;
    }

    public String getSecretario() {
        return secretario;
    }

    public void setSecretario(String secretario) {
        this.secretario = secretario;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public String getParceiros() {
        return parceiros;
    }

    public void setParceiros(String parceiros) {
        this.parceiros = parceiros;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "AssosiacoesModel{" +
                "cnpj=" + cnpj +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", presidente='" + presidente + '\'' +
                ", vicePresidente='" + vicePresidente + '\'' +
                ", secretario='" + secretario + '\'' +
                ", colaborador=" + colaborador +
                ", parceiros='" + parceiros + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
