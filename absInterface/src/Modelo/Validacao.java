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
        this.mensagem = validarNumero(num1);
        this.mensagem += validarNumero(num2);
        return mensagem;
    }


}
