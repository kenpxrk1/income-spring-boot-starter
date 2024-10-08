package ru.kenpxrk.income.client;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
public class IncomeDTO implements Serializable {
    private int id;
    private int income;

    @JsonCreator
    public IncomeDTO(@JsonProperty("id") int id, @JsonProperty("income") int income) {
        this.id = id;
        this.income = income;
    }
}
