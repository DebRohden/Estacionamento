package Principal.Controller;

import Principal.View.menuPrincipal;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import classesUteis.Impressao;
import Principal.Model.Cliente;
import Principal.Model.Funcionario;
import Principal.Model.Ticket;
import Principal.Model.Vaga;
import Principal.Model.Veiculo;

import Principal.View.CadVeiculo;

public class TicketController {

    ArrayList<veiculosEstacionados> veiculoEstacionamento = new ArrayList<veiculosEstacionados>();
    ArrayList<clientesRel> clientes = new ArrayList<clientesRel>();
    ArrayList<vagas> vagasEstacionamento = new ArrayList<vagas>();
    ArrayList<Veiculo> veiculosCad = new ArrayList<Veiculo>();
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
    ArrayList<valorTotal> valorTotal = new ArrayList<valorTotal>();

    ExportaImportaArquivosJson json = new ExportaImportaArquivosJson();
    Impressao impressao = new Impressao();

    public static String ticketEntrada = "";
    double valorHora;

    public void geradorTicket(Funcionario nomeFuncionario, double valorHora) throws IOException {

        this.valorHora = valorHora;

        veiculoEstacionamento = json.importaJsonVeiculoTicket(veiculoEstacionamento);
        vagasEstacionamento = json.importaVagas(vagasEstacionamento);
        veiculosCad = json.importaJsonVeiculo(veiculosCad);
        String Placa = "";
        boolean achou = false;
        
        try {
            Placa = JOptionPane.showInputDialog("Insira a placa");
            boolean cadastrado = false;

            if (verificaPlacasCadastradas(Placa)) {
                if (veiculoEstacionamento.size() == 0) {
                    if (verificaVagaLivre()) {
                        System.out.println(entradaListaNula(Placa, nomeFuncionario));
                    }
                } 
                else {
                    if (veiculoEstacionamento.size() > 0) {
                        for (veiculosEstacionados veiculoEstacionado : veiculoEstacionamento) { // corre todos os veiculos
                            if (Placa.equals(veiculoEstacionado.getPlaca())) {
                                System.out.println(saidaTicket(Placa, nomeFuncionario));
                                achou = true;
                                break;
                            } 
                            else {
                                if (verificaVagaLivre() && (!achou)) {
                                    System.out.println(entradaTicket(Placa, nomeFuncionario));
                                    break;
                                }
                            }
                        }
                    }
                }
            } 
            else {
                JOptionPane.showMessageDialog(null, "Placa nao cadastrada!");
                cadastrado = true;
                CadVeiculo cad = new CadVeiculo();
                cad.setVisible(true);

            }

            json.exportaVeiculosTicket(veiculoEstacionamento);
            json.exportaVagas(vagasEstacionamento);

            if (!cadastrado) {
                menuPrincipal menu = new menuPrincipal();
                menu.setVisible(true);
            }
        } catch (java.lang.NullPointerException e) {
            menuPrincipal menu = new menuPrincipal();
            menu.setVisible(true);
        }

    }

    public boolean verificaPlacasCadastradas(String placa) {

        for (Veiculo v : veiculosCad) {

            if ((placa.equals(v.getPlaca()))) {
                return true;
            }
        }
        return false;
    }

    public boolean pegaClientes(model_cliente clienteTicket) throws IOException {

        clientes = json.importaRelatorioPessoas(clientes);
        clientesRel relatorio = new clientesRel();
        boolean achou = true;

        if (clientes.size() == 0) {
            relatorio.setProprietario(clienteTicket);
            relatorio.setContador(1);
            clientes.add(relatorio);
        } else {
            for (clientesRel clientesProcura : clientes) {
                if (clienteTicket.getNome().equals(clientesProcura.getProprietario().getNome())) {
                    clientesProcura.setContador(clientesProcura.getContador() + 1);
                    achou = false;
                    break;
                }
            }
            if (achou) {
                relatorio.setProprietario(clienteTicket);
                relatorio.setContador(1);
                clientes.add(relatorio);
            }
        }

        json.exportaClientesRelatorio(clientes);

        return true;
    }

