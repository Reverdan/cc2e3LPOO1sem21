package Modelo;

public class Validacao
{
    private String mensagem;
    protected Double numero;
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


}
