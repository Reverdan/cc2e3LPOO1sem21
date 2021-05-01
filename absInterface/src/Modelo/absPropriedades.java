package Modelo;

public abstract class absPropriedades implements intMetodos
{

    protected String mensagem;
    protected String tipo;
    protected String temp;
    protected Double temperatura;
    protected Integer num;
    protected Double numero1;
    protected Double numero2;
    protected String operacao;

    public absPropriedades(Double numero1, Double numero2, String operacao)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacao = operacao;
        executar();
    }

    public absPropriedades(Integer num)
    {
        this.num = num;
        executar();
    }

    public absPropriedades(String tipo, Double temperatura)
    {
        this.tipo = tipo;
        this.temperatura = temperatura;
        executar();
    }

    public absPropriedades(String tipo, String temp)
    {
        this.tipo = tipo;
        this.temp = temp;
        executar();
    }

    public absPropriedades(String temp)
    {
        this.temp = temp;
        executar();
    }

    public String getMensagem()
    {
        return mensagem;
    }
}
