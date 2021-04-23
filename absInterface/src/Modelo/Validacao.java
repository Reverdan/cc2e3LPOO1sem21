package Modelo;

public class Validacao extends absPropriedades
{

    public Validacao(String temp)
    {
        super(temp);
    }
    
    @Override
    public void executar()
    {
        this.mensagem = "";
        try
        {
            this.temperatura = Double.parseDouble(this.temp);
        }
        catch (Exception e)
        {
            this.mensagem = "Número inválido";
        }
    }


}
