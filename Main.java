
public class Main {
	
	
		public static void main(String[] args) {
			Funcionario umFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR,
					100, 1);
			System.out.println(umFuncionario.calcularGratificacao());
			
			Funcionario outroFuncionario = new Funcionario(Funcionario.DBA,
					100, 1);
			System.out.println(outroFuncionario.calcularGratificacao());
			
			Funcionario outroFuncionario2 = new Funcionario(Funcionario.GERENTE,
					100, 1);
			System.out.println(outroFuncionario2.calcularGratificacao());
		}
	}


