package programmerzamannow.spring.core.data;

import lombok.Getter;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

// belajar Object Provider
@Component
public class MultiFoo {
    // saya pengen ngambil semua list foo
    @Getter
    private List<Foo> foos;

    public MultiFoo(ObjectProvider<Foo> objectProvider){
        // misalnya temen temen mau ngambil semuanya
        foos = objectProvider.stream().collect(Collectors.toList());
        // artinya disini jika foonya lebih dari satu disini dia akan ngambil semua foonya
    }
}