    public boolean verificaVagaLivre() throws IOException {

        json.importaVagas(vagasEstacionamento);

        int cont = 0;

        for (Vaga vaga : vagasEstacionamento) {
            if (!(vaga.isLivre()) || (!vaga.isPermicao())) {
                cont++;
            }
            if (cont == vagasEstacionamento.size()) {
                JOptionPane.showMessageDialog(null, "Sem vagas livres!");
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public boolean entradaListaNula(String Placa, Funcionario funcionario) throws IOException {

        veiculosEstacionados veiculoEstacionado = new veiculosEstacionados();
        Date dia = new Date();
        int cont = 0;

        for (vagas vagaEs : vagasEstacionamento) {
            if (vagaEs.getLivre().equals("livre") && (vagaEs.isPermicao() == true)) {
                for (Veiculo veiculosAdd : veiculosCad) {
                    if (veiculosAdd.getPlaca().equals(Placa)) {
                        veiculoEstacionado.setProprietario(veiculosAdd.getProprietario());
                        veiculoEstacionado.setCor(veiculosAdd.getCor());
                        veiculoEstacionado.setModelo(veiculosAdd.getModelo());
                        veiculoEstacionado.setPlaca(veiculosAdd.getPlaca());
                        veiculoEstacionado.setHoraEntrada(dia);
                        veiculoEstacionado.setVaga(vagaEs.getVaga());
                        veiculoEstacionado.setFuncionarioEntrada(funcionario);
                        vagaEs.setLivre(veiculosAdd.getPlaca());
                        System.out.println(pegaClientes(veiculosAdd.getProprietario()));
                        imprimirTicketEntrada(veiculosAdd, vagaEs, funcionario);
                        cont++;
                        break;
                    }
                }
            }
            if (cont == 1) {
                break;
            }
        }

        veiculoEstacionamento.add(veiculoEstacionado);
        JOptionPane.showMessageDialog(null, "Ticket a ser imprimido");

        return true;
    }

    public boolean entradaTicket(String Placa, Funcionario funcionario) throws IOException {

        veiculosEstacionados veiculoEstacionado = new veiculosEstacionados();
        Date dia = new Date();
        int cont = 0;

        for (vagas vagaEs : vagasEstacionamento) { // procura a vaga livre
            if (vagaEs.getLivre().equals("livre") && (vagaEs.isPermicao() == true)) {
                for (Veiculo veiculosAdd : veiculosCad) { // procura o carro que contem aquela placa
                    if (veiculosAdd.getPlaca().equals(Placa)) {
                        veiculoEstacionado.setProprietario(veiculosAdd.getProprietario());
                        veiculoEstacionado.setCor(veiculosAdd.getCor());
                        veiculoEstacionado.setModelo(veiculosAdd.getModelo());
                        veiculoEstacionado.setPlaca(veiculosAdd.getPlaca());
                        veiculoEstacionado.setHoraEntrada(dia);
                        veiculoEstacionado.setVaga(vagaEs.getVaga());
                        veiculoEstacionado.setFuncionarioEntrada(funcionario);
                        vagaEs.setLivre(veiculosAdd.getPlaca());
                        System.out.println(pegaClientes(veiculosAdd.getProprietario()));
                        imprimirTicketEntrada(veiculosAdd, vagaEs, funcionario); // chamada TICKET IMPRESSAO
                        cont++;
                        break;
                    }
                }
            }
            if (cont == 1) {
                break;
            }
        }

        veiculoEstacionamento.add(veiculoEstacionado);
        JOptionPane.showMessageDialog(null, "Ticket a ser imprimido");

        return true;
    }

    public boolean saidaTicket(String Placa, Funcionario funcionario) throws IOException {

        Date saida = new Date();
        vagas VagaAux = new vagas();
        long saidaS = saida.getTime();

        for (vagas vagaEs : vagasEstacionamento) {
            if (vagaEs.getLivre().equals(Placa)) {
                vagaEs.setLivre("livre");
                VagaAux = vagaEs;
                break;
            }
        }

        for (veiculosEstacionados veiculo : veiculoEstacionamento) {
            if (veiculo.getPlaca().equals(Placa)) {

                long entradS = veiculo.getHoraEntrada().getTime();
                long dif = (saidaS - entradS);
                dif = ((dif / 1000) / 60);
                double valorTotal = ((dif) * (valorHora / 60));

                JOptionPane.showMessageDialog(null, "Ticket de saida ser imprimido");
                imprimirTicketSaida(veiculo, VagaAux, saida, funcionario, valorTotal);

                veiculoEstacionamento.remove(veiculo);
                break;
            }
        }

        return true;
    }

    private void imprimirTicketEntrada(Veiculo veiculo, vagas vagaEstacionamento, Funcionario funcionario) {

        Date dia = new Date();
        String data = date.format(dia);

        String imprimir;

        imprimir = ("    ESTACIONAMENTO - TICKET DE ENTRADA \n\r"
                + "------------------------------------- \n\r"
                + "HORARIO ENTRADA : " + data + "\n\r"
                + "PROPRIETARIO " + veiculo.getProprietario().getNome() + "\n\r"
                + "PLACA " + veiculo.getPlaca() + "\n\r"
                + "MODELO " + veiculo.getModelo().getModelo() + "\n\r"
                + "MARCA " + veiculo.getModelo().getMarca().getMarca() + "\n\r"
                + "COR " + veiculo.getCor() + "\n\r"
                + "VAGA " + vagaEstacionamento.getVaga() + "\n\r"
                + "FUNCIONARIO ENTRADA " + funcionario.getNome()
                + "\n\r "
                + "\n\r"
                + "\n\r"
                + "\n\r"
                + "\n\r"
                + "\n\r"
                + "\n\r"
                + "\n\r"
                + "\n\r"
                + "\n\r"
                + "" + "\f");
        this.ticketEntrada = imprimir;        
        System.out.println(ticketEntrada);
        impressao.imprimir(imprimir);

    }

    public void imprimeTicketSaida(Ticket ticket, Vaga vaga, Date hora, Funcionario funcionario, double valor) throws IOException {

        ticket.setHoraSaida(hora);
        String imprimir;

        imprimir = ("ESTACIONAMENTO - TICKET DE SAIDA \n\r"
                + "------------------------------------- \n\r"
                + "HORARIO ENTRADA : "   + ticket.getHoraEntrada()                                   + "\n\r"
                + "HORARIO SAIDA : "     + ticket.getHoraSaida()                                     + "\n\r"
                + "PROPRIETARIO "        + ticket.getVeiculo().getProprietario().getNome()           + "\n\r"
                + "PLACA "               + ticket.getVeiculo().getPlaca()                            + "\n\r"
                + "MODELO "              + ticket.getVeiculo().getModelo().getDescricao()            + "\n\r"
                + "MARCA "               + ticket.getVeiculo().getModelo().getMarca().getDescricao() + "\n\r"
                + "COR "                 + ticket.getVeiculo().getCor()                              + "\n\r"
                + "VAGA "                + ticket.getVaga().getNumero()                              + "\n\r"
                + "FUNCIONARIO ENTRADA " + ticket.getFuncionarioEntrada().getNome()                  + "\n\r"
                + "FUNCIONARIO SAIDA "   + funcionario.getNome()                                     + "\n\r"
                + "VALOR A PAGAR : R$ "  + valor                                                     + "\n\r"
                + "\n\r"
                + "\n\r"
                + "\n\r"
                + "\n\r"
                + "\n\r"
                + "" + "\f");

        System.out.println(imprimir);
        this.ticketEntrada = imprimir;
        impressao.imprimir(imprimir);
    }
    
}
