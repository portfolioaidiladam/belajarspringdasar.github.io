package programmerzamannow.spring.core.data.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

// belajar Circular Dependencies
@Data
@AllArgsConstructor
public class CyclicA {

    private CyclicB cyclicB;
}
