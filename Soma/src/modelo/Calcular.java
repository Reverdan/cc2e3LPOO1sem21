package modelo;

public class Calcular
{
    public Double numero1;
    public Double numero2;
    public String operacao;
    public String resultado;

    public void resolver()
    {
        if (operacao.equals("+"))
            resultado = String.valueOf(numero1 + numero2);
        if (operacao.equals("-"))
            resultado = String.valueOf(numero1 - numero2);
        if (operacao.equals("*"))
            resultado = String.valueOf(numero1 * numero2);
        if (operacao.equals("/"))
            resultado = String.valueOf(numero1 / numero2);
    }
}
