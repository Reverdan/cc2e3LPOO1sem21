package modelo;

public abstract class absPropriedades 
{
    protected Double numero1;
    protected Double numero2;
    protected String operacao;
    protected String resultado;
    protected String num1;
    protected String num2;
    protected String mensagem;
    
    public String getResultado()
    {
        return resultado;
    }
    
    public String getMensagem()
    {
        return mensagem;
    }

    protected Double getNumero1()
    {
        return numero1;
    }

    protected Double getNumero2()
    {
        return numero2;
    }
}
