package br.com.estudos.GOrientacaoAObjetos.interfaces;

public interface DataLoader {
	// private -> default -> protected -> public 
	// todos atributos em intefaces são constantes
	public static final int MAX_DATA_SIZE = 10;
	
	public abstract void load();
    
    public default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }
    
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }


}