import java.util.*;
import java.util.Base64;

public class Main {
    private static List<Filme> filmes = new ArrayList<>();
    private static List<Usuario> usuarios = new ArrayList<>();
    private static List<Poltrona> poltronas = new ArrayList<>();
    private static List<Ingresso> ingressosComprados = new ArrayList<>();
    private static Usuario usuarioLogado;

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            poltronas.add(new Poltrona(i));
        }

        telaInicial();
    }

    private static void telaInicial() {
        System.out.println("MENU");
        System.out.println("------------------------");
        System.out.println("1. Entrar");
        System.out.println("2. Cadastrar");
        System.out.println("3. Sair");
        System.out.println("Escolha uma opção: ");

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                telaLogin();
                break;
            case 2:
                telaCadastro();
                break;
            case 3:
                System.out.println("Encerrando...");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida, tente novamente\n");
                telaInicial();
        }
    }

    public static void telaLogin() {
        System.out.println("LOGIN");
        System.out.println("------------------------");
        System.out.println("Usuário: ");
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine().toUpperCase();

        System.out.println("Senha: ");
        String password = scanner.nextLine();
        String senhaCriptografada = Base64.getEncoder().encodeToString(password.getBytes());

        Usuario usuario = autenticarUsuario(user, senhaCriptografada);
        if (usuario != null) {
            usuarioLogado = usuario;
            if (usuario instanceof Funcionario) {
                telaFuncionario();
            } else if (usuario instanceof Cliente) {
                telaCliente();
            }
        } else {
            System.out.println("Usuário ou senha inválidos, tente novamente.\n");
            telaInicial();
        }
    }

    public static Usuario autenticarUsuario(String user, String password) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUser().equalsIgnoreCase(user) && usuario.getPassword().equals(password)) {
                return usuario;
            }
        }
        return null;
    }

    public static void telaCadastro() {
        System.out.println("CADASTRO");
        System.out.println("------------------------");
        Scanner scanner = new Scanner(System.in);

        String nome = null;
        String role = null;
        int idade = 0;
        String user = null;
        String password = null;

        while (nome == null || role == null || idade == 0 || user == null || password == null) {
            System.out.println("Nome: ");
            nome = scanner.nextLine().toUpperCase();

            do {
                System.out.println("Categoria de usuário (cliente ou funcionário): ");
                role = scanner.nextLine().toUpperCase();
                if (!role.equals("CLIENTE") && !role.equals("FUNCIONÁRIO") && !role.equals("FUNCIONARIO")) {
                    System.out.println("Categoria inválida. Digite 'cliente' ou 'funcionário'.");
                }
            } while (!role.equals("CLIENTE") && !role.equals("FUNCIONÁRIO") && !role.equals("FUNCIONARIO"));

            boolean idadeValida = false;
            do {
                System.out.println("Idade: ");
                if (scanner.hasNextInt()) {
                    idade = scanner.nextInt();
                    scanner.nextLine();
                    idadeValida = true;
                } else {
                    System.out.println("Idade inválida. Digite novamente.");
                    scanner.nextLine();
                }
            } while (!idadeValida);

            do {
                System.out.println("Nome do usuário: ");
                user = scanner.nextLine();
                if (user.isEmpty()) {
                    System.out.println("Nome de usuário inválido, digite novamente.");
                } else if (usuarioJaExiste(user)) {
                    System.out.println("Usuário já existente, digite outro nome de usuário.");
                    user = null;
                }
            } while (user == null || user.isEmpty());

            do {
                System.out.println("Senha: ");
                password = scanner.nextLine();
                if (password.isEmpty()) {
                    System.out.println("Senha inválida, digite novamente.");
                }
            } while (password.isEmpty());

            String senhaCriptografada = Base64.getEncoder().encodeToString(password.getBytes());
            if (role.equals("CLIENTE")) {
                Cliente novoCliente = new Cliente(nome, role, idade, user, senhaCriptografada);
                usuarios.add(novoCliente);
            } else if (role.equals("FUNCIONÁRIO") || role.equals("FUNCIONARIO")) {
                Funcionario novoFuncionario = new Funcionario(nome, role, idade, user, senhaCriptografada);
                usuarios.add(novoFuncionario);
            } else {
                System.out.println("Categoria de usuário inválida, tente novamente.\n");
                telaCadastro();
            }
            System.out.println("Cadastro realizado com sucesso!\n");
            telaInicial();
        }
    }

    private static boolean usuarioJaExiste(String user) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUser().equalsIgnoreCase(user)) {
                return true;
            }
        }
        return false;
    }

    private static void telaFuncionario() {
        System.out.println("\nÁREA DO FUNCIONÁRIO");
        System.out.println("------------------------");
        System.out.println("1. Cadastrar novo filme");
        System.out.println("2. Excluir filme do cartaz");
        System.out.println("3. Listar filmes em cartaz");
        System.out.println("4. Sair");
        System.out.println("Escolha uma opção: ");

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                cadastrarFilme();
                telaFuncionario();
            case 2:
                if (filmes.isEmpty()) {
                    System.out.println("EXCLUIR FILME DO CARTAZ");
                    System.out.println("------------------------");
                    System.out.println("Não há filmes cadastrados para serem excluídos!");
                } else {
                    excluirFilme();
                }
                telaFuncionario();
            case 3:
                listarFilmes();
                telaFuncionario();
            case 4:
                usuarioLogado = null;
                telaInicial();
            default:
                System.out.println("Opção inválida. Tente novamente.");
                telaFuncionario();
        }
    }

    private static void cadastrarFilme() {
        System.out.println("CADASTRAR NOVO FILME");
        System.out.println("------------------------");
        System.out.println("Título: ");
        Scanner scanner = new Scanner(System.in);
        String titulo = scanner.nextLine().toUpperCase();
        System.out.println("Gênero: ");
        String genero = scanner.nextLine().toUpperCase();
        System.out.println("Classificação indicativa: ");
        int classificacao = scanner.nextInt();
        System.out.println("Tempo: ");
        int tempo = scanner.nextInt();
        scanner.nextLine();
        double valor;
        while (true) {
            System.out.println("Valor: ");
            String valorStr = scanner.nextLine();
            try {
                valor = Double.parseDouble(valorStr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Certifique-se de usar o formato correto (ex: 15.5).");
            }
        }
        System.out.println("Tecnologia (2D/3D): ");
        String tecnologia = scanner.nextLine().toUpperCase();
        while (!tecnologia.equals("2D") && !tecnologia.equals("3D")) {
            System.out.println("Opção inválida. A tecnologia escolhida deve ser 2D ou 3D.");
            System.out.println("Tecnologia (2D/3D): ");
            tecnologia = scanner.nextLine().toUpperCase();
        }
        System.out.println("Poltronas disponíveis: ");
        int poltronasDisponíveis = scanner.nextInt();
        scanner.nextLine();
        List<Poltrona> poltronas = new ArrayList<>();
        for (int i = 1; i <= poltronasDisponíveis; i++) {
            poltronas.add(new Poltrona(i));
        }

        Filme novoFilme = new Filme(titulo, genero, classificacao, tempo, valor, tecnologia, poltronas);
        filmes.add(novoFilme);
        System.out.println("Filme cadastrado com sucesso!");
    }

    private static void excluirFilme() {
        System.out.println("EXCLUIR FILME DO CARTAZ");
        System.out.println("------------------------");
        for (Filme filme : filmes) {
            System.out.println("ID: " + filme.getId());
            System.out.println("Título: " + filme.getTitulo());
            System.out.println("------------------------");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID do filme a ser excluído: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Filme filmeEncontrado = null;
        for (Filme filme : filmes) {
            if (filme.getId() == id) {
                filmeEncontrado = filme;
                break;
            }
        }

        if (filmeEncontrado != null) {
            boolean temPoltronasVendidas = false;
            for (Ingresso ingresso : ingressosComprados) {
                if (ingresso.getFilme() == filmeEncontrado) {
                    temPoltronasVendidas = true;
                    break;
                }
            }

            if (temPoltronasVendidas) {
                System.out.println("O filme possui poltronas vendidas e não pode ser excluído.");
            } else {
                filmes.remove(filmeEncontrado);
                System.out.println("Filme excluído com sucesso!");
            }
        } else {
            System.out.println("Filme não encontrado");
        }
    }

    private static void listarFilmes() {
        System.out.println("FILMES EM CARTAZ");
        System.out.println("------------------------");

        if (filmes.isEmpty()) {
            System.out.println("Não há filmes em cartaz.");
        } else {
            for (Filme filme : filmes) {
                System.out.println("ID: " + filme.getId());
                System.out.println("Título: " + filme.getTitulo());
                System.out.println("Gênero: " + filme.getGenero());
                System.out.println("Idade mínima: " + filme.getClassificacao());
                System.out.println("Tempo: " + filme.getTempo());
                System.out.println("Valor: " + filme.getValor());
                System.out.println("Tecnologia: " + filme.getTecnologia());
                System.out.println("Poltronas disponíveis: " + filme.getPoltronasDisponiveis().size());
                System.out.println("------------------------");
            }
        }
    }

    private static void telaCliente() {
        System.out.println("\nÁREA DO CLIENTE");
        System.out.println("------------------------");
        System.out.println("1. Comprar ingressos");
        System.out.println("2. Listar filmes em cartaz");
        System.out.println("3. Visualizar ingressos comprados");
        System.out.println("4. Sair");
        System.out.println("Escolha uma opção: ");

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                comprarIngressos();
                telaCliente();
                break;
            case 2:
                listarFilmesCliente();
                telaCliente();
                break;
            case 3:
                visualizarIngressos();
                telaCliente();
                break;
            case 4:
                usuarioLogado = null;
                telaInicial();
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                telaCliente();
        }
    }

    private static void comprarIngressos() {
        System.out.println("COMPRA DE INGRESSOS");
        System.out.println("------------------------");
        listarFilmesCliente();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ID do filme desejado ou 0 para sair.");
        int idFilme = scanner.nextInt();
        scanner.nextLine();

        if (idFilme == 0) {
            return;
        }

        Filme filmeSelecionado = null;
        for (Filme filme : filmes) {
            if (filme.getId() == idFilme) {
                filmeSelecionado = filme;
                break;
            }
        }

        if (filmeSelecionado != null) {
            if (usuarioLogado instanceof Cliente) {
                int idadeUsuario = ((Cliente) usuarioLogado).getIdade();
                if (idadeUsuario < filmeSelecionado.getClassificacao()) {
                    System.out.println("Compra bloqueada devido à classificação indicativa do filme selecionado.");
                    return;
                }
            }

            System.out.println("Filme selecionado: " + filmeSelecionado.getTitulo());
            poltronasDisponiveis(filmeSelecionado);
            System.out.println("Digite o número da poltrona desejada ou 0 para sair.");
            int numeroPoltrona = scanner.nextInt();
            scanner.nextLine();

            if (numeroPoltrona == 0) {
                return;
            }

            Poltrona poltronaSelecionada = null;
            for (Poltrona poltrona : filmeSelecionado.getPoltronasDisponiveis()) {
                if (poltrona.getNumero() == numeroPoltrona && poltrona.isDisponivel()) {
                    poltronaSelecionada = poltrona;
                    break;
                }
            }

            if (poltronaSelecionada != null) {
                poltronaSelecionada.setDisponivel(false);
                filmeSelecionado.getPoltronasDisponiveis().remove(poltronaSelecionada);
                ingressosComprados.add(new Ingresso(filmeSelecionado, poltronaSelecionada, (Cliente) usuarioLogado));
                System.out.println("Ingresso comprado com sucesso!");
            } else {
                System.out.println("Poltrona indisponível ou inválida, tente novamente.");
                comprarIngressos();
            }
        } else {
            System.out.println("Filme não encontrado, tente novamente.");
            comprarIngressos();
        }
    }

    private static void listarFilmesCliente() {
        System.out.println("FILMES DISPONÍVEIS");
        System.out.println("------------------------");
        for (Filme filme : filmes) {
            if (usuarioLogado instanceof Cliente && filme.getClassificacao() <= ((Cliente) usuarioLogado).getIdade()) {
                System.out.println("ID: " + filme.getId());
                System.out.println("Título: " + filme.getTitulo());
                System.out.println("Gênero: " + filme.getGenero());
                System.out.println("Idade mínima: " + filme.getClassificacao());
                System.out.println("Tempo: " + filme.getTempo());
                System.out.println("Valor: " + filme.getValor());
                System.out.println("Tecnologia: " + filme.getTecnologia());
                System.out.println("Poltronas disponíveis: " + filme.getPoltronasDisponiveis().size());
                System.out.println("---------------------------------------");
            }
        }
    }

    private static void poltronasDisponiveis(Filme filme) {
        System.out.println("POLTRONAS DISPONÍVEIS");
        System.out.println("------------------------");

        int poltronasPorLinha = 10;
        int contador = 0;

        for (Poltrona poltrona : filme.getPoltronasDisponiveis()) {
            if (poltrona.isDisponivel()) {
                System.out.print(poltrona.getNumero() + " ");
                contador++;

                if (contador == poltronasPorLinha) {
                    System.out.println();
                    contador = 0;
                }
            }
        }

        if (contador > 0) {
            System.out.println();
        }
    }

    private static void visualizarIngressos() {
        System.out.println("INGRESSOS COMPRADOS");
        System.out.println("------------------------");

        if (ingressosComprados.isEmpty()) {
            System.out.println("Nenhum ingresso comprado.");
            return;
        }

        for (Ingresso ingresso : ingressosComprados) {
            if (ingresso.getCliente().equals(usuarioLogado)) {
                System.out.println("Filme: " + ingresso.getFilme().getTitulo());
                System.out.println("Poltrona: " + ingresso.getPoltrona().getNumero());
                System.out.println("------------------------");
            }
        }
    }
}







