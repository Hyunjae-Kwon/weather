package zerobase.weather.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Memo {
    private int id;
    private String text;
}
