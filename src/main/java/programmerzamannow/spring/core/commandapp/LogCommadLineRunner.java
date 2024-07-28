package programmerzamannow.spring.core.commandapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// belajar fitur Command Line Runner, kalau mau menambahkan data argument yang ada di main methodnya
// temen temen bisa gunakan CommandLineRunner
@Slf4j
@Component
public class LogCommadLineRunner implements CommandLineRunner {
    // jadi method run ini nanti secara otomatis dieksekusi ketika aplikasi springnya berjalan
    // dan paramater String.. args akan dikirim dari si main methodnya
    @Override
    public void run(String... args) throws Exception {
      log.info("Log Command Line Runner : {}", Arrays.toString(args));
    }
}
