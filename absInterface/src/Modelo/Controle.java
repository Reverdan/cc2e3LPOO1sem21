package Modelo;

public class Controle
{

    protected String mensagem;
    protected String resposta;

    public void calcularCalculadora(String num1, String num2, String operacao)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        this.mensagem = validacao.validarDoisNumeros(num1, num2);
        if (this.mensagem.equals(""))
        {
            this.mensagem = validacao.validarDivisao(validacao.numero1, operacao);
            if (this.mensagem.equals(""))
            {
                absPropriedades calcular = new Calcular(
                        validacao.numero, validacao.numero1, operacao);
                this.resposta = calcular.toString();
            }
        }
    }

    public void calcularPrimo(String num)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        this.mensagem = validacao.validarNumeroInteiroPositivo(num);
        if (this.mensagem.equals(""))
        {
            absPropriedades primo = new Primo(validacao.numeroIntPos);
            this.resposta = primo.toString();
        }
    }

    public void calcularFatorial(String num)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        this.mensagem = validacao.validarNumeroInteiroPositivo(num);
        if (this.mensagem.equals(""))
        {
            absPropriedades fatorial = new Fatorial(validacao.numeroIntPos);
            this.resposta = fatorial.toString();
        }
    }

    public void converterTemperatura(String tipo, String temp)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        this.mensagem = validacao.validarNumero(temp);
        if (this.mensagem.equals(""))
        {
            absPropriedades conversao = new Conversao(tipo, validacao.numero);
            this.resposta = conversao.toString();
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
