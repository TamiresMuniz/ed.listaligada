package ed.listaligada;

public class TestaListaLigada {
	
	public static void main(String[] args) {
		 ListaLigada lista = new ListaLigada();
		 
		 System.out.println(lista);
		 lista.adicionaNoComeco("mauricio");
		 System.out.println(lista);
		 lista.adicionaNoComeco("paulo");
		 System.out.println(lista);
		 lista.adicionaNoComeco("guilherme");
		 System.out.println(lista);
		 
		 lista.adiciona("Marcelo");
		 System.out.println(lista);
		 
		lista.adiciona(2, "Gabriel");
		System.out.println(lista);
	}

}
