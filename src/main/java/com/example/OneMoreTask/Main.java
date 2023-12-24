package com.example.OneMoreTask;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        PDLRead pdl = new PDLRead();
        Company comp = pdl.parse("https://github.com/dyshleva/Lab13");
        System.out.println(comp);
    }
}
