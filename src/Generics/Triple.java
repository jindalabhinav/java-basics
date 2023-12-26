package Generics;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Triple <TYPE> {
    private TYPE left;
    private TYPE middle;
    private TYPE right;

}
