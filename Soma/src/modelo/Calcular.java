package modelo;

import java.text.DecimalFormat;

public class Calcular extends absPropriedades
{
    public Calcular(Double numero1, Double numero2, String operacao)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacao = operacao;
        this.resolver();
    }

    private void resolver()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        
        if (operacao.equals("+"))
            resultado = df.format(numero1 + numero2);
        if (operacao.equals("-"))
            resultado = df.format(numero1 - numero2);
        if (operacao.equals("*"))
            resultado = df.format(numero1 * numero2);
        if (operacao.equals("/"))
            resultado = df.format(numero1 / numero2);
    }
}
