package Modelo;

public class Validacao
{
    private String mensagem;
    protected Double numero;
    protected Double numero1;
    protected Integer numeroIntPos;
    
    public String validarNumeroInteiroPositivo(String num)
    {
        this.mensagem = "";
        try
        {
            this.numeroIntPos = Integer.parseInt(num);
            if (numeroIntPos < 0)
                this.mensagem = "Número deve ser positivo";
        }
        catch (Exception e)
        {
            this.mensagem = "Número inválido";
        }
        return mensagem;
    }
    
    public String validarNumero(String num)
    {
        this.mensagem = "";
        try
        {
            this.numero = Double.parseDouble(num);
        }
        catch (Exception e)
        {
            this.mensagem = "Número inválido";
        }
        return mensagem;
    }
    
    public String validarDoisNumeros(String num1, String num2)
    {
        this.mensagem = "";
        try
        {
            this.numero = Double.parseDouble(num1);
            this.numero1 = Double.parseDouble(num2);
        }
        catch (Exception e)
        {
            this.mensagem = "Número inválido";
        }
        return mensagem;
    }
    
    public String validarDivisao(Double numero2, String operacao)
    {
        if (numero2.equals(0.0) && operacao.equals("/"))
            return "Divisão por zero";
        else
            return "";
    }


}
