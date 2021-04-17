package Modelo;

public class Validacao extends absPropriedades
{

    public Validacao(String lado1, String lado2, String lado3)
    {
        super(lado1, lado2, lado3);
        validar();
    }
    
    private void validar()
    {
        this.setMensagem("");
        try
        {
            this.setL1(Double.parseDouble(this.getLado1()));
            this.setL2(Double.parseDouble(this.getLado2()));
            this.setL3(Double.parseDouble(this.getLado3()));
            if (this.getL1() + this.getL2() > this.getL3() &&
                    this.getL1() + this.getL3() > this.getL2() &&
                    this.getL2() + this.getL3() > this.getL1())
                this.setMensagem("");
            else
                this.setMensagem("Isto não é um triângulo");
        }
        catch (Exception e)
        {
            this.setMensagem("Digite valores válidos");
        }
    }

}
