package br.com.abc.javacore.colecoes.teste;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTeste {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("Teklado", "Teclado");
        map.put("Mouze", "Mouse");
        map.put("vc", "Você");
        map.put("Meza", "Mesa");

        for (String key : map.values()) {
            System.out.println(key);
        }
        System.out.println("--------------------");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }
}
