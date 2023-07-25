package JavaOnline.src.br.com.abc.javacore.streams.classes;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class StreamTeste6Collectors01 {
    //Redução e sumarização de streams em um valor único
    public static void main(String[] args) {
        //Método de contar pessoas em uma lista que vimos anteriormente:
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        System.out.println(pessoas.stream().count());
        //Método de contar pessoas utilizando collectors
        System.out.println(pessoas.stream().collect(counting()));
        //Método anterior para ver qual o salário mais alto entre as pessoas
        Optional<Pessoa> max = pessoas.stream().max(comparing(Pessoa::getSalario));
        System.out.println(max.get().getSalario());
        //Mesmo método, mas utilizando comparator:
        Optional<Pessoa> collect = pessoas.stream().collect(maxBy(comparing(Pessoa::getSalario)));
        System.out.println(collect.get().getSalario());
        //Salário mais baixo:
        Optional<Pessoa> collect1 = pessoas.stream().collect(minBy(comparing(Pessoa::getSalario)));
        System.out.println(collect1.get().getSalario());
        //Soma dos salários:
        System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).sum());
        System.out.println(pessoas.stream().collect(summingDouble(Pessoa::getSalario)));
        //Média:
        System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).average());
        System.out.println(pessoas.stream().collect(averagingDouble(Pessoa::getSalario)));
        //Método que traz todos esses dados:
        DoubleSummaryStatistics collect2 = pessoas.stream().collect(summarizingDouble(Pessoa::getSalario));
        System.out.println(collect2);
        //Chamando um de cada vez:
        System.out.println(collect2.getMax());
        System.out.println(collect2.getCount());
        //Concatenar Strings
        System.out.println(pessoas.stream().map(Pessoa::getNome).collect(joining()));
        System.out.println(pessoas.stream().map(Pessoa::getNome).collect(joining(", ")));
    }
}
