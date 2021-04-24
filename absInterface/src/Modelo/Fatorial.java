package Modelo;

public class Fatorial extends absPropriedades
{

    public Fatorial(Integer num)
    {
        super(num);
    }

    @Override
    public void executar()
    {
        int base = this.num;
        for (int i = 1; i < base; i++)
        {
            num *= i;
        }
        this.resposta = num.toString();
    }

}
