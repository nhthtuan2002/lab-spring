package com.example.springproduct.search;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
public class SearchCriteria {
    private String key;
    private String operation;
    private Object value;
}
