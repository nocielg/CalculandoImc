
public class Principal {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Paciente 1
		Paciente vanessa = new Paciente(1.76,69);
		System.out.printf("O imc de Vanessa e "+ vanessa.calcularImc());
		System.out.println(" O diagnostico de Vanessa e,"+ vanessa.diagnostico());
		
		//Paciente 2
		Paciente pedro = new Paciente(1.80,70);
		System.out.printf("O imc de Pedro e "+ pedro.calcularImc());
		System.out.println(" O diagnostico de Pedro e,"+ pedro.diagnostico());
		
		//Paciente 3
		Paciente rafael = new Paciente(1.55,40);
		System.out.printf("O imc de Rafael e " + rafael.calcularImc());
		System.out.println(" O diagnostico de Rafael e,"+ rafael.diagnostico());
		
		

	}

}
