
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoJoao = new Conta();
		contaDoJoao.saldo = 100;
		contaDoJoao.deposita(50);
		
		System.out.println(contaDoJoao.saldo);
		
		contaDoJoao.saca(20);
		System.out.println(contaDoJoao.saldo);
		
		//boolean conseguiuRetirar = contaDoJoao.saca(20);
		//System.out.println(conseguiuRetirar);
		
		Conta contaDaVictoria = new Conta();
		contaDaVictoria.deposita(1000);
		
		
		boolean sucessoTransferencia = contaDaVictoria.transfere(300, contaDoJoao);
		if(sucessoTransferencia) {
			System.out.println("Transferencia com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDaVictoria.saldo);
		System.out.println(contaDoJoao.saldo);
		
		contaDoJoao.titular = "Joao Henrique Santos";
		System.out.println(contaDoJoao.titular);
		
		
	}
}
