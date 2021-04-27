package Modelo;

public class Controle
{
    protected String mensagem;
    protected String resposta;
    
    public void calcularCalculadora(String num1, String num2, String operacao)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
    }
    
    public void calcularPrimo(String num)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        this.mensagem = validacao.validarNumeroInteiroPositivo(num);
        if (this.mensagem.equals(""))
        {
            Primo primo = new Primo(validacao.numeroIntPos);
            this.resposta = primo.resposta;
        }
    }
    
    public void calcularFatorial(String num)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        this.mensagem = validacao.validarNumeroInteiroPositivo(num);
        if (this.mensagem.equals(""))
        {
            Fatorial fatorial = new Fatorial(validacao.numeroIntPos);
            this.resposta = fatorial.resposta;
        }
    }
    
    public void converterTemperatura(String tipo, String temp)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        this.mensagem = validacao.validarNumero(temp);
        if (this.mensagem.equals(""))
        {
            Conversao conversao = new Conversao(tipo, validacao.numero);
            this.resposta = conversao.resposta;
        }
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
