package br.com.abc.javacore.strings.teste;

public class StringBuilderTeste {
    public static void main(String[] args) {
        String s = "Uma frase comum";
        StringBuilder sb = new StringBuilder(16);
        sb.append("Uma frase comum");
        sb.append("1234567");
        System.out.println(sb.reverse());
        System.out.println(sb.delete(0,2));
        System.out.println(sb.insert(2,"###"));
        sb.append("def").insert(3,"ghi").reverse().delete(2,4);
        System.out.println(sb);
    }
}
