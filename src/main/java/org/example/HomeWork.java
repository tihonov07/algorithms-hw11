package org.example;


import lombok.SneakyThrows;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class HomeWork {

    /**
     * <h1>Задание 1.</h1>
     * Решить задачу Step из файла contest6_tasks.pdf
     */
    @SneakyThrows
    public void stepDanceValue(InputStream in, OutputStream out) {
        try (var sc = new Scanner(in); var pw = new PrintWriter(out)) {
            int N = sc.nextInt();
            int Q = sc.nextInt();

            Heap heap = new Heap(N);
            heap.init(1, 0, Heap.MXN);

            int switchPos = -1;
            for (int i = 0; i < Q; i++) {
                switchPos = sc.nextInt();
                int maxUniq = heap.change(switchPos);
                pw.println(maxUniq);
            }
        }

    }

}
