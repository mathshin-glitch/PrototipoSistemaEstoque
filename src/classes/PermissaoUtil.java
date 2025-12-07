package classes;

import javax.swing.JButton;

public class PermissaoUtil {

    public static void aplicarPermissoes(Usuario usuario, JButton... botoes) {

        if (usuario == null) {
            return;
        }

        String cargo = usuario.getCargo().toUpperCase();

        for (JButton botao : botoes) {

            String permissao = botao.getActionCommand(); // comando único

            switch (cargo) {

                case "ADMINISTRADOR":
                    botao.setEnabled(true);
                    break;

                case "OPERADOR":
                    if (permissao.equals("EXCLUIR_USUARIO")
                            || permissao.equals("CADASTRAR_USUARIO")) {
                        botao.setEnabled(false);
                    } else {
                        botao.setEnabled(true);
                    }
                    break;

                case "USUARIO":
                    if (permissao.equals("CADASTRAR_USUARIO")
                            || permissao.equals("EXCLUIR_USUARIO")
                            || permissao.equals("CADASTRAR_PRODUTO")
                            || permissao.equals("CADASTRAR_FORNECEDOR")
                            || permissao.equals("MOVIMENTAR_ESTOQUE")) {
                        botao.setEnabled(false);
                    } else {
                        botao.setEnabled(true);
                    }
                    break;

                default:
                    botao.setEnabled(false);
            }
        }
    }
}
