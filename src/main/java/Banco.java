public class Banco {
    int saldo;

    public Banco(){
        saldo = 10000;
    }

    public boolean Transaccion(int operacion, int monto){
        boolean operacionExitosa = true;
        switch (operacion){
            case 1:
                    operacionExitosa = Retiro(monto);
                    break;
            case 2:
                    Deposito(monto);
                    break;
            case 3:
                    System.out.println("El saldo es de "+ConsultarSaldo());
                    break;

        }
        return operacionExitosa;
    }

    public boolean Retiro(int monto){
        boolean operacionRealizada;
        int resultado = saldo - monto;

                if(resultado<0)
                    operacionRealizada = false;
                else {
                    saldo = resultado;
                    operacionRealizada = true;
                }

                return  operacionRealizada;
    }

    public void Deposito(int monto){
        saldo += monto;
    }

    public int ConsultarSaldo(){
        return saldo;
    }
}
