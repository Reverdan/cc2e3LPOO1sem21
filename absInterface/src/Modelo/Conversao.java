package Modelo;

import java.text.DecimalFormat;

public class Conversao extends absPropriedades
{
    private String resposta;

    public Conversao(String tipo, Double temperatura)
    {
        super(tipo, temperatura);
    }

    @Override
    public void executar()
    {
//        F = (C – 32) / 1,8
//        C = F  * 1,8 + 32
        
        DecimalFormat df = new DecimalFormat("0.##");

        if (this.tipo.equals("CF"))
        {
            resposta = df.format((this.temperatura - 32) / 1.8);
        }
        else
        {
            resposta = df.format(this.temperatura * 1.8 + 32);
                    
        }
    }

    @Override
    public String toString()
    {
        return resposta;
    }
    
    

}
