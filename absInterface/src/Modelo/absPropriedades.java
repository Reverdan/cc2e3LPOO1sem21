package Modelo;

public abstract class absPropriedades implements intMetodos
{

    protected String mensagem;
    protected String tipo;
    protected String temp;
    protected Double temperatura;
    protected String resposta;

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

    public String getResposta()
    {
        return resposta;
    }

    
    
    
    
    

}
