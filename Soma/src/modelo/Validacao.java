package modelo;

public class Validacao 
{
    public String num1;
    public String num2;
    public Double numero1;
    public Double numero2;
    public String mensagem;
    public String operacao;
    
    public void validar()
    {
        mensagem = "";
        try
        {
            numero1 = Double.parseDouble(num1);
            numero2 = Double.parseDouble(num2);
            if (operacao.equals("/") && numero2.equals(0))
                mensagem = "Divisão por zero";
        }
        catch (Exception e)
        {
            mensagem = "Erro de conversão";
        }
    }
}
