package br.com.edmar;

public class Main {
	public static void main(String[] args) {
		Class<ClasseTabela> clazz = ClasseTabela.class;
		
		if(clazz.isAnnotationPresent(ITabela.class)) {
			ITabela tabela = clazz.getAnnotation(ITabela.class);
			
			System.out.println("Nome da tabela: " + tabela.nome());
		}else {
			System.out.println("A anotação @ITabela não está presente");
		}
	}
}
