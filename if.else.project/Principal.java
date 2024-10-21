public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joaquim", 'M', 19, 1.78, 0, "Rua C, 145");
        Pessoa p2 = new Pessoa("Manuelita", 'F', 30, 1.67, 3, "Rua dos Camelos, 12");
        Pessoa p3 = new Pessoa("Pedro", 'M', 10, 1.91, 1, "Rua dos Gigantes");
        
        p1.imprimeInformacoes();
        p2.imprimeInformacoes();
        p3.imprimeInformacoes();
        
        if(p1.isFilhoUnico()) {
            System.out.println(p1.getSexo() =='F' ? "Filha unica" : "Filho unico");
        } else {
            System.out.println(p1.getSexo() == 'F' ? "Nao e filha unica" : "Nao e filho unico");
        }
        
        if(p2.isFilhoUnico()) {
            System.out.println(p2.getSexo() == 'F' ? "Filha unica" : "Filho unico");
        } else {
            System.out.println(p2.getSexo() == 'F' ? "Nao e filha unica" : "Nao e filho unico");
        }
        
        if(p3.isFilhoUnico()) {
            System.out.println(p3.getSexo() == 'F' ? "Filha unica" : "Filho unico");
        } else {
            System.out.println(p3.getSexo() == 'F' ? "Nao e filha unica" : "Nao e filho unico");
        }  
       
    }
        
}
