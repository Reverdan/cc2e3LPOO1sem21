package modelo;

public class Controle 
{
    private Double numero1;
    private Double numero2;
    public String resultado;
    public String num1;
    public String num2;
    public String mensagem;
    
    public void calcular()
    {
        mensagem = "";
        try
        {
            numero1 = Double.parseDouble(num1);
            numero2 = Double.parseDouble(num2);
            resultado = String.valueOf(numero1 + numero2);
        }
        catch (Exception e)
        {
            mensagem = "Erro de conversão";
        }
    }
}
