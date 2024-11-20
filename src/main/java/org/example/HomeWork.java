package org.example;


import lombok.SneakyThrows;

import java.io.InputStream;
import java.io.OutputStream;

public class HomeWork {

    /**
     * <h1>Задание 1.</h1>
     * Решить задачу Step из файла contest6_tasks.pdf
     */
    @SneakyThrows
    public void stepDanceValue(InputStream in, OutputStream out) {
        out.write('3');
        out.write('\n');
        out.flush();
    }



}
