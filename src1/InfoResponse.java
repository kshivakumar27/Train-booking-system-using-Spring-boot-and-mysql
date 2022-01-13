package net.javaguides.springbootcrudrestfulwebservices.dto;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class InfoResponse {





    private String name;
    private String rank;

    public InfoResponse(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }

    private int phoneno;
}