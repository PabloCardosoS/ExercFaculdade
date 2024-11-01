import javax.swing.*;
import java.awt.Color;

public class Principal {
    public static void main(String[] args) {
        Sala sala = new Sala(Teclado.leString("Digite o nome da sala: "));
        System.out.println("Sala criada: " + sala);
        
        for (int i = 0; i < 6; i++) {
            String nomeAluno = Teclado.leString("Digite o nome do aluno " + (i + 1) + ": ");
            int idadeAluno = Teclado.leInt("Digite a idade do aluno " + (i + 1) + ": ");
            
            String tipoCadeira = Teclado.leString("Digite o tipo de cadeira (mesa/rodinhas): ");
            
            Aluno aluno = new Aluno(nomeAluno, idadeAluno);
            Cadeira cadeiraOcupada = sala.entraAluno(aluno, tipoCadeira);
            
            if (cadeiraOcupada != null) {
                System.out.println(nomeAluno + " entrou na sala e ocupou a cadeira: " 
                + cadeiraOcupada);
            } else {
                System.out.println("No havia lugar na sala para " + nomeAluno);
            }
        }
        double areaTotalMesas = 0;
        for (Cadeira cadeira : sala.getCadeiras()) {
            if (cadeira instanceof CadeiraComMesa) {
                CadeiraComMesa cadeiraComMesa = (CadeiraComMesa) cadeira;
                areaTotalMesas += cadeiraComMesa.getLargura() * cadeiraComMesa.getProfundidade();
            }
        }
        System.out.println("Area total das mesas acopladas: " + areaTotalMesas);
        
        for (Cadeira cadeira : sala.getCadeiras()) {
            if (cadeira instanceof CadeiraComRodinhas) {
                CadeiraComRodinhas cadeiraComRodinhas = (CadeiraComRodinhas) cadeira;
                System.out.println("Cadeira com rodinhas - Ultima manutençao: " 
                + cadeiraComRodinhas.getUltimaManutencao()); 
            }
        }
        String nomeBuscar = Teclado.leString("Digite o nome do aluno para procurar na sala: ");
        
        for (Cadeira cadeira : sala.getCadeiras()) {
            if (cadeira.getAluno() != null && cadeira.getAluno().getNome().equalsIgnoreCase(nomeBuscar)) {
                Cor corCadeira = cadeira.getCor();
                JFrame a = new JFrame();
                a.setSize(200, 200);
                a.getContentPane().setBackground(new Color(corCadeira.getR(), corCadeira.getG(), corCadeira.getB()));
                a.setVisible(true);
                break;
            }
        }
    }
}
